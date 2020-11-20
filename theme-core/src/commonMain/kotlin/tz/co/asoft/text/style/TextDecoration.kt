@file:Suppress("PackageDirectoryMismatch")

package tz.co.asoft

/**
 * Uses a mask to store information
 */
class TextDecoration internal constructor(val mask: Int) {
    companion object {
        val None: TextDecoration = TextDecoration(0x0)

        /**
         * Draws a horizontal line below the text.
         */
        val Underline: TextDecoration = TextDecoration(0x1)

        /**
         * Draws a horizontal line over the text.
         */
        val LineThrough: TextDecoration = TextDecoration(0x2)

        /**
         * Creates a decoration that includes all the given decorations.
         * @param decorations The decorations to be added
         */
        fun combine(decorations: List<TextDecoration>): TextDecoration {
            val mask = decorations.fold(0) { acc, decoration ->
                acc or decoration.mask
            }
            return TextDecoration(mask)
        }

        fun combine(vararg decoration: TextDecoration) = combine(decoration.toList())
    }

    /**
     * Creates a decoration that includes both of the TextDecorations.
     */
    operator fun plus(decoration: TextDecoration): TextDecoration {
        return TextDecoration(this.mask or decoration.mask)
    }

    /**
     * Check whether this [TextDecoration] contains the given decoration.
     *
     * @param other The [TextDecoration] to be checked.
     */
    operator fun contains(other: TextDecoration) = (mask or other.mask) == mask

    override fun toString(): String {
        if (mask == 0) return "TextDecoration.None"

        val values: MutableList<String> = mutableListOf()

        if ((mask and Underline.mask) != 0) values.add("Underline")

        if ((mask and LineThrough.mask) != 0) values.add("LineThrough")

        if ((values.size == 1)) return "TextDecoration.${values[0]}"

        return "TextDecoration[${values.joinToString(separator = ", ")}]"
    }
}