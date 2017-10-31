package com.alessandrovdias.umovmetickets.model
import org.junit.Assert.*
import org.junit.Test
/**
* Testes unitários para a classe IngressoIdoso
*
* @author Alessandro
*
*/
class IngressoIdosoTest {
  @Test
  fun testGetValorIngressoDomingo() {
    val ingresso = IngressoIdoso()
    assertEquals(5.7, ingresso.getValorIngressoDomingo())
  }
  @Test
  fun testGetValorIngressoSegundaFeira() {
    val ingresso = IngressoIdoso()
    assertEquals(5.4, ingresso.getValorIngressoSegundaFeira())
  }
  @Test
  fun testGetValorIngressoTercaFeira() {
    val ingresso = IngressoIdoso()
    assertEquals(5.1, ingresso.getValorIngressoTercaFeira())
  }
  @Test
  fun testGetValorIngressoQuartaFeira() {
    val ingresso = IngressoIdoso()
    assertEquals(3.6, ingresso.getValorIngressoQuartaFeira())
  }
  @Test
  fun testGetValorIngressoQuintaFeira() {
    val ingresso = IngressoIdoso()
    assertEquals(4.2, ingresso.getValorIngressoQuintaFeira())
  }
  @Test
  fun testGetValorIngressoSextaFeira() {
    val ingresso = IngressoIdoso()
    assertEquals(6, ingresso.getValorIngressoSextaFeira())
  }
  @Test
  fun testGetValorIngressoSabado() {
    val ingresso = IngressoIdoso()
    assertEquals(5.7, ingresso.getValorIngressoSabado())
  }
  @Test
  fun testGetValorIngressoFeriado() {
    val ingresso = IngressoIdoso()
    assertEquals(5.7, ingresso.getValorIngressoFeriado())
  }
}
