package boletin1.ejercicio04;

public class Articulo {

	/**
	 * Atributo donde guardaremos el nombre del producto
	 */
	private String nombre;
	
	/**
	 * Atributo donde guardaremos el precio del producto
	 */
	private double precio;
	
	/**
	 * Atributo donde guardaremos la cantidad de productos disponibles
	 */
	private int productosDisponibles;

	/**
	 * Constante donde guardaremos el IVA
	 */
	public static final double IVA = 1.21;
	
	/**
	 * Constructor vacío
	 */
	public Articulo() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param nombre Parámetro donde se guardara el nombre del producto
	 * @param precio Parámetro donde se guardara el precio del producto
	 * @param productosDisponibles Parámetro donde se guardara la cantidad de productos disponibles
	 */
	public Articulo(String nombre, double precio, int productosDisponibles) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if (precio > 0) {
			this.precio = precio;			
		}
		
		if(productosDisponibles > 0) {
			this.productosDisponibles = productosDisponibles;			
		}
	}
	
	// GET/SET del atributo nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String dni) {
		this.nombre = dni;
	}

	// GET/SET del atributo precio
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
	// GET/SET del atributo productos disponibles
	public double getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(int productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	
	
	/**
	 * Método que imprime la información del producto introducido
	 */
	public void imprimirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Nombre del artículo: " + this.nombre);
		System.out.println("Precio del producto: " + this.precio);
		System.out.println("Productos disponibles: " + this.productosDisponibles);
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Método que calcula el precio con IVA del producto introducido
	 * @return Devuelve el precio final del producto
	 */
	public double getPVP () {
		double precioFinal = 0;
		
		precioFinal = this.precio * IVA;
		
		return precioFinal;
	}
	
	/**
	 * Método que calcula el precio final con descuento
	 * @param descuento Párametro para introducir la cantidad de descuento
	 * @return Devolvemos el precio final con descuento
	 */
	public double getPVPDescuento (double descuento) {
		double precioFinal = 0;
		
		precioFinal = getPVP() - (getPVP() * (descuento/100));
		
		return precioFinal;
	}
	
	/**
	 * Método que vende/elimina el producto deseado
	 * @param cantidadProductos Parámetro para introducir la cantidad de productos a vender
	 * @return Devolvemos si la acción se ha realizado o no con éxito
	 */
	public boolean vender (int cantidadProductos) {
		boolean accionRealizada = false;
		
		if (this.productosDisponibles > 0 && this.productosDisponibles > cantidadProductos) {
			this.productosDisponibles-= cantidadProductos;
			accionRealizada = true;
		}
		
		return accionRealizada;
	}
	
	/**
	 * Método para almacenar el producto deseado
	 * @param cantidadProductosAlmacenar Parámetro para introducir cuantos productos se desean almacenar 
	 */
	public void almacenar (int cantidadProductosAlmacenar) {
		this.productosDisponibles+=cantidadProductosAlmacenar;
	}
	
	
}
