package entities;

import java.util.Scanner;

public class ImportedProduct extends Product{
	
	Scanner sc = new Scanner(System.in);

	private double costomsFee;
	
	public ImportedProduct(String name, Double price, double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}

	public double getCostomsFee() {
		return costomsFee;
	}

	public void setCostomsFee(double costomsFee) {
		this.costomsFee = costomsFee;
	}
	
	char tag;
	
	public Double totalPrice() {
		
		return price += costomsFee;
	}

	@Override
	public String priceTag() {
		return this.name
			   + " $ "
			   + String.format("%.2f", totalPrice())
			   + "(Customs fee: $"
			   + String.format("%.2f", costomsFee)
			   + ")";
	}

}