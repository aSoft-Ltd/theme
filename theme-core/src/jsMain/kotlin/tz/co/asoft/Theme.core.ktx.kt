package tz.co.asoft

import kotlinx.css.*
import kotlinx.css.Color as CSSColor

operator fun Color.invoke() = rgba(red.to255Int(), green.to255Int(), blue.to255Int(), alpha.toDouble())

inline val Theme<Typography>.primaryColor get() = color.primary()
inline val Theme<Typography>.primaryVariantColor get() = color.primaryVariant()
inline val Theme<Typography>.onPrimaryColor get() = color.onPrimary()
inline val Theme<Typography>.secondaryColor get() = color.secondary()
inline val Theme<Typography>.secondaryVariantColor get() = color.secondaryVariant()
inline val Theme<Typography>.onSecondaryColor get() = color.onSecondary()
inline val Theme<Typography>.backgroundColor get() = color.background()
inline val Theme<Typography>.onBackgroundColor get() = color.onBackground()
inline val Theme<Typography>.backgroundVariantColor get() = color.backgroundVariant()
inline val Theme<Typography>.onBackgroundVariantColor get() = color.onBackgroundVariant()
inline val Theme<Typography>.surfaceColor get() = color.surface()
inline val Theme<Typography>.onSurfaceColor get() = color.onSurface()
inline val Theme<Typography>.errorColor get() = color.error()
inline val Theme<Typography>.onErrorColor get() = color.onError()

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

inline val Theme<Typography>.dropdown_clazz: RuleSet
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
