package boletin1crud.ejercicio02;

public class Articulo {

	/**
	 * Atributo código del producto que va a ser un valor único
	 */
	private int codigo;

	/**
	 * Descripción del producto. Almacenará información sobre el producto.
	 */
	private String descripcion = "";

	/**
	 * Precio del producto sin aplicarle el IVA
	 */
	private double precioCompra;

	/**
	 * Precio del producto tras aplicarle el IVA
	 */
	private double precioVenta;

	/**
	 * Cuántas unidades quedan del producto disponibles
	 */
	private int stock;

	/**
	 * Constructor sin parámetros
	 */
	public Articulo() {
	}

	/**
	 * Constructo con el parámetro codigo
	 * @param codigo Parámetro donde guardaremos el código del artículo
	 */
	public Articulo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo       Código del artículo
	 * @param descripcion  Descripción del artículo
	 * @param precioCompra El precio al que se ha comprado el artículo
	 * @param precioVenta  El precio al que se vende el artículo
	 * @param stock        Número de existencias disponibles del artículo
	 */
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}

		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}

		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}

		if (stock >= 0) {
			this.stock = stock;
		}

	} 

	// GET del atributo codigo
	public int getCodigo() {
		return codigo;
	}

	
	// GET/SET del atributo descripcion
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}

	}

	// GET/SET del atributo precioCompra
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	// GET/SET del atributo precioVenta
	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	// GET/SET del atributo stock
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Método toString que devuelve una cadena con la información del artículo 
	 * 
	 * @return Devuelve una cadena con la información del artículo
	 */
	public String toString() {
		String cadena = "--------------------------------------------------\n";

		cadena += "Código: " + this.codigo + "\n";
		cadena += "Descripción: " + this.descripcion + "\n";
		cadena += "Precio compra: " + this.precioCompra + "\n";
		cadena += "Precio venta: " + this.precioVenta + "\n";
		cadena += "Stock: " + this.stock + "\n";

		return cadena;
	}


	/**
	 * Método que comprueba si son iguales 
	 * 
	 * @return Devuelve si son o no iguales
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;

		Articulo art2 = (Articulo) obj;

		if (this.codigo == art2.codigo) {
			iguales = true;
		}

		return iguales;
	}

}
