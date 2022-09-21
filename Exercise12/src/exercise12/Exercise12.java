package exercise12;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
//Creamos un escáner para introducir datos		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el radio: ");
//Pido el radio en un formato double
		double radio = sc.nextDouble();
//Creo dos variables una en la que se usa la fórmula de la longitud y otra del área. (El math.pi sirve para que nos proporcione directamente el número PI) 		
		double lon = 2*Math.PI*radio;
		double area = Math.PI*Math.pow(radio,2);
//Por último imprimimos resultado por pantalla		
		System.out.println("La longitud es: " + lon + " y el area es " + area );
		
	}

}
