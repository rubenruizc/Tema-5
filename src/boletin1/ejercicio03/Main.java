package boletin1.ejercicio03;

public class Main {

	public static void main(String[] args) {
		
		// Creamos objetos con los valores predeterminados
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(6, 8);
        
        // Imprimimos las coordenadas de los puntos
        System.out.println("Coordenadas del punto 1: " + punto1.imprime());
        System.out.println("Coordenadas del punto 2: " + punto2.imprime());
        
        // Modificamos las coordenadas del punto 1
        punto1.setXY(5, 6);
        System.out.println("Nuevas coordenadas del punto 1: " + punto1.imprime());
        
        // Desplazamos el punto 2
        punto2.desplaza(2, 3);
        System.out.println("Coordenadas del punto 2 después de desplazar: " + punto2.imprime());
        
        // Calculamos la distancia entre los puntos
        double distancia = punto1.distancia(punto2);
        System.out.println("La distancia entre los puntos es: " + distancia);
    
	} // Cierre del main

} // Cierre de la clase
