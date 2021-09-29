package entidades;

import java.util.Scanner;

public class instancias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//O valor atualizado posteriormente vai receber o valor que vem do banco de dados
		double valorAtualizado = sc.nextDouble();
		double novoValorAtualizado;
		double valorDeParcela;
		double valorTotal;
		
		System.out.printf("Valor atualizado de R$%.2f%n%n", valorAtualizado);
		
		for (int parcela=1 ;parcela<=4; ++parcela) {
			
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