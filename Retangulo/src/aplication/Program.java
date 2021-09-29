package aplication;

import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo();
		
		System.out.println("Qual a altura do retângulo?");
		
		ret.altura = sc.nextDouble();
		
		System.out.println("Qual a largura do retângulo?");
		
		ret.largura = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", ret.area());
		System.out.printf("Perímetro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		
		sc.close();
	
	}
	
}