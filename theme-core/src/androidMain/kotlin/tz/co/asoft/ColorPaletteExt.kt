package tz.co.asoft

import androidx.ui.material.ColorPalette as MaterialColorPalette

fun ColorPalette.toMaterialPalette(): MaterialColorPalette = object : MaterialColorPalette {
    override val background = this@toMaterialPalette.background.color
    override val error = this@toMaterialPalette.error.color
    override val isLight = this@toMaterialPalette.isLight
    override val onBackground = this@toMaterialPalette.onBackground.color
    override val onError = this@toMaterialPalette.onError.color
    override val onPrimary = this@toMaterialPalette.onPrimary.color
    override val onSecondary = this@toMaterialPalette.onSecondary.color
    override val onSurface = this@toMaterialPalette.onSurface.color
    override val primary = this@toMaterialPalette.primary.color
    override val primaryVariant = this@toMaterialPalette.primaryVariant.color
    override val secondary = this@toMaterialPalette.secondary.color
    override val secondaryVariant = this@toMaterialPalette.secondaryVariant.color
    override val surface = this@toMaterialPalette.surface.color
}