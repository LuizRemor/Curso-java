package Davi;

import entidade.Carteira;
import entidade.Cliente;

public class Exemplo {

	public static void main(String[] args) {

		Carteira carteira = new Carteira();
		
		carteira.adiciona(new Cliente(1,"Luiz","CLIENTE"));
		carteira.adiciona(new Cliente(2,"Andr�","CLIENTE"));
		carteira.adiciona(new Cliente(3,"Michael","CLIENTE"));

		System.out.println("=============================");

		carteira.imprime();
		
		System.out.println("=============================");

		carteira.imprime("A");
		
		System.out.println("=============================");
		
		System.out.println(carteira.retornaId("Luiz"));


	}

}
