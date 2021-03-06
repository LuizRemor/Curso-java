package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//imprimir a data de hoje
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("25/06/2018");
		
		Date y2 = sdf2.parse("25/06/2018 16:46:00");
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("Data de hoje: " + sdf2.format(x1));
		
		sc.close();
		
	}
}
