package boletin1.ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int eleccion;
		String titulo = "";
		String autor = "";
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bienvenido a la Biblioteca KEDISECABESA");
		System.out.print("Introduzca el título del libro: ");
		titulo = sc.nextLine();
		
		System.out.print("Introduzca el autor del libro: ");
		autor = sc.nextLine();
		
		System.out.println("¿Qué acción le gustaría realizar?");
		System.out.println("1.Sacar libro prestado" + "\n2.Devolver un libro prestado");
		eleccion = sc.nextInt();
		
		Libro lib = new Libro (titulo,autor,20,0);
		if (eleccion == 1) {
			lib.prestamo(1);
			System.out.println("Transacción realizada con éxito");
		}else {
			lib.devolucion(1);
			System.out.println("Transacción realizada con éxito");
		}
		
		System.out.println(lib.getNumEjemplaresPrestados());
		
		sc.close();

	}

}
