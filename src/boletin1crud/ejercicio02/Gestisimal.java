package boletin1crud.ejercicio02;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static boolean alta(Articulo art) {
		boolean anyadido = false;

		// 1º Comprobar si el artículo ya existe
		int i = 0;
		int pos = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
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

//	public static boolean modifica(Articulo art) {
//		//int pos = buscaArticulo(art);
//		
//		/* Si encontramos el artículo se modifica */
//		if(pos>=0) {
//			
//		}
//	}

	public static int buscaArticulo(Articulo art) {
		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

}