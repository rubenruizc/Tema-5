package boletin1.Ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre;
		String dni;
		double saldo;
		
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca su DNI: ");
		dni = sc.nextLine();
		
		System.out.println("Introduzca su saldo:");
		saldo = sc.nextDouble();
		
		CuentaCorriente cc = new CuentaCorriente(dni,nombre,saldo);
		
		System.out.println(cc.getSaldo());
		cc.sacarDinero(20);
		System.out.println(cc.getSaldo());
		
		sc.close();

	}

}
