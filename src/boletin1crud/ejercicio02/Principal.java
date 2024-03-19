package boletin1crud.ejercicio02;

import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		Articulo art;
		boolean anyadido;
		int codigo;
		int pos;
		int cantidad;

		System.out.println("BIENVENIDO A GESTISIMAL");
		do {
			menu();

			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				break;
			case 2:
				art = creaArticulo();
				anyadido = Gestisimal.alta(art);
				if (anyadido) {
					System.out.println("Artículo añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir el artículo");
				}
				break;
			case 4:
				System.out.println("Introduzca el código a modificar:");
				codigo = sc.nextInt();
				sc.nextLine();

				art = new Articulo(codigo);
				pos = Gestisimal.buscaArticulo(art);
				if (pos >= 0) {
					// Le tenemos que pedir los datos a modificar
					System.out.println("¿Qué dato quiere modificar?");
					System.out.println("1. Descripción");
					System.out.println("2. Precio compra");
					System.out.println("3. Precio venta");
				} else {
					System.out.println("El artículo indicado no se encuentra");
				}

				break;
			case 5:
				System.out.println("Introduzca el código a modificar:");
				codigo = sc.nextInt();
				sc.nextLine();

				art = new Articulo(codigo);
				pos = Gestisimal.buscaArticulo(art);

				if (pos >= 0) {
					art = Gestisimal.articulos[pos];
					System.out.println("Introduzca la nueva cantidad de mercancía");
					cantidad = sc.nextInt();
					sc.nextLine();

					art.setStock(art.getStock() + cantidad);
				} else {
					System.out.println("Artículo no encontrado");
				}
				break;
			case 6:
				System.out.println("Introduzca el código a modificar:");
				codigo = sc.nextInt();
				sc.nextLine();

				art = new Articulo(codigo);
				pos = Gestisimal.buscaArticulo(art);

				if (pos >= 0) {
					art = Gestisimal.articulos[pos];
					System.out.println("Introduzca la nueva cantidad de mercancía");
					cantidad = sc.nextInt();
					sc.nextLine();

					// Comprobamos que hay stock suficiente
					if (art.getStock() >= cantidad) {
						art.setStock(art.getStock() - cantidad);
					}

				} else {
					System.out.println("Artículo no encontrado");
				}
				break;
			}
		} while (opc != 7);
		sc.close();
	}

	/**
	 * @return
	 */
	private static Articulo creaArticulo() {
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		Articulo art;

		System.out.println("Introduzca el código");
		codigo = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca la descripción");
		descripcion = sc.nextLine();

		System.out.println("Introduzca el precio compra");
		precioCompra = sc.nextDouble();
		sc.nextLine();

		System.out.println("Introduzca el precio venta");
		precioVenta = sc.nextDouble();
		sc.nextLine();

		System.out.println("Introduzca el stock");
		stock = sc.nextInt();
		sc.nextLine();

		art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
		return art;
	}

	public static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificar");
		System.out.println("5. Entrada mercancía");
		System.out.println("6. Salida mercancía");
		System.out.println("7. Salir");
		System.out.println("Seleccione una opción");
	}
}