package Programa;

import java.util.Scanner;

import Util.Conversao;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conversao conv = new Conversao();
		
		System.out.println("Qual o valor do dólar hoje?");
		conv.valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dólares pretendes comprar?");
		conv.quantDolar = sc.nextDouble();
		
		System.out.printf("Você deve pagar R$ %.2f", conv.converte());
		
		sc.close();

	}

}
