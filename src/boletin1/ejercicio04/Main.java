package boletin1.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombreProducto = "";
		double precioSinIva = 0;
		int cantidadProducto = 0;
		int eleccion;
		char continuar;

		System.out.println("BIENVENIDO AL SUPERMERCADO KEDISECABESA");
		System.out.print("Introduzca el nombre del producto: ");
		nombreProducto = sc.nextLine();

		System.out.print("Introduzca el precio sin IVA del producto: ");
		precioSinIva = sc.nextDouble();

		System.out.print("Introduzca la cantidad de productos disponibles: ");
		cantidadProducto = sc.nextInt();

		Articulo art = new Articulo(nombreProducto, precioSinIva, cantidadProducto);
		
		do {
			System.out.println("\nElija una opcion:" + "\n1.Información" + "\n2.Precio con IVA"
					+ "\n3.Precio con descuento" + "\n4.Vender productos" + "\n5.Almacenar productos");

			eleccion = sc.nextInt();

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

			System.out.println("¿Desea continuar? PULSE S PARA SALIR");
			continuar = sc.next().charAt(0);
		} while (continuar != 'S');

		sc.close();
	}

}
