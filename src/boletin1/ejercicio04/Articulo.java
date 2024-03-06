package boletin1.ejercicio04;

public class Articulo {

	private String nombre;
	
	private double precio;
	
	private int productosDisponibles;

	public static final double IVA = 1.21;
	
	public Articulo() {
		super();
	}

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
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String dni) {
		this.nombre = dni;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
	public double getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(int productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	
	
	/**
	 * 
	 */
	public void imprimirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Nombre del artículo: " + this.nombre);
		System.out.println("Precio del producto: " + this.precio);
		System.out.println("Productos disponibles: " + this.productosDisponibles);
		System.out.println("-------------------------------------");
	}
	
	public double getPVP () {
		double precioFinal = 0;
		
		precioFinal = this.precio * IVA;
		
		return precioFinal;
	}
	
	public double getPVPDescuento (double descuento) {
		double precioFinal = 0;
		
		precioFinal = getPVP() - (getPVP() * (descuento/100));
		
		return precioFinal;
	}
	
	public boolean vender (int cantidadProductos) {
		boolean accionRealizada = false;
		
		if (this.productosDisponibles > 0 && this.productosDisponibles > cantidadProductos) {
			this.productosDisponibles-= cantidadProductos;
			accionRealizada = true;
		}
		
		return accionRealizada;
	}
	
	public void almacenar (int cantidadProductosAlmacenar) {
		this.productosDisponibles+=cantidadProductosAlmacenar;
	}
	
	
}
