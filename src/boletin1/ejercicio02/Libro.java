package boletin1.ejercicio02;

public class Libro {

	/**
	 * Atributo donde guardaremos el título del libro
	 */
	private String titulo;

	/**
	 * Atributo donde guardaremos el autor del libro
	 */
	private String autor;

	/**
	 * Atributo donde guardaremos el número de ejemplares disponibles
	 */
	private int numEjemplares;

	/**
	 * Atributo donde guardaremos el número de ejemplares prestados
	 */
	private int numEjemplaresPrestados;

	/**
	 * Constructor vacío
	 */
	public Libro() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param titulo Parámetro donde se guardara el título del libro
	 * @param autor Parámetro donde se guardara el autor del libro
	 * @param numEjemplares Parámetro donde se guardara el número de ejemplares disponibles
	 * @param numEjemplaresPrestados Parámetro donde se guardara el número de ejemplares prestados
	 */
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		super();

		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}

		if (numEjemplares >= 0) {
			this.numEjemplares = numEjemplares;
		}

		if (numEjemplaresPrestados >= 0) {
			this.numEjemplaresPrestados = numEjemplaresPrestados;
		}
	}

	// GET/SET del atributo título
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// GET/SET del atributo autor
	public String getAutor() {
		return autor;
	}

	public void setNombre(String autor) {
		this.autor = autor;
	}

	// GET/SET del atributo numEjemplares
	public double getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	// GET/SET del atributo numEjemplaresPrestados
	public double getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	/**
	 * Método que efectuara el préstamo de un libro
	 * @param libroQuerido Parámetro del libro que se quiera prestar
	 * @return Devolvemos si la acción se ha realizado o no
	 */
	public boolean prestamo(int libroQuerido) {
		boolean sePuede = false;

		if (this.numEjemplares - this.numEjemplaresPrestados >= libroQuerido) {
			sePuede = true;
			this.numEjemplaresPrestados += libroQuerido;
		}
		return sePuede;
	}

	/**
	 * Método que efectuara la devolución de un libro
	 * @param libroDevuelto Parámetro del libro que se quiera devolver
	 * @return Devolvemos si la acción se ha realizado o no
	 */
	public boolean devolucion(int libroDevuelto) {
		boolean accionRealizada = false;

		if (this.numEjemplaresPrestados - libroDevuelto > 0) {
			accionRealizada = true;
			this.numEjemplaresPrestados -= libroDevuelto;
		}

		return accionRealizada;
	}

}
