package boletin1crud.ejercicio01;

public class ArrayAlumno {

	// Array para almacenar objetos de tipo Alumno.
	public static Alumno[] alumnos = new Alumno[30];

	/**
	 * Método para imprimir la información de los alumnos
	 */
	public static void imprimirAlumnos() {
		for (Alumno alumn : alumnos) {
			if (alumn != null) {
				System.out.println(alumn);
			}
		}
	}

	/**
	 * Método para agregar un nuevo alumno al array de alumnos
	 * 
	 * @param nombre Parámetro que nos indica el nombre del alumno
	 * @param nota   Parámetro que nos indica la nota del alumno
	 * @return Devolvemos si ha sido posible o no añadir al alumno
	 */
	public static boolean nuevoAlumno(String nombre, double nota) {
		Alumno alumn = new Alumno(nombre, nota);
		int i = 0;
		boolean anyadido = false;

		while (i < alumnos.length && alumnos[i] != null) {
			i++;

			if (i < alumnos.length) {
				alumnos[i] = alumn;
				anyadido = true;
			}

		}
		return anyadido;
	}

	/**
	 * Método para modificar la nota de un alumno
	 * 
	 * @param alumno Parámetro que nos indica el alumno al que tenemos que cambiar
	 *               la nota
	 * @param nota   Parámetro que nos indica la nueva nota
	 * @return Devolvemos si se ha efectuado o no la acción
	 */
	public static boolean modificaAlumno(String alumno, double nota) {
		boolean modificado = false;
		int i = buscaAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i].setNotaMedia(nota);
			modificado = true;
		}

		return modificado;
	}

	/**
	 * Método para eliminar un alumno
	 * 
	 * @param alumno Parámetro que nos indica el alumno al que vamos a eliminar
	 * @return
	 */
	public static boolean eliminaAlumno(String alumno) {
		boolean eliminado = false;
		int i = buscaAlumno(alumno);

		if (i < alumnos.length) {
			alumnos[i] = null;
			eliminado = true;
		}

		return eliminado;
	}

	/**
	 * Método privado para buscar un alumno en el array
	 * 
	 * @param alumno Parámetro para saber que alumno tenemos que buscar
	 * @return
	 */
	private static int buscaAlumno(String alumno) {
		int i = 0;

		while (i < alumnos.length && (alumnos[i] == null || !alumnos[i].getNombre().equals(alumno))) {
			i++;
		}

		return i;
	}
}