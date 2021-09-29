package entities;

import java.util.ArrayList;
import java.util.List;

public class Products {
	
	private String name;
	private Double price;
	
	public Products() {
	}

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getprice() {
		return price;
	}

	public void setprice(Double price) {
		this.price = price;
	}
	
	public void addProducts(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void removeProducts(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	

}