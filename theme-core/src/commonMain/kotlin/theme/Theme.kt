package theme

/**
 * @property T is the typography of the respective platform
 */
open class Theme<T : Any>(
    val name: String,
    val color: ColorPalette,
    val text: T
)