package exercise16;

import java.util.Scanner;

public class Exercise16 {

	/*
	 * Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te
	 * introduzca el valor en pesetas y, a posteriori, debes mostrarle el resultado
	 * de la conversión.
	 * 
	 */

	public static void main(String[] args) {
		// Declaramos la variable.
		Float pes;

		// Creamos un escaner para introducir información
		Scanner sc = new Scanner(System.in);

		// Pedimos variable
		System.out.println("Deme la cantidad en pesetas: ");
		pes = sc.nextFloat();

		 /*Imprimimos el resultado por pantalla. Lo que hace el print f sería coger un
		 parámetro en este caso el porcentaje sería el número entero y separamos con
		 un punto la parte decimal donde indicamos que queremos solo dos caracteres de
		 tipo float con la f. A continuación le añado a la sintaxis el signo de euro y
		 por último despúes de la coma se indican los parámetros y multiplico la
		 variable pasada por el usuario por el valor de una peseta en euros
		 */
		 
		System.out.printf("El resultado de pesetas es: %.2f" + "€", (pes * 0.006));

		sc.close();

	}

}
