package prueba01;

import java.util.Scanner;

public class suma {
	private static Scanner sc = new Scanner (System.in);
	public static void main(String [] args) {
		int suma=0;
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduce numero: ");
			System.out.println("Nueva línea.");
			suma+= sc.nextInt();
			
		}
		
		System.out.println("La suma es: " + suma);
		
	}
	
}