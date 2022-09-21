package exercise9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
	 edad = edad+1;
		System.out.println("Tu edad el próximo año será " + edad );
		sc.close();
	}

}

