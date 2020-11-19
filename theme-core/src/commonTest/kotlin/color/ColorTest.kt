package color

import tz.co.asoft.Color
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorTest {
    @Test
    fun `should instantiate properly`() {
        val red1 = Color(0xFF0000)
        println(red1)
        val red2 = Color(r = 0xFF)
        val green = Color(0x00FF00)
        println(green)
        val blue = Color(0x0000ff)
        println(blue)
        val red3 = Color(0xf00)
        println("Red 1: $red1, Red 2:$red2, Red 3: $red3")
        assertEquals(red1, red2)
    }

    @Test
    fun `hex can be converted to string`() {
        println("ff".toInt(16))
    }
}