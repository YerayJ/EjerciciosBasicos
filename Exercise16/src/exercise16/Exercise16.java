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
		// Declaramos las variables. El valor de euro es lo que vale una peseta
		double pes;
		double eur = 0.0066;

		// Creamos un escaner para introducir información
		Scanner sc = new Scanner(System.in);
		
		//Pedimos variable
		System.out.println("Dame la cantidad en pesetas: ");
		pes = sc.nextInt();
		
		//Creamos un conversor
		double conv = pes*eur ; 
		
		//Imprimimos el resultado por pantalla
		System.out.print("El resultado de pesetas es: " + conv);
		
		sc.close();
		
	}

}
