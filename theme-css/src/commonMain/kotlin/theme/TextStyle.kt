package theme

import kotlinx.css.LinearDimension
import kotlinx.css.Color
import kotlinx.css.FontWeight
import kotlinx.css.FontStyle
import kotlinx.css.TextAlign
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration

data class TextStyle(
    val color: Color? = null,
    val fontSize: LinearDimension? = null,
    val fontWeight: FontWeight? = null,
    val fontStyle: FontStyle? = null,
    val fontFamily: String? = null,
    val letterSpacing: LinearDimension? = null,
    val background: Color? = null,
    val textDecoration: TextDecoration? = null,
    val textAlign: TextAlign? = null,
    val lineHeight: LineHeight? = null
)