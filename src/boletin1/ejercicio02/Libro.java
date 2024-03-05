package boletin1.ejercicio02;

public class Libro {

	private String titulo;

	private String autor;

	private int numEjemplares;

	private int numEjemplaresPrestados;

	public Libro() {

		super();
	}

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

	
	
	
	public boolean prestamo(int libroQuerido) {
		boolean sePuede = false;
		
		if (this.numEjemplares - this.numEjemplaresPrestados >= libroQuerido) {
			sePuede = true;
			this.numEjemplaresPrestados += libroQuerido;
		}	
		return sePuede;
	}
	
	public boolean devolucion (int libroDevuelto) {
		boolean accionRealizada = false;
		
		
		return accionRealizada;
	}

}
