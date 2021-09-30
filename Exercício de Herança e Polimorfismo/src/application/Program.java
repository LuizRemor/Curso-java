package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmplyee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Qual a quantidade de funcionários?");
		int n = 3;
		
		for (int i=1; i<=n;i++) {
			System.out.printf("Dados do %dº funcionário:", i);
			
			System.out.print("O funcionário é terceirizado? (y/n)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas:");
			int hours = sc.nextInt();
			System.out.print("Valor por hora:");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Valor da taxa adicional por hora:");
				double additionalCharge = sc.nextDouble();
				
				Employee emp = new OutsourcedEmplyee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				
				//OU
				//list.add(new OutsourcedEmplyee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
				//OU
				//list.add(new Employee(name, hours, valuePerHour);
			}
			
		}

		System.out.println();
		System.out.println("Pagamentos:");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
	}

}
