package theme

import color.invoke
import kotlinx.css.*
import kotlinx.css.Color as CSSColor

inline val CSSTheme.primaryColor get() = color.primary()
inline val CSSTheme.primaryVariantColor get() = color.primaryVariant()
inline val CSSTheme.onPrimaryColor get() = color.onPrimary()
inline val CSSTheme.secondaryColor get() = color.secondary()
inline val CSSTheme.secondaryVariantColor get() = color.secondaryVariant()
inline val CSSTheme.onSecondaryColor get() = color.onSecondary()
inline val CSSTheme.backgroundColor get() = color.background()
inline val CSSTheme.onBackgroundColor get() = color.onBackground()
inline val CSSTheme.backgroundVariantColor get() = color.backgroundVariant()
inline val CSSTheme.onBackgroundVariantColor get() = color.onBackgroundVariant()
inline val CSSTheme.surfaceColor get() = color.surface()
inline val CSSTheme.onSurfaceColor get() = color.onSurface()
inline val CSSTheme.errorColor get() = color.error()
inline val CSSTheme.onErrorColor get() = color.onError()

inline val TextStyle.clazz: RuleSet
    get() = {
        this@clazz.color?.let { color = it }
        this@clazz.fontSize?.let { fontSize = it }
        this@clazz.fontWeight?.let { fontWeight = it }
        this@clazz.fontStyle?.let { fontStyle = it }
        this@clazz.fontFamily?.let { fontFamily = it }
        this@clazz.letterSpacing?.let { letterSpacing = it }
        this@clazz.background?.let { backgroundColor = it }
        this@clazz.textAlign?.let { textAlign = it }
        this@clazz.lineHeight?.let { lineHeight = it }
    }

inline val CSSTheme.dropdown_clazz: RuleSet
    get() = {
        outline = Outline.none
        color = CSSColor.inherit
        child("option") {
            backgroundColor = this@dropdown_clazz.backgroundColor
            color = onBackgroundColor
            hover {
                backgroundColor = this@dropdown_clazz.primaryColor
                color = onPrimaryColor
            }
        }
    }
