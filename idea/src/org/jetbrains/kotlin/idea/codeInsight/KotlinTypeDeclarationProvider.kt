/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.codeInsight

import com.intellij.codeInsight.navigation.actions.TypeDeclarationProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor
import org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptor
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.parents
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.DescriptorToSourceUtils
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.resolve.source.PsiSourceElement
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

class KotlinTypeDeclarationProvider : TypeDeclarationProvider {
    override fun getSymbolTypeDeclarations(symbol: PsiElement): Array<PsiElement>? {
        var symbol = symbol

        if (symbol.containingFile !is KtFile) return emptyArray()

        var firstParameterType = false

        if (symbol is PsiWhiteSpace) {
            val findElementAt = symbol.containingFile.findElementAt(symbol.textOffset - 1)
            if (findElementAt?.text == "{") {
                symbol = findElementAt.parents.firstIsInstanceOrNull<KtFunctionLiteral>() ?: return emptyArray()
                firstParameterType = true
            }
        }

        if (symbol !is KtElement) return emptyArray()

        if (symbol.text == "it") {
            val mainReference = symbol.mainReference

            if (mainReference != null) {
                val targetDescriptor = mainReference.resolveToDescriptors(symbol.analyze(bodyResolveMode = BodyResolveMode.PARTIAL)).singleOrNull()
                val valueParameterDescriptor = targetDescriptor as? ValueParameterDescriptor
                if (valueParameterDescriptor != null) {
                    val source = valueParameterDescriptor.type.constructor.declarationDescriptor?.source

                    if (source is PsiSourceElement) {
                        val typeSource = source.psi
                        if (typeSource != null) {
                            return arrayOf(typeSource)
                        }
                    }
                }
            }
        }

        val parent = symbol.parent
        if (symbol is KtTypeReference && parent is KtDeclaration) {
            val declarationDescriptor = parent.resolveToDescriptor(BodyResolveMode.PARTIAL)
            if (declarationDescriptor.isExtension) {
                val extensionReceiverParameter = (declarationDescriptor as CallableDescriptor).extensionReceiverParameter

                val classifierDescriptor = extensionReceiverParameter!!.type.constructor.declarationDescriptor ?: return emptyArray()
                val typeElement = DescriptorToSourceUtils.descriptorToDeclaration(classifierDescriptor) ?: return emptyArray()

                return arrayOf(typeElement)
            }
        }

        val bindingContext = symbol.analyze(BodyResolveMode.PARTIAL)
        val callableDescriptor = bindingContext.get(BindingContext.DECLARATION_TO_DESCRIPTOR, symbol) as? CallableDescriptor ?: return emptyArray()

        val type = when {
                       callableDescriptor is AnonymousFunctionDescriptor && firstParameterType ->
                           callableDescriptor.valueParameters.firstOrNull()?.type
                       callableDescriptor is AnonymousFunctionDescriptor && symbol is KtFunctionLiteral ->
                           callableDescriptor.extensionReceiverParameter?.type
                       else -> callableDescriptor.returnType
                   } ?: return emptyArray()

        val classifierDescriptor = type.constructor.declarationDescriptor ?: return emptyArray()
        return DescriptorToSourceUtilsIde.getAllDeclarations(symbol.project, classifierDescriptor).toTypedArray()
    }
}