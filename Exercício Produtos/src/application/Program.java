package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");;
	
		
		int n = 3;
		
		System.out.printf("Número de itens: %d", n);
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Dados do %dº produto", i);
			System.out.println();
			
			System.out.println("Comum, usado ou importado? (c/u/i)");
			char tipo = sc.next().charAt(0);
			
			System.out.println("Qual o nome do produto?");
			String name = sc.next();
			
			System.out.println("Qual o preço do produto?");
			Double price = sc.nextDouble();
			
			if(tipo == 'c') {
				list.add(new Product(name, price));
			}
			
			else if(tipo == 'u') {
				System.out.println("Qual a data de fabricação do produto?");
				Date dateFab = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, dateFab));
			}
			else {
				System.out.println("Qual o valor de costomsFee?");
				double costomsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, costomsFee));
			}
			
		}
		
		System.out.println();
		
		System.out.println("Lista de produtos:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
