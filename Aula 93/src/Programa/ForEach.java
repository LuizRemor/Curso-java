package Programa;

import java.util.Scanner;

public class ForEach {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//EXEMPLO DE "for each"
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//FORMA ANTIGA
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		System.out.println();
		
		System.out.println("for each abaixo:");
		
		//EXEMPLO DE "for each"
		
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
