package tz.co.asoft

inline class Color(val value: Int) {
    companion object {
        fun fromHex(hexString: String): Color {
            if (!hexString.startsWith("#")) {
                throw Exception("Hex colors must start with a '#'")
            }
            if (hexString.length != 7) {
                throw Exception("Only rgb values in the form of #ffffff are allowed, #fff are not allowed")
            }
            return Color(hexString.substring(1).toInt(16))
        }
    }

    val r: Int get() = (value ushr 16) and 0xFF
    val g: Int get() = (value ushr 8) and 0xFF
    val b: Int get() = (value ushr 0) and 0xFF

    constructor(r: Int = 0x00, g: Int = 0x00, b: Int = 0x00) : this((r shl 16) or (g shl 8) or b)

    fun Int.toHexString() = (if (this < 0x10) "0" else "") + this.toString(16)

    fun toHexString() = "#${r.toHexString()}${g.toHexString()}${b.toHexString()}"

    override fun toString() = toHexString()
}