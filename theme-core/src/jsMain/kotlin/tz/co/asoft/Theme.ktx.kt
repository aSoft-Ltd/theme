package tz.co.asoft

import kotlinx.css.*
import kotlinx.css.Color as CSSColor

val Color.color get() = CSSColor(toHexString())

val Theme.primaryColor get() = CSSColor(color.primary.toHexString())
val Theme.primaryVariantColor get() = CSSColor(color.primaryVariant.toHexString())
val Theme.onPrimaryColor get() = CSSColor(color.onPrimary.toHexString())
val Theme.secondaryColor get() = CSSColor(color.secondary.toHexString())
val Theme.secondaryVariantColor get() = CSSColor(color.secondaryVariant.toHexString())
val Theme.onSecondaryColor get() = CSSColor(color.onSecondary.toHexString())
val Theme.backgroundColor get() = CSSColor(color.background.toHexString())
val Theme.onBackgroundColor get() = CSSColor(color.onBackground.toHexString())
val Theme.backgroundVariantColor get() = CSSColor(color.backgroundVariant.toHexString())
val Theme.onBackgroundVariantColor get() = CSSColor(color.onBackgroundVariant.toHexString())
val Theme.surfaceColor get() = CSSColor(color.surface.toHexString())
val Theme.onSurfaceColor get() = CSSColor(color.onSurface.toHexString())
val Theme.errorColor get() = CSSColor(color.error.toHexString())
val Theme.onErrorColor get() = CSSColor(color.onError.toHexString())

val TextStyle.clazz: RuleSet
    get() = {
        fontSize = this@clazz.fontSize
    }

val Theme.dropdown_clazz: RuleSet
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
