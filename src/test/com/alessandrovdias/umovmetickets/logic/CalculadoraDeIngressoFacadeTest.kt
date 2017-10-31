package com.alessandrovdias.umovmetickets.logic
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import com.alessandrovdias.umovmetickets.logic.CalculadoraDeIngressoFacade
import com.alessandrovdias.umovmetickets.model.IngressoEstudante
import com.alessandrovdias.umovmetickets.model.IngressoIdoso
import com.alessandrovdias.umovmetickets.model.IngressoInfantil
import com.alessandrovdias.umovmetickets.model.enums.DiaDaSemana
/**
* Testes unitários para a classe CalculadoraDeIngressoFacade
*
* @author Alessandro
*
*/
class CalculadoraDeIngressoFacadeTest {
  @Rule
  var thrown = ExpectedException.none()
  @Test
  fun testGetPrecoFinalInfantilSegunda() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(4.95, cdif.getValorDoIngresso(DiaDaSemana.SEGUNDA_FEIRA, IngressoInfantil()))
  }
  @Test
  fun testGetPrecoFinalIdosoTerca() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(5.1, cdif.getValorDoIngresso(DiaDaSemana.TERCA_FEIRA, IngressoIdoso()))
  }
  @Test
  fun testGetPrecoFinalEstudanteSemCarteirinhaTerca() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(7.6, cdif.getValorDoIngresso(DiaDaSemana.TERCA_FEIRA, IngressoEstudante(false)))
  }
  @Test
  fun testGetPrecoFinalEstudanteComCarteirinhaQuarta() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(4, cdif.getValorDoIngresso(DiaDaSemana.QUARTA_FEIRA, IngressoEstudante(true)))
  }
  @Test
  fun testGetPrecoFinalInfantilQuarta() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(3.85, cdif.getValorDoIngresso(DiaDaSemana.QUARTA_FEIRA, IngressoInfantil()))
  }
  @Test
  fun testGetPrecoFinalIdosoSemDescontoSexta() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(6, cdif.getValorDoIngresso(DiaDaSemana.SEXTA_FEIRA, IngressoIdoso()))
  }
  @Test
  fun testGetPrecoFinalEstudanteComCarteirinhaDomingo() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(8, cdif.getValorDoIngresso(DiaDaSemana.DOMINGO, IngressoEstudante(true)))
  }
  @Test
  fun testGetPrecoFinalIdosoSabado() {
    val cdif = CalculadoraDeIngressoFacade()
    assertEquals(5.7, cdif.getValorDoIngresso(DiaDaSemana.SABADO, IngressoIdoso()))
  }
  @Test
  fun testGetPrecoFinalUmValorNulo() {
    val cdif = CalculadoraDeIngressoFacade()
    thrown.expect(IllegalArgumentException::class.java!!)
    thrown.expectMessage("Ingresso ou Dia da Semana nulos")
    cdif.getValorDoIngresso(null, IngressoInfantil())
  }
  @Test
  fun testGetPrecoFinalValoresNulo() {
    val cdif = CalculadoraDeIngressoFacade()
    thrown.expect(IllegalArgumentException::class.java!!)
    thrown.expectMessage("Ingresso ou Dia da Semana nulos")
    cdif.getValorDoIngresso(null, null)
  }
}
