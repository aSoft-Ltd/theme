package tz.co.asoft

/**
 * @property T is the typography of the respective platform
 * @property I is the iconography of the respective platform
 */
open class Theme<T : Any, I : Any>(
    val name: String,
    val color: ColorPalette,
    val text: T,
    val icon: I
)