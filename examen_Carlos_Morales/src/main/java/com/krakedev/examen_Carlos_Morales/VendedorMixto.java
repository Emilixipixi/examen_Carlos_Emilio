package com.krakedev.examen_Carlos_Morales;

public class VendedorMixto extends Vendedor {

    public VendedorMixto(String cedula) {
        super(cedula,"M");
    }

    @Override
    public double calcularSueldo() {

        double bono;
        double sueldo;

        bono = getSueldoFijo() * 0.01 * getNumeroVentas();

        sueldo = getSueldoFijo() + bono;

        return sueldo;
    }

}