package com.krakedev.examen_Carlos_Morales.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_Carlos_Morales.VendedorComision;

public class TestVendedorComisionJUnir {
	@Test
	public void deberiaCalcularSueldoComisionCorrectamente() {

		VendedorComision vendedor = new VendedorComision("1001","V");

		vendedor.setComisionPorVenta(10);
		vendedor.setNumeroVentas(5);

		double resultado = vendedor.calcularSueldo();

		assertEquals(50, resultado);

	}

}
