package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quais as medidas do tri�ngulo X? ");
		
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		double px = (xa+xb+xc)/2;
		
		double areaX = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		
		System.out.println("Quais as medidas do tri�ngulo Y? ");

		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double py = (ya+yb+yc)/2;
		
		double areaY = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		System.out.printf("Tri�ngulo X: %.4f%n", areaX);
		System.out.printf("Tri�ngulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior �rea: tri�ngulo X.");
		}
		else 
			System.out.println("Maior �rea: tri�ngulo Y.");
	
	sc.close();
		
	}
}