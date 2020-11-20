package tz.co.asoft

import kotlinx.css.*
import kotlinx.css.Color as CSSColor


inline val Color.color get() = rgba(red.to255Int(), green.to255Int(), blue.to255Int(), alpha.toDouble())

inline val Theme<*>.primaryColor get() = color.primary.color
inline val Theme<*>.primaryVariantColor get() = color.primaryVariant.color
inline val Theme<*>.onPrimaryColor get() = color.onPrimary.color
inline val Theme<*>.secondaryColor get() = color.secondary.color
inline val Theme<*>.secondaryVariantColor get() = color.secondaryVariant.color
inline val Theme<*>.onSecondaryColor get() = color.onSecondary.color
inline val Theme<*>.backgroundColor get() = color.background.color
inline val Theme<*>.onBackgroundColor get() = color.onBackground.color
inline val Theme<*>.backgroundVariantColor get() = color.backgroundVariant.color
inline val Theme<*>.onBackgroundVariantColor get() = color.onBackgroundVariant
inline val Theme<*>.surfaceColor get() = color.surface.color
inline val Theme<*>.onSurfaceColor get() = color.onSurface.color
inline val Theme<*>.errorColor get() = color.error.color
inline val Theme<*>.onErrorColor get() = color.onError.color

val TextStyle.clazz: RuleSet
    get() = {
        this@clazz.color?.let { color = it }
        this@clazz.fontSize?.let { fontSize = it }
        this@clazz.fontWeight?.let { fontWeight = it }
        this@clazz.fontStyle?.let { fontStyle = it }
        this@clazz.fontFamily?.let { fontFamily = it }
        this@clazz.letterSpacing?.let { letterSpacing = it }
//        this@clazz.baselineShift
        this@clazz.background?.let { backgroundColor = it }
//        this@clazz.textDecoration
        this@clazz.textAlign?.let { textAlign = it }
//        this@clazz.textDirection?.let {  }
        this@clazz.lineHeight?.let { lineHeight = it }
    }

val Theme<*>.dropdown_clazz: RuleSet
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
