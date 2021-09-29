package aplication;

import java.util.Scanner;

import entities.triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		triangulo x, y;
		
		x = new triangulo();
		y = new triangulo();

		System.out.println("Entre com as medidas do triangulo x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	
		System.out.println("Entre com as medidas do triangulo y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.2f%n", areaX);
		System.out.printf("Área do triângulo Y: %.2f%n", areaY);
		
		if(areaX>areaY) {
			System.out.println("Maior área: triangulo X");
		}
		else {
			System.out.println("Maior área: triangulo Y");
		}
		
		sc.close();
	
	}
	
}