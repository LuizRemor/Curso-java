package aplication;

import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Products produto = new Products(nome, preco, quantidade);
		
		System.out.println();
		
		System.out.println("Informações do produto: " + produto);
		
		System.out.println();
		
		System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
		quantidade = sc.nextInt();
		produto.adicionaProdutos(quantidade);
		
		System.out.println("Atualização do produto: " + produto);
		
		System.out.println();
		
		System.out.println("Entre com o número de produtos para ser retirados do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Atualização do produto: " + produto);
		
	sc.close();
		
	}
}