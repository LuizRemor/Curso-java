package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.println("Qual o número de contribuintes?");
		int n = 3;
		
		for(int i=1; i<=n; i++) {
			System.out.println("É pessoa física ou jurídica? (f/j)");
			char tipo = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Renda: ");
			Double renda = sc.nextDouble();
			
			if(tipo == 'f') {
				System.out.println("Gasto com saúde");
				Double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, gastoSaude));

			}
			else {
				System.out.println("Funcionários");
				Integer numFunc = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, renda, numFunc));

			}
			
		}
		
		Double soma = 0.0;
		
		System.out.println("Imposto pago:");
		
		for (Contribuinte imposto : list) {
			
			Double impRec = imposto.impPago();
			
			System.out.println(imposto.toString());
			
			soma += impRec;
		}
		
		System.out.println("Total de imposto pago: R$" + soma);

		sc.close();
	}

}
