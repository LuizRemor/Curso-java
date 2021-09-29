package Programa;

import java.util.Scanner;

import util.calculadora2;

public class Programa3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = calculadora2.circunferencia(raio);
		double v = calculadora2.volume(raio);
		
		System.out.printf("Circunferência = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("PI = %.2f%n", calculadora2.PI);
		
		sc.close();

	}
	
	

}
