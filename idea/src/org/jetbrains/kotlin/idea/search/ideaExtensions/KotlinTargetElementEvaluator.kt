/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.idea.search.ideaExtensions

import com.intellij.codeInsight.TargetElementEvaluatorEx
import com.intellij.codeInsight.TargetElementUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiReference
import com.intellij.util.BitUtil
import org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.intentions.isAutoCreatedItUsage
import org.jetbrains.kotlin.idea.references.KtDestructuringDeclarationReference
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType
import org.jetbrains.kotlin.psi.psiUtil.isAbstract
import org.jetbrains.kotlin.resolve.DescriptorToSourceUtils
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.resolve.source.PsiSourceElement
import java.util.*

class KotlinTargetElementEvaluator : TargetElementEvaluatorEx {
    override fun includeSelfInGotoImplementation(element: PsiElement): Boolean = !(element is KtClass && element.isAbstract())

    override fun getElementByReference(ref: PsiReference, flags: Int): PsiElement? {
        // prefer destructing declaration entry to its target if element name is accepted
        if (ref is KtDestructuringDeclarationReference && BitUtil.isSet(flags, TargetElementUtil.ELEMENT_NAME_ACCEPTED)) {
            return ref.element
        }

        if (BitUtil.isSet(flags, TargetElementUtil.REFERENCED_ELEMENT_ACCEPTED)) {
            val element: PsiElement = ref.element
            if (element.text == "it") {
                if (element is KtNameReferenceExpression && isAutoCreatedItUsage(element)) {
                    val itDescriptor = element.mainReference.resolveToDescriptors(
                            element.analyze(bodyResolveMode = BodyResolveMode.PARTIAL)).singleOrNull()
                    if (itDescriptor != null) {
                        val simpleFunctionDescriptor = itDescriptor.containingDeclaration as? SimpleFunctionDescriptor
                        if (simpleFunctionDescriptor != null) {
                            val funSource = simpleFunctionDescriptor.source
                            if (funSource is PsiSourceElement) {
                                val psi = funSource.psi?.parent as? KtLambdaExpression
                                if (psi != null) {
                                    return psi.leftCurlyBrace.treeNext.psi // Place caret after the open curly brace
                                }
                            }
                        }
                    }

                }
            }

            if (element.text == "this") {
                if (element is KtNameReferenceExpression) {
                    val target = element.mainReference.resolveToDescriptors(element.analyze(bodyResolveMode = BodyResolveMode.PARTIAL)).singleOrNull()
                    val simpleFunctionDescriptor = target as? SimpleFunctionDescriptor

                    if (simpleFunctionDescriptor != null && simpleFunctionDescriptor.isExtension) {
                        val funSource = simpleFunctionDescriptor.source
                        if (funSource is PsiSourceElement) {
                            val psi = funSource.psi
                            if (psi is KtNamedFunction) {
                                return psi.receiverTypeReference
                            }
                        }
                    }
                }
            }
        }

        return null
    }

    override fun isIdentifierPart(file: PsiFile, text: CharSequence?, offset: Int): Boolean {
        // '(' is considered identifier part if it belongs to primary constructor without 'constructor' keyword
        return file.findElementAt(offset)?.getNonStrictParentOfType<KtPrimaryConstructor>()?.textOffset == offset
    }
}
