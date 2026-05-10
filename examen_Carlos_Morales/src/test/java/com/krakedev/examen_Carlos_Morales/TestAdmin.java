package com.krakedev.examen_Carlos_Morales;

import com.krakedev.examen_Carlos_Morales.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {

		
		AdminVentas admin = new AdminVentas();

	
		Vendedor vendedor = new Vendedor("1111","V");
		vendedor.setSueldoFijo(500);

		// Crear vendedor comision
		VendedorComision vendedorComision = new VendedorComision("2222","V");
		vendedorComision.setComisionPorVenta(10);
		vendedorComision.setNumeroVentas(5);

		// Crear vendedor mixto
		VendedorMixto vendedorMixto = new VendedorMixto("3333","V");
		vendedorMixto.setSueldoFijo(500);
		vendedorMixto.setNumeroVentas(4);

		// Agregar vendedores
		admin.agregar(vendedor);
		admin.agregar(vendedorComision);
		admin.agregar(vendedorMixto);

		// Probar calculo de sueldo
		System.out.println("Sueldo vendedor normal: " + admin.calcularSueldo("1111"));

		System.out.println("Sueldo vendedor comision: " + admin.calcularSueldo("2222"));

		System.out.println("Sueldo vendedor mixto: " + admin.calcularSueldo("3333"));

		// Cedula inexistente
		System.out.println("Cedula inexistente: " + admin.calcularSueldo("9999"));

		
		//null pointer exception
		
		Vendedor vendedorNull= new Vendedor("8888","V");
		vendedorNull.setSueldoFijo(300);
		
		System.out.println(vendedorNull.calcularSueldo());
	}

}