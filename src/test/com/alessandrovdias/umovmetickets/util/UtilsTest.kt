package com.alessandrovdias.umovmetickets.util
import org.junit.Assert.*
import org.junit.Test
class UtilsTest {
  @Test
  fun testRoundReallyNear() {
    val expected = 3.7
    assertEquals(expected, Utils.roundUp(3.69999))
  }
  @Test
  fun testRoundNotSoNear() {
    val expected = 3.7
    assertEquals(expected, Utils.roundUp(3.695))
  }
  @Test
  fun testRoundNotNear() {
    val expected = 3.7
    assertEquals(expected, Utils.roundUp(3.691))
  }
}
