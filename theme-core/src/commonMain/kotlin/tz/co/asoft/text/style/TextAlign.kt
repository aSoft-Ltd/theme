@file:Suppress("PackageDirectoryMismatch")

package tz.co.asoft

enum class TextAlign {
    /** Align the text on the left edge of the container. */
    Left,
    /** Align the text on the right edge of the container. */
    Right,
    /** Align the text in the center of the container. */
    Center,
    /**
     * Stretch lines of text that end with a soft line break to fill the width of
     * the container.
     *
     * Lines that end with hard line breaks are aligned towards the [Start] edge.
     */
    Justify,
    /**
     * Align the text on the leading edge of the container.
     *
     * For Left to Right text, this is the left edge.
     *
     * For Right to Left text, like Arabic, this is the right edge.
     */
    Start,
    /**
     * Align the text on the trailing edge of the container.
     *
     * For Left to Right text, this is the right edge.
     *
     * For Right to Left text, like Arabic, this is the left edge.
     */
    End
}