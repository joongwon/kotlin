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

package org.jetbrains.kotlin.idea.navigation

import com.intellij.codeInsight.CodeInsightActionHandler
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.util.TextRange
import com.intellij.openapi.util.text.StringUtil
import com.intellij.testFramework.LightProjectDescriptor
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor
import org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor
import org.jetbrains.kotlin.idea.test.ProjectDescriptorWithStdlibSources
import org.jetbrains.kotlin.test.KotlinTestUtils
import org.junit.Assert

abstract class AbstractGotoActionTest : LightCodeInsightFixtureTestCase() {
    protected abstract val actionName: String

    protected fun doTest(testPath: String) {
        val parts = KotlinTestUtils.loadBeforeAfterText(testPath)

        myFixture.configureByText(KotlinFileType.INSTANCE, parts[0])

        val gotoAction = ActionManager.getInstance().getAction(actionName) as CodeInsightActionHandler
        gotoAction.invoke(project, myFixture.editor, myFixture.file)

        val fileEditorManager = FileEditorManager.getInstance(myFixture.project) as FileEditorManagerEx
        val currentEditor = fileEditorManager.selectedTextEditor ?: editor

        if (currentEditor == editor) {
            val text = myFixture.getDocument(myFixture.file).text
            val afterText = StringBuilder(text).insert(editor.caretModel.offset, "<caret>").toString()

            Assert.assertEquals(parts[1], afterText)
        }
        else {
            val fileOffset = currentEditor.caretModel.offset
            val lineNumber = currentEditor.document.getLineNumber(fileOffset)
            val lineStart = currentEditor.document.getLineStartOffset(lineNumber)
            val lineEnd = currentEditor.document.getLineEndOffset(lineNumber)
            val inLineOffset = fileOffset - lineStart

            val line = currentEditor.document.getText(TextRange(lineStart, lineEnd))
            val withCaret = with(StringBuilder()) {
                append(line)
                insert(inLineOffset, "<caret>")
                toString()
            }

            Assert.assertEquals(parts[1], withCaret)
        }
    }

    override fun getProjectDescriptor() = getProjectDescriptorFromTestName()

    protected fun getProjectDescriptorFromTestName(): LightProjectDescriptor {
        val testName = StringUtil.toLowerCase(getTestName(false))

        if (testName.endsWith("runtime")) {
            return KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
        }
        else if (testName.endsWith("stdlib")) {
            return ProjectDescriptorWithStdlibSources.INSTANCE
        }

        return KotlinLightProjectDescriptor.INSTANCE
    }
}
