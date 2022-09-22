package exercise14;

import java.util.Scanner;

public class Exercise14 {

	/*
	 * Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
	 * Guarda cada dato en variables distintas. A continuación, muestra los datos de
	 * la siguiente forma (en rojo serían los datos introducidos por el usuario):
	 * 
	 */

	public static void main(String[] args) {
		// Creamos un escaner para introducir información
		Scanner sc = new Scanner(System.in);
	
		// Pedimos los datos de la persona en este caso también usamos String
		
		System.out.println("Deme su nombre: ");
		String nom = sc.nextLine();
		System.out.println("Deme su dirección: ");
		String dir = sc.nextLine();
		System.out.println("Deme su télefono: ");
		int tlf = sc.nextInt();
		
		//Imprimimos en pantalla los datos 
		
		System.out.println("Nombre: " + nom);
		System.out.println("Dirección: " + dir);
		System.out.println("Teléfono: " + tlf);
		
		sc.close();

	}

}
