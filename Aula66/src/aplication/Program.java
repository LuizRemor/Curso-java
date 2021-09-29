package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quais as medidas do triângulo X? ");
		
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		double px = (xa+xb+xc)/2;
		
		double areaX = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		
		System.out.println("Quais as medidas do triângulo Y? ");

		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double py = (ya+yb+yc)/2;
		
		double areaY = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		System.out.printf("Triângulo X: %.4f%n", areaX);
		System.out.printf("Triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: triângulo X.");
		}
		else 
			System.out.println("Maior área: triângulo Y.");
	
	sc.close();
		
	}
}