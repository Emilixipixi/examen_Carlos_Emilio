package com.krakedev.examen_Carlos_Morales;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen_Carlos_Morales.servicios.AdminVentas;

@RestController
public class VendedorController {

	private AdminVentas admin;

	public VendedorController() {
		admin = new AdminVentas();
	}

	@PostMapping("/vendedores")
	public void agregarVendedor(@RequestBody Vendedor vendedor) {

		Vendedor nuevoVendedor = null;

		// Vendedor normal
		if (vendedor.getTipo().equals("V")) {

			nuevoVendedor = new Vendedor(vendedor.getCedula(), vendedor.getTipo());

			nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());

		}

		// Vendedor comision
		else if (vendedor.getTipo().equals("C")) {

			nuevoVendedor = new VendedorComision(vendedor.getCedula());

			nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());

			nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());

			nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());

		}

		// Vendedor mixto
		else if (vendedor.getTipo().equals("M")) {

			nuevoVendedor = new VendedorMixto(vendedor.getCedula());

			nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());

			nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());

		}

		// Agregar al admin
		admin.agregar(nuevoVendedor);

	}

	@GetMapping("/{cedula}/sueldos")
	public Double calcularSueldoVendedor(@PathVariable String cedula) {

		return admin.calcularSueldo(cedula);

	}

}