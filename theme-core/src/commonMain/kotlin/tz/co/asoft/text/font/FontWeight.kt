@file:Suppress("PackageDirectoryMismatch")

package tz.co.asoft

data class FontWeight(val weight: Int) : Comparable<FontWeight> {
    init {
        require(weight in 1..1000) {
            "Font weight can be in range [1, 1000]. Current value: $weight"
        }
    }

    companion object {
        /** [Thin] */
        val W100 = FontWeight(100)

        /** [ExtraLight] */
        val W200 = FontWeight(200)

        /** [Light] */
        val W300 = FontWeight(300)

        /** [Normal] / regular / plain */
        val W400 = FontWeight(400)

        /** [Medium] */
        val W500 = FontWeight(500)

        /** [SemiBold] */
        val W600 = FontWeight(600)

        /** [Bold] */
        val W700 = FontWeight(700)

        /** [ExtraBold] */
        val W800 = FontWeight(800)

        /** [Black] */
        val W900 = FontWeight(900)

        /** Alias for [W100] */
        val Thin = W100

        /** Alias for [W200] */
        val ExtraLight = W200

        /** Alias for [W300] */
        val Light = W300

        /** The default font weight - alias for [W400] */
        val Normal = W400

        /** Alias for [W500] */
        val Medium = W500

        /** Alias for [W600] */
        val SemiBold = W600

        /**
         * A commonly used font weight that is heavier than normal - alias for [W700]
         */
        val Bold = W700

        /** Alias for [W800] */
        val ExtraBold = W800

        /** Alias for [W900] */
        val Black = W900

        /** A list of all the font weights. */
        val values: List<FontWeight> = listOf(
            W100,
            W200,
            W300,
            W400,
            W500,
            W600,
            W700,
            W800,
            W900
        )
    }

    override fun compareTo(other: FontWeight) = weight.compareTo(other.weight)
}
