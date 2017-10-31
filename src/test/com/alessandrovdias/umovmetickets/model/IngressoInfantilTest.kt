package com.alessandrovdias.umovmetickets.model;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Testes unitários para a classe IngressoInfantil
 * 
 * @author Alessandro
 *
 */
public class IngressoInfantilTest {

	@Test
	public void testGetValorIngressoDomingo() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(5.5), ingresso.getValorIngressoDomingo());	
    }

	@Test
	public void testGetValorIngressoSegundaFeira() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(4.95), ingresso.getValorIngressoSegundaFeira());	
	}

	@Test
	public void testGetValorIngressoTercaFeira() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(4.68), ingresso.getValorIngressoTercaFeira());	
	}

	@Test
	public void testGetValorIngressoQuartaFeira() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(3.85), ingresso.getValorIngressoQuartaFeira());	
	}

	@Test
	public void testGetValorIngressoQuintaFeira() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(5.5), ingresso.getValorIngressoQuintaFeira());	
	}

	@Test
	public void testGetValorIngressoSextaFeira() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(4.9), ingresso.getValorIngressoSextaFeira());	
	}

	@Test
	public void testGetValorIngressoSabado() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(5.5), ingresso.getValorIngressoSabado());	
	}

	@Test
	public void testGetValorIngressoFeriado() {
		IngressoInfantil ingresso = new IngressoInfantil();
        assertEquals(new Double(5.5), ingresso.getValorIngressoFeriado());	
	}

}
