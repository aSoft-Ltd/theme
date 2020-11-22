package tz.co.asoft

import kotlinx.css.*
import kotlinx.css.Color as CSSColor


inline val Color.color get() = rgba(red.to255Int(), green.to255Int(), blue.to255Int(), alpha.toDouble())

inline val Theme<Typography>.primaryColor get() = color.primary.color
inline val Theme<Typography>.primaryVariantColor get() = color.primaryVariant.color
inline val Theme<Typography>.onPrimaryColor get() = color.onPrimary.color
inline val Theme<Typography>.secondaryColor get() = color.secondary.color
inline val Theme<Typography>.secondaryVariantColor get() = color.secondaryVariant.color
inline val Theme<Typography>.onSecondaryColor get() = color.onSecondary.color
inline val Theme<Typography>.backgroundColor get() = color.background.color
inline val Theme<Typography>.onBackgroundColor get() = color.onBackground.color
inline val Theme<Typography>.backgroundVariantColor get() = color.backgroundVariant.color
inline val Theme<Typography>.onBackgroundVariantColor get() = color.onBackgroundVariant
inline val Theme<Typography>.surfaceColor get() = color.surface.color
inline val Theme<Typography>.onSurfaceColor get() = color.onSurface.color
inline val Theme<Typography>.errorColor get() = color.error.color
inline val Theme<Typography>.onErrorColor get() = color.onError.color

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

val Theme<Typography>.dropdown_clazz: RuleSet
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
