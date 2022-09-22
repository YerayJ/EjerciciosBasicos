package exercise17;

import java.util.Scanner;

public class Exercise17 {

	/*
	 * Escribe un programa en el que declares una constante IVA de valor igual a 21.
	 * A continuación, pídele un precio al usuario (recuerda que los precios
	 * contienen decimales) y calcula cuál será el precio final con el IVA aplicado.
	 * 
	 */

	public static void main(String[] args) {
		// Creamos la constante y la variable.
		final double IVA = 0.21;
		float precio;

		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la variable al usuario, en este caso el precio
		System.out.print("Deme un precio para añadirle el IVA: ");
		precio = sc.nextFloat();

		// A continuación calcularemos el IVA. Primero calculo cual es el IVA del precio
		// y después se lo sumo al precio original
		double prefinal = precio * IVA;
		System.out.print("El precio con IVA es de: " + (precio + prefinal));

		sc.close();

	}

}