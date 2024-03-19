package boletin1.ejercicio01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos un constructor con unos valores predeterminados
		CuentaCorriente c1 = new CuentaCorriente("12345678Z", 5);
		CuentaCorriente c2 = new CuentaCorriente("12345679Z", 5);

		// Establecemos que el titular de la cuenta es Pepe
		c1.setNombre("Pepe");

		// Llamamos al método que nos muestra la información
		c1.mostrarInformacion();

		// Salto de línea
		System.out.println();

		// Llamamos a la función para introducir dinero a la cuenta e introducimos 500
		c1.ingresarDinero(500);

		// Llamamos al método que nos muestra la información
		c1.mostrarInformacion();

		// Llamamos a la función para sacar dinero de la cuenta y sacamos 200
		c1.sacarDinero(200);

		// Llamamos al método que nos muestra la información
		c1.mostrarInformacion();

		// Condicional para comprobar si podemos o no sacar dinero
		if (c1.sacarDinero(400)) {
			System.out.println("Se ha sacado dinero correctamente");
		} else {
			System.out.println("No hay saldo suficiente");
		}

		// Imprimimos el saldo
		System.out.println(c1.getSaldo());

		// Condicional para comprobar si existe la cuenta o hay una con los mismos
		// valores
		if (c1.equals(c2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

		// Imprimimos el resultado final
		System.out.println(c1);
	}

}
