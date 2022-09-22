package exercise13;

import java.util.Scanner;

public class Exercise13 {

	/*
	 * Escribir un programa que le pida dos números al usuario. A continuación, debe
	 * mostrar la suma, la resta, la multiplicación y la división de ambos números.
	 * Debe mostrarse el resultado de cada operación en una línea distinta.
	 * 
	 */

	public static void main(String[] args) {
		// Creamos un escáner para introducir datos. Pedimos dos números.
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos números: ");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
	
		//Creamos variables para todas las operaciones.
		
		float suma = num1+num2;
		float resta = num1-num2;
		float mult =  num1*num2;
		float div = num1/num2;
		
		// Mostramos el resultado por líneas separadas con println.
		
		System.out.println("Los resultados son: ");
		System.out.println("El resultado de la suma es " + suma );
		System.out.println("El resultado de la resta es " + resta );		
		System.out.println("El resultado de la multiplicación es " + mult );		
		System.out.println("El resultado de la división es " + div );
		
	}

}
