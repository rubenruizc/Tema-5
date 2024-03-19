package boletin1crud.ejercicio02;

public class Gestisimal {

	// Array para almacenar objetos de tipo Articulo
	public static Articulo[] articulos = new Articulo[20];

	/**
	 * Método para saber si se puede añadir un nuevo artículo
	 * 
	 * @param art Parámetro que tiene los datos del artículo
	 * @return Devolvemos si ha sido posible o no efectuar la acción
	 */
	public static boolean alta(Articulo art) {
		boolean anyadido = false;

		int i = 0;
		int pos = buscaArticulo(art);

		if (pos == -1) {

			while (i < articulos.length && articulos[i] != null) {
				i++;
			}

			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}

		}
		return anyadido;
	}


	/**
	 * Método para buscar el artíuclo en el array
	 * 
	 * @param art Parámetro que tiene los datos del artículo
	 * @return Devuelve la posición del artículo en el array, o -1 si no se
	 *         encontró.
	 */
	public static int buscaArticulo(Articulo art) {

		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos == -1) {

			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}

			i++;
		}

		return pos;
	}
}