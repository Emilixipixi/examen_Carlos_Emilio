package com.krakedev.examen_Carlos_Morales;

public class VendedorComision extends Vendedor {
 
	public VendedorComision(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {

        double sueldo;

        sueldo = getComisionPorVenta() * getNumeroVentas();

        return sueldo;
    }

}