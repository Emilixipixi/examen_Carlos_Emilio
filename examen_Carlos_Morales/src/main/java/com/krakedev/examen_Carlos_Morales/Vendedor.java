package com.krakedev.examen_Carlos_Morales;

public class Vendedor {

	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;
	private String tipo;

	// Sobreescritura del metodo toString
	
	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", tipo=" + tipo + ", sueldoFijo=" + sueldoFijo + "]";
	}

	

	// Constructor solocon cedula
	public Vendedor(String cedula, String tipo) {
		super();
		this.cedula = cedula;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// metodo Calcular Sueldo
	public double calcularSueldo() {

		return this.sueldoFijo;
	}

}
