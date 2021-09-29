package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date();
	private Status status;
	private Client client;
	private List<Item> itemProd = new ArrayList<>();
	private Item item = new Item();
	
	public Pedido() {
		
	}

	public Pedido(Date moment, Status status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Item> getitemProd() {
		return itemProd;
	}
	
	public void addItem(Item itemPed) {
		itemProd.add(itemPed);
	}
	
	public void removeItem(Item itemPed) {
		itemProd.remove(itemPed);
	}
	
	public double total() {
		double sum = 0.0;
		
		for(Item tot : itemProd) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data do pedido ");
		sb.append(sdf.format(moment) + "/n");
		sb.append("Status: ");
		sb.append(status + "/n");
		sb.append("Cliente: ");
		sb.append(client + "/n");
		sb.append("Itens do pedido: /n");
		for (Item itens : itemProd) {
			sb.append(itens + "/n");
		}
		sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}