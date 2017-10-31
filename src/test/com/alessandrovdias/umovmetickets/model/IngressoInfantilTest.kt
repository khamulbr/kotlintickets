package com.alessandrovdias.umovmetickets.model
import org.junit.Assert.*
import org.junit.Test
/**
* Testes unitários para a classe IngressoInfantil
*
* @author Alessandro
*
*/
class IngressoInfantilTest {
  @Test
  fun testGetValorIngressoDomingo() {
    val ingresso = IngressoInfantil()
    assertEquals(5.5, ingresso.getValorIngressoDomingo())
  }
  @Test
  fun testGetValorIngressoSegundaFeira() {
    val ingresso = IngressoInfantil()
    assertEquals(4.95, ingresso.getValorIngressoSegundaFeira())
  }
  @Test
  fun testGetValorIngressoTercaFeira() {
    val ingresso = IngressoInfantil()
    assertEquals(4.68, ingresso.getValorIngressoTercaFeira())
  }
  @Test
  fun testGetValorIngressoQuartaFeira() {
    val ingresso = IngressoInfantil()
    assertEquals(3.85, ingresso.getValorIngressoQuartaFeira())
  }
  @Test
  fun testGetValorIngressoQuintaFeira() {
    val ingresso = IngressoInfantil()
    assertEquals(5.5, ingresso.getValorIngressoQuintaFeira())
  }
  @Test
  fun testGetValorIngressoSextaFeira() {
    val ingresso = IngressoInfantil()
    assertEquals(4.9, ingresso.getValorIngressoSextaFeira())
  }
  @Test
  fun testGetValorIngressoSabado() {
    val ingresso = IngressoInfantil()
    assertEquals(5.5, ingresso.getValorIngressoSabado())
  }
  @Test
  fun testGetValorIngressoFeriado() {
    val ingresso = IngressoInfantil()
    assertEquals(5.5, ingresso.getValorIngressoFeriado())
  }
}
