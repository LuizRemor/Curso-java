package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		Client client = new Client();
		
		Order item = new Order();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.println("Nome:");
		String nome = "Luiz";
		System.out.println("E-mail:");
		String email = "luiz@gmail.com";
		System.out.println("Data de Nascimento:");
		Date birth = sdf.parse("09/04/1997");
		
		System.out.println("Entre com os dados do pedido:");
		System.out.println("Status: " + OrderStatus.PROCESSING);
		
		Order order = new Order(new Date(), OrderStatus.PROCESSING, client);		
		
		System.out.println("Quantos itens teremos no pedido?");
		int n = 2;
		
		for(int i=1; i<=n; i++) {
			
			System.out.printf("Entre com os dados do %dº pedido", i);
			System.out.println();
			System.out.println("Nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Preço do produto: ");
			double price = sc.nextDouble();
			
			Product prod = new Product(name, price);
			
			System.out.println("Quantidade: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(quantity, price, prod); 
			
			item.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();

	}

}
