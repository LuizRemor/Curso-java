package aplication;

import java.util.Scanner;

import entities.funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.println("Salario Bruto: ");
		func.salario = sc.nextDouble();
		
		System.out.println("Valor de imposto: ");
		func.imposto = sc.nextDouble();
		
		double salarioLiquido = func.salarioLiquido();
		
		System.out.printf("Funcionário: %s, salario liquido $%.2f%n", func.nome, salarioLiquido);
		
		System.out.println("");
		
		System.out.println("Percentual de aumento no salário?");
		func.percAumento = sc.nextDouble();
		
		double aumentoDeSalario = func.aumentoSalario();
		
		System.out.printf("Atualização: %s, $%.2f", func.nome, aumentoDeSalario);
	
		sc.close();
		
	}

}