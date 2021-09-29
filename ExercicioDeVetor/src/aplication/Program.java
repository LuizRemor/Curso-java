package aplication;

import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		Quartos [] vect = new Quartos[10];
		
		System.out.println("Quantos alunos irão ficar hospedados?");
		
		int quantidade = sc.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println();
			System.out.println("Aluno #" + i + ":");
			System.out.println("Qual o nome do hospede?");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println();
			System.out.println("Qual o email do hospede?");
			String email = sc.nextLine();
			System.out.println();
			System.out.println("Qual o quarto do hospede?");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		
		for(int qtd = 0; qtd < 10; qtd++) {
			
			if(vect[qtd] != null){
				System.out.println(qtd + ": " + vect[qtd]);
			}
		}
		
		sc.close();
	
	}
}
