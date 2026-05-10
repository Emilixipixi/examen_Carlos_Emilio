package com.krakedev.examen_Carlos_Morales;

public class Vendedor {

	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;

	// Sobreescritura del metodo toString
	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", numeroVentas=" + numeroVentas + ", sueldoFijo=" + sueldoFijo
				+ ", comisionPorVenta=" + comisionPorVenta + "]";
	}

	// Constructor solocon cedula
	public Vendedor(String cedula) {
		super();
		this.cedula = cedula;
	}

	// Getters and setters
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}
	
	//metodo Calcular Sueldo
	
	public double calcularSueldo() {
		
		return this.sueldoFijo;
	}

}
