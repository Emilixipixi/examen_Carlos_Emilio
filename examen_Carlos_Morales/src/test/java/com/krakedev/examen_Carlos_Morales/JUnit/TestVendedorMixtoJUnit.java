package com.krakedev.examen_Carlos_Morales.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_Carlos_Morales.VendedorMixto;

public class TestVendedorMixtoJUnit {

	@Test
	public void deberiaCalcularSueldoMixtoCorrectamente() {

		VendedorMixto vendedor = new VendedorMixto("1002","V");

		vendedor.setSueldoFijo(500);
		vendedor.setNumeroVentas(4);

		double resultado = vendedor.calcularSueldo();

		assertEquals(520, resultado);

	}

}
