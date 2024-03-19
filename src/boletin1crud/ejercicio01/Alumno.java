package boletin1crud.ejercicio01;

public class Alumno {

	/**
	 * Atributo donde guardaremos el nombre del alumno
	 */
	private String nombre="";
	
	/**
	 * Atributo donde guardaremos la nota media del alumno
	 */
	private double notaMedia;
	
	/**
	 * Constructor sin parámetros
	 */
	public Alumno() {
		this.nombre = "";
		this.notaMedia = 0.0;
	}
	
	
	/**
	 * Constructor con parámetros
	 * @param nombre Parámetro donde guardaremos el nombre del alumno
	 * @param notaMedia Parámetro donde guardaremos la nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(notaMedia>=0 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	// GET del atributo nombre
	public String getNombre() {
		return this.nombre;
	}

	// GET/SET del atributo notaMedia
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		if(notaMedia>=0 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	
	/**
	 * Método que imprime el nombre del alumno + la nota media
	 */
	public String toString() {
		return this.nombre + ": " + this.notaMedia;
	}
	
}

