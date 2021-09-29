package Programa;

import java.util.Scanner;

import util.calculadora;

public class Programa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		calculadora calc = new calculadora();
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferência = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("PI = %.2f%n", calc.PI);
		
		sc.close();

	}
	
	

}
