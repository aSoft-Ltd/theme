@file:Suppress("PackageDirectoryMismatch")

package tz.co.asoft

inline class BaselineShift(val multiplier: Float) {
    companion object {
        /**
         * Default baseline shift for superscript.
         */
        val Superscript = BaselineShift(0.5f)
        /**
         * Default baseline shift for subscript
         */
        val Subscript = BaselineShift(-0.5f)
        /**
         * Constant for no baseline shift.
         */
        val None = BaselineShift(0.0f)
    }
}