package com.krakedev.examen_Carlos_Morales.servicios;

import java.util.ArrayList;

import com.krakedev.examen_Carlos_Morales.Vendedor;

public class AdminVentas {

	private ArrayList<Vendedor> vendedores;

	public AdminVentas() {
		vendedores = new ArrayList<Vendedor>();
	}

	public void agregar(Vendedor vendedor) {

		vendedores.add(vendedor);

	}

	public Double calcularSueldo(String cedula) {

		for (Vendedor vendedor : vendedores) {

			if (vendedor.getCedula().equals(cedula)) {

				return vendedor.calcularSueldo();
			}

		}

		return null;

	}

}