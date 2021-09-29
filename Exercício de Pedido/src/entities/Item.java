package entities;

public class Item {
	
	private Integer quantity;
	private Double price;
	private Products product;
	
	public Item() {
	
	}

	public Item(Integer quantity, Double price, Products product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity*price;
	}

	@Override
	public String toString() {
		return product.getName()
			   + ", $"
			   + String.format("%.2f", price)
			   + ", Quantity: "
			   + quantity
			   + ", Subtotal: $"
			   + String.format("%.2f", subTotal());
	}

	
	
}