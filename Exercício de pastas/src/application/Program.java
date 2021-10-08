package application;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
	
	//NÃO CONSEGUI FAZER

	public static void main(String[] args) throws ParseException, IOException {
		
		File arquivo = new File("C:\\Temp\\Produtos.csv");
		Scanner sc = null;
		//List<ItensVendidos> list = new ArrayList<>();
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}

