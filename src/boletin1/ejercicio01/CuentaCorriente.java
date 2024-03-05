package boletin1.ejercicio01;

public class CuentaCorriente {
	
	private String dni;
	
	private String nombre;
	
	private double saldo;
	
	public CuentaCorriente (String dni, double saldo) {
		
		super();
		
		if (dni != null && !dni.equals(""));
		// El atributo DNI tendrá los valores del parámetro dni
		this.dni = dni;
		
		if (saldo >=0)
		// El atributo Saldo tendrá los valores del parámetro saldo
		this.saldo = saldo;
	}
	
	public CuentaCorriente (String dni, String nombre, double saldo) {
		
		super();
		
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;	
		}
		
		if (saldo >=0) {
			this.saldo = saldo;
		}
	}
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacarDinero (double cantidadSacar) {
		boolean esPosible = false;
		
		if (this.saldo >= cantidadSacar) {
			esPosible = true;
		}
		
		return esPosible;
	}
	
	public double meterDinero (double cantidadIngresar) {
		double cantidadFinal;
		
		cantidadFinal = this.saldo + cantidadIngresar;
		
		return cantidadFinal;
	}
	
	public void informacionCuenta () {
		System.out.println("Nombre Cuenta: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Saldo Cuenta: " + this.saldo);
	}
	
}
