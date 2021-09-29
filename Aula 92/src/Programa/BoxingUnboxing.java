package Programa;

import java.util.Scanner;

public class BoxingUnboxing {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//EXEMPLO DE BOXING
		int x = 20;
		
		Object obj = x;

		System.out.println(obj);
		
//EXEMPLO DE UNBOXING
		int x2 = 20;
		
		Object obj2 = x2;
		
		int y = (int) obj2;

		System.out.println(y);
		
//EXEMPLO DE CONVERSAO
		
		Integer x3 = 20;
		
		Object obj3 = x3*2;

		System.out.println(obj3);
		
		sc.close();
	}

}
