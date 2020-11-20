package tz.co.asoft

/**
 * @property T is the typography of the respective platform
 */
data class Theme<T>(
    val name: String,
    val color: ColorPalette,
    val text: T
)