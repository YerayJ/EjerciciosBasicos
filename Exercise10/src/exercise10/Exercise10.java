package exercise10;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Creamos un escáner para introducir datos
		System.out.println("Introduce el año actual: ");
		int year = sc.nextInt();
		System.out.println("Introduce tu fecha de nacimiento: ");
		int date = sc.nextInt();
		
//Pedimos los datos y los almacenamos en variables.
		
		int age = year - date;
		
//Creamos una variable en la que restemos el año de nacimiento con la fecha actual
		
		System.out.println("Tu edad es: " +  age);

//Por último imprimimos por pantalla la edad de la persona

		sc.close();
	}

}
