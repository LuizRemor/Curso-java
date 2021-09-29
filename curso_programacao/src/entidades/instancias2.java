package entidades;

import java.util.Scanner;

public class instancias2 {
	
	Scanner sc = new Scanner(System.in);

	public instancias2(double valorAtualizado, double novoValorAtualizado, double valorDeParcela, double valorTotal, int parcela) {
		
		this.valorAtualizado = valorAtualizado;
		this.novoValorAtualizado = novoValorAtualizado;
		this.valorDeParcela = valorDeParcela;
		this.valorTotal = valorTotal;
		this.parcela = parcela;
	}

	//O valor atualizado posteriormente vai receber o valor que vem do banco de dados
	
			private double valorAtualizado = sc.nextDouble();
			private double novoValorAtualizado;
			private double valorDeParcela;
			private double valorTotal;
			
			System.out.printf("Valor atualizado de R$%.2f%n%n", valorAtualizado);
			
			for(int parcela=1; parcela<=4; ++parcela) {
				
				if (parcela==1) {
					novoValorAtualizado = -valorAtualizado*0.03+valorAtualizado;
					valorDeParcela = novoValorAtualizado/parcela;
				}
				else if(parcela==2) {
					novoValorAtualizado = -valorAtualizado*0.02+valorAtualizado;
					valorDeParcela = novoValorAtualizado/parcela;
				}
				else if(parcela==3) {
					novoValorAtualizado = -valorAtualizado*0.01+valorAtualizado;
					valorDeParcela = novoValorAtualizado/parcela;
				}
				else {
					novoValorAtualizado = valorAtualizado;
					valorDeParcela = novoValorAtualizado/parcela;
				}
				
				valorTotal = valorDeParcela*parcela;
				
				System.out.printf("%dx de R$ %.2f", parcela, valorDeParcela);
				
				System.out.printf(" valor total de R$%.2f%n", novoValorAtualizado);
			}
		}

}
