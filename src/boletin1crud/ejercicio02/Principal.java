package boletin1crud.ejercicio02;

import java.util.Scanner;

public class Principal {
	
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
        // Variable donde guardaremos la opción del usuario
        int opc;

        // Variables donde guardaremos los datos del artículo
        Articulo art;
        
        // Variable donde guardaremos si se ha podido añadir 
        boolean anyadido;
        
        // Variable donde guardaremos el codigo del artículo
        int codigo;
        
        // Variable donde guardaremos la posicion del artíuclo
        int pos;
        
        // Variable donde guardaremos la cantidad del artíuclo
        int cantidad;

        System.out.println("BIENVENIDO");
        do {
            // Muestra el menú de opciones
            menu();

            opc = sc.nextInt();
            sc.nextLine();

            // Procesamiento de la opción seleccionada por el usuario
            switch (opc) {
                case 1:
                    // Implementar la funcionalidad para listar los artículos
                    break;
                case 2:
                    // Alta de un nuevo artículo
                    art = creaArticulo();
                    anyadido = Gestisimal.alta(art);
                    if (anyadido) {
                        System.out.println("Artículo añadido correctamente");
                    } else {
                        System.out.println("No se ha podido añadir el artículo");
                    }
                    break;
                case 4:
                    // Modificar un artículo
                    System.out.println("Introduzca el código a modificar:");
                    codigo = sc.nextInt();
                    sc.nextLine();

                    art = new Articulo(codigo);
                    pos = Gestisimal.buscaArticulo(art);
                    if (pos >= 0) {
                        // Solicitar los datos a modificar
                        System.out.println("¿Qué dato quiere modificar?");
                        System.out.println("1. Descripción");
                        System.out.println("2. Precio compra");
                        System.out.println("3. Precio venta");
                    } else {
                        System.out.println("El artículo indicado no se encuentra");
                    }
                    break;
                case 5:
                    // Entrada de mercancía
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
                    // Salida de mercancía
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

                        // Comprobar si hay stock suficiente
                        if (art.getStock() >= cantidad) {
                            art.setStock(art.getStock() - cantidad);
                        }

                    } else {
                        System.out.println("Artículo no encontrado");
                    }
                    break;
            }
        } while (opc != 7);
        
        // Cerramos el Scanner 
        sc.close(); 
   
	} // Cierre del main

    /**
     * Método que permite crear un nuevo artículo
     * 
     * @return El artículo creado
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

    /**
     *  Método que muestra el menú de opciones
     */
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
    
} // Cierre de la clase