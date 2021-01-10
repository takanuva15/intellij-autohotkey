package de.nordgedanken.auto_hotkey.ide.highlighter

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor

enum class AhkColor(humanName: String, default: TextAttributesKey? = null) {
    LINE_COMMENT("Comments//Line Comments", DefaultLanguageHighlighterColors.LINE_COMMENT),
    ;

    val textAttributesKey = TextAttributesKey.createTextAttributesKey("de.nordgedanken.auto_hotkey.$name", default)
    val attributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
}
