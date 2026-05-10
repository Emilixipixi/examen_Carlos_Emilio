package com.krakedev.examen_Carlos_Morales.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_Carlos_Morales.Vendedor;

public class TestVendedorJUnit {
	
	
	@Test
	public void deberiaCalcularSueldoCorrectamente() {

		Vendedor vendedor = new Vendedor("1001","V");

		vendedor.setSueldoFijo(500);

		double resultado = vendedor.calcularSueldo();

		assertEquals(500, resultado);

	}

}
