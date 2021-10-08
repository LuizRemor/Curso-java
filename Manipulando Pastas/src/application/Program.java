package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = "C:\\Temp";
		
		File path = new File(strPath);
		
		System.out.println("PASTAS: ");
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println(folders);
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("ARQUIVOS: ");
		File[] files = path.listFiles(File::isFile);
		System.out.println(files);
		for(File file : files) {
			System.out.println(file);
		}
		
		
		boolean success = new File(strPath + "\\TESTE2").mkdir();
		System.out.println("Durectory created successfully: " + success);
		
		sc.close();

	}

}