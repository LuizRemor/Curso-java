package Programa;

import java.util.Scanner;

public class Programa1 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferência = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("PI = %.2f%n", PI);
		
		sc.close();

	}
	
	public static double circunferencia(double raio) {
		return 2*PI*raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}

}
