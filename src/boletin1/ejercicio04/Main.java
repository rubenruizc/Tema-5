package boletin1.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el nombre del producto
		String nombreProducto = "";
		
		// Variable donde guardaremos el precio sin el IVA
		double precioSinIva = 0;
		
		// Variable donde guardaremos la cantidad que hay del producto
		int cantidadProducto = 0;
		
		// Variable donde guardaremos la elección del usuario
		int eleccion;
		
		// Variable donde guardaremos la letra de si quiere continuar o si no
		char continuar;

		// Le damos la bienvenida
		System.out.println("BIENVENIDO AL SUPERMERCADO KEDISECABESA");
		
		// Le pedimos que introduzca el nombre del producto y lo leemos
		System.out.print("Introduzca el nombre del producto: ");
		nombreProducto = sc.nextLine();

		// Le pedimos que introduzca el precio sin IVA del producto y lo leemos
		System.out.print("Introduzca el precio sin IVA del producto: ");
		precioSinIva = sc.nextDouble();

		// Le pedimos que introduzca la cantidad de productos disponibles y lo leemos
		System.out.print("Introduzca la cantidad de productos disponibles: ");
		cantidadProducto = sc.nextInt();

		// Creamos un objeto con los valores anteriormente pedidos
		Articulo art = new Articulo(nombreProducto, precioSinIva, cantidadProducto);
		
		// Bucle para preguntar las opciones hasta que introduzca la letra "S"
		do {
			
			// Le indicamos al usuario las opciones que puede elegir
			System.out.println("\nElija una opcion:" + "\n1.Información" + "\n2.Precio con IVA"
					+ "\n3.Precio con descuento" + "\n4.Vender productos" + "\n5.Almacenar productos");

			// Leemos la elección
			eleccion = sc.nextInt();

			// Condicional para realizar las distintas funciones dependiendo del número elegido
			switch (eleccion) {
			case 1:
				art.imprimirInfo();
				break;

			case 2:
				System.out.println(art.getPVP());
				break;

			case 3:
				double descuento;
				System.out.print("Introduzca el descuento:");
				descuento = sc.nextInt();
				System.out.println(art.getPVPDescuento(descuento));
				break;

			case 4:
				int articulosVender;
				System.out.println("Introduzca la cantidad de artículos para vender");
				articulosVender = sc.nextInt();

				if (art.vender(articulosVender)) {
					System.out.println("Operación realizada con éxito");
				} else
					System.out.println("Faltan productos");

				break;

			case 5:
				int articulosReponer;
				System.out.println("Introduzca la cantidad de árticulos que quieras reponer: ");
				articulosReponer = sc.nextInt();
				art.almacenar(articulosReponer);
				break;
			}

			// Le preguntamos si desea continuar y leemos la opción
			System.out.println("¿Desea continuar? PULSE S PARA SALIR");
			continuar = sc.next().charAt(0);
		} while (continuar != 'S');

		// Cerramos el Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase
