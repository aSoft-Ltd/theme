package theme

import color.Color

data class ColorPalette(
    val primary: Color,
    val primaryVariant: Color,
    val onPrimary: Color,
    val secondary: Color,
    val secondaryVariant: Color,
    val onSecondary: Color,
    val background: Color,
    val onBackground: Color,
    val backgroundVariant: Color,
    val onBackgroundVariant: Color,
    val surface: Color,
    val onSurface: Color,
    val error: Color,
    val onError: Color,
    val isLight: Boolean
)