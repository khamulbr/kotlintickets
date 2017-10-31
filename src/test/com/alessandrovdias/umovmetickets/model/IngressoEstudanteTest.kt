package com.alessandrovdias.umovmetickets.model
import org.junit.Assert.assertEquals
import org.junit.Test
/**
* Testes unitários para a classe IngressoEstudante
*
* @author Alessandro
*
*/
class IngressoEstudanteTest {
  @Test
  fun testGetValorIngressoSemCarteirinhaDomingo() {
    val ingresso = IngressoEstudante(false)
    assertEquals(8, ingresso.getValorIngressoDomingo())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaSegundaFeira() {
    val ingresso = IngressoEstudante(false)
    assertEquals(7.2, ingresso.getValorIngressoSegundaFeira())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaTercaFeira() {
    val ingresso = IngressoEstudante(false)
    assertEquals(7.6, ingresso.getValorIngressoTercaFeira())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaQuartaFeira() {
    val ingresso = IngressoEstudante(false)
    assertEquals(4, ingresso.getValorIngressoQuartaFeira())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaQuintaFeira() {
    val ingresso = IngressoEstudante(false)
    assertEquals(5.6, ingresso.getValorIngressoQuintaFeira())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaSextaFeira() {
    val ingresso = IngressoEstudante(false)
    assertEquals(8, ingresso.getValorIngressoSextaFeira())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaSabado() {
    val ingresso = IngressoEstudante(false)
    assertEquals(8, ingresso.getValorIngressoSabado())
  }
  @Test
  fun testGetValorIngressoSemCarteirinhaFeriado() {
    val ingresso = IngressoEstudante(false)
    assertEquals(8, ingresso.getValorIngressoFeriado())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaDomingo() {
    val ingresso = IngressoEstudante(true)
    assertEquals(8, ingresso.getValorIngressoDomingo())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaSegundaFeira() {
    val ingresso = IngressoEstudante(true)
    assertEquals(5.2, ingresso.getValorIngressoSegundaFeira())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaTercaFeira() {
    val ingresso = IngressoEstudante(true)
    assertEquals(5.2, ingresso.getValorIngressoTercaFeira())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaQuartaFeira() {
    val ingresso = IngressoEstudante(true)
    assertEquals(4, ingresso.getValorIngressoQuartaFeira())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaQuintaFeira() {
    val ingresso = IngressoEstudante(true)
    assertEquals(5.2, ingresso.getValorIngressoQuintaFeira())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaSextaFeira() {
    val ingresso = IngressoEstudante(true)
    assertEquals(5.2, ingresso.getValorIngressoSextaFeira())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaSabado() {
    val ingresso = IngressoEstudante(true)
    assertEquals(8, ingresso.getValorIngressoSabado())
  }
  @Test
  fun testGetValorIngressoComCarteirinhaFeriado() {
    val ingresso = IngressoEstudante(true)
    assertEquals(5.2, ingresso.getValorIngressoFeriado())
  }
}
