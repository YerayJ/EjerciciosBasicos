package exercise15;

import java.util.Scanner;

public class Exercise15 {

	/*
	 * Escribe un programa que pida al usuario su nombre y su edad y muestre por
	 * pantalla el siguiente mensaje: “Hola Juanito, tienes 21 años, ¡qué mayor
	 * eres!”. Los datos en rojo son los datos introducidos por el usuario.
	 * 
	 */

	public static void main(String[] args) {
		// Declaramos las variables
		String name;
		int age;
		
		// Creamos un escaner para introducir información
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el nombre y la edad
		System.out.println("Deme su nombre: ");
		name = sc.nextLine();
		System.out.println("Deme su edad: ");
		age = sc.nextInt();
		
		// Imprimimos por pantalla el resultado
		System.out.print("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres! ");
		
		sc.close();
		
	}

}
