package aplication;

import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo();
		
		System.out.println("Qual a altura do ret�ngulo?");
		
		ret.altura = sc.nextDouble();
		
		System.out.println("Qual a largura do ret�ngulo?");
		
		ret.largura = sc.nextDouble();
		
		System.out.printf("�rea: %.2f%n", ret.area());
		System.out.printf("Per�metro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		
		sc.close();
	
	}
	
}