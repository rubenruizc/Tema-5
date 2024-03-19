package boletin1.ejercicio01;

public class CuentaCorriente {
	
	/**
	 * Atributo donde guardaremos el DNI del dueño de la cuenta
	 */
	private String dni = "";
	
	/**
	 * Atributo donde guardaremos el nombre del dueño de la cuenta
	 */
	private String nombre = "";
	
	/**
	 * Atrivuto donde guardaremos el saldo de la cuenta
	 */
	private double saldo;

	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		this(dni, saldo);
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	// GET/SET del atributo dni
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	// GET/SET del atributo nombre
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	// GET del atributo DNI
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que saca dinero de la cuenta
	 * @param dinero Parámetro para introducir la cantidad de dinero
	 * @return Devolvemos si se ha podido ejecutar
	 */
	public boolean sacarDinero(double dinero) {
		boolean transaccion = false;

		if (this.saldo >= dinero) {
			this.saldo -= dinero;
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Método para poder ingresar dinero en la cuenta
	 * @param dinero Parámetro para introducir la cantidad de dinero
	 */
	public void ingresarDinero(double dinero) {
		if (dinero > 0) {
			this.saldo += dinero;
		}
	}

	/**
	 * Método para imprimir la información de la cuenta
	 */
	public void mostrarInformacion() {
		System.out.println("Titular: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo: " + this.saldo);
	}

	/**
	 * Método para imprimir la información de la cuenta
	 */
	public String toString() {
		String cadena = "";

		cadena += "------------------------------\n";
		cadena += "Titular: " + this.nombre + "\n";
		cadena += "DNI: " + this.dni + "\n";
		cadena += "Saldo: " + this.saldo + "\n";
		cadena += "------------------------------";
		
		return cadena;
	}
	

	/**
	 * Método para saber si hay dos cuentas iguales
	 * @param c Parámetro para introducir la cuenta y su información
	 * @return Devolvemos si es igual o no 
	 */
	public boolean equals(CuentaCorriente c) {
		boolean sonIguales = false;

		if (this.dni.equals(c.dni)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
