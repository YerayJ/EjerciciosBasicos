package exercise11;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Creamos un escáner para introducir datos
		System.out.println("Pásame dos números: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
//Pedimos los dos números guardandolos en variables double por si nos pasan decimales
		double res = num1+num2;
//Hago una variable que se llama resultado para sumar las dos variables.
		double media = res/2;
//Y la misma variable la divido entre dos que son el número de variables, y así sacaríamos el promedio
		System.out.println(media);
//Por último imprimimos el resultado por pantalla	
		
		sc.close();
	}

}
