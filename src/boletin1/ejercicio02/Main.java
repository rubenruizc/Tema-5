package boletin1.ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la elección del usuario
		int eleccion;
		
		// Variable donde guardaremos el título del libro
		String titulo = "";
		
		// Variable donde guardaremos el autor del libro
		String autor = "";
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		// Le damos la bienvenida al usuario
		System.out.println("Bienvenido a la Biblioteca KEDISECABESA");
		
		// Le pedimos al usuario que introduzca el nombre del libro y lo leemos
		System.out.print("Introduzca el título del libro: ");
		titulo = sc.nextLine();
		
		// Le pedimos al usuario que introduzca el autor del libro y lo leemos
		System.out.print("Introduzca el autor del libro: ");
		autor = sc.nextLine();
		
		// Le preguntamos al usuario que le gustaría hacer y leemos la opción
		System.out.println("¿Qué acción le gustaría realizar?");
		System.out.println("1.Sacar libro prestado" + "\n2.Devolver un libro prestado");
		eleccion = sc.nextInt();
		
		// Creamos un objeto con los valores preguntados
		Libro lib = new Libro (titulo,autor,20,0);
		
		// Condicional para realizar una acción o otra dependiendo de la opción elegida
		if (eleccion == 1) {
			lib.prestamo(1);
			System.out.println("Transacción realizada con éxito");
		}else {
			lib.devolucion(1);
			System.out.println("Transacción realizada con éxito");
		}
		
		// Cerramos el Scanner 
		sc.close();

	} // Cierre del main

} // Cierre de la clase
