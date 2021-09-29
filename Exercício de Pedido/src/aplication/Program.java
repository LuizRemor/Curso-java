package aplication;

import java.text.ParseException;
import java.util.Scanner;

import entities.Client;
import entities.Item;
import entities.Pedido;
import entities.Products;
import entities.enums.Status;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Item item = new Item();
		Pedido pedido = new Pedido();
		Products prod = new Products();
		Client client = new Client();
		
		
		System.out.println("Entre com os dados do cliente:/n");
		System.out.println("Nome: ");
		
		
		sc.close();

	}

}
