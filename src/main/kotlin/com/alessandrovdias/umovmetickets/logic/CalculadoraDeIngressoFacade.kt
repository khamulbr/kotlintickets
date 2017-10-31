package com.alessandrovdias.umovmetickets.logic
import com.alessandrovdias.umovmetickets.model.enums.DiaDaSemana
import com.alessandrovdias.umovmetickets.model.interfaces.CalculadoraDeIngresso
class CalculadoraDeIngressoFacade {
  /**
	 * Método responsável por chamar o calculo de ingressos, baseado no Dia da Semana e
	 * no tipo de Ingresso desejado
	 * 
	 * @return Valor final do ingresso
	 */
  fun getValorDoIngresso(diaDaSemana:DiaDaSemana, calculadoraDeIngresso:CalculadoraDeIngresso):Double {
    if ((diaDaSemana == null) || calculadoraDeIngresso == null)
    {
      throw IllegalArgumentException("Ingresso ou Dia da Semana nulos")
    }
    when (diaDaSemana) {
      SEGUNDA_FEIRA -> return calculadoraDeIngresso.getValorIngressoSegundaFeira()
      TERCA_FEIRA -> return calculadoraDeIngresso.getValorIngressoTercaFeira()
      QUARTA_FEIRA -> return calculadoraDeIngresso.getValorIngressoQuartaFeira()
      QUINTA_FEIRA -> return calculadoraDeIngresso.getValorIngressoQuintaFeira()
      SEXTA_FEIRA -> return calculadoraDeIngresso.getValorIngressoSextaFeira()
      SABADO -> return calculadoraDeIngresso.getValorIngressoSabado()
      DOMINGO -> return calculadoraDeIngresso.getValorIngressoDomingo()
      FERIADO -> return calculadoraDeIngresso.getValorIngressoFeriado()
    }
    return null
  }
}
