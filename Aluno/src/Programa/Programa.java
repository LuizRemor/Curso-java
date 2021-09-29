package Programa;

import java.util.Scanner;

import Entidades.Calculos;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculos calc = new Calculos();
		
		System.out.println("Qual o nome do aluno?");
		calc.nome = sc.nextLine();
		
		System.out.println("Qual a nota do aluno no primeiro trimestre?");
		calc.nota1 = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno no segundo trimestre?");
		calc.nota2 = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno no terceiro trimestre?");
		calc.nota3 = sc.nextDouble();
		
		System.out.println();
		
		if(calc.notaFinal() >= 60) {
			System.out.printf("Nota Final = ", calc.notaFinal());
			
			System.out.println("Aprovado!!");
		}
		else {
			System.out.printf("Nota Final = %.2f %n", calc.notaFinal());
		
			System.out.println("Reprovado");
			
			System.out.printf("Faltaram %.2f pontos", calc.faltando());
		}
			
		sc.close();
	}

}
