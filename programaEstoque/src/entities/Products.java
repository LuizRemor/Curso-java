package entities;

public class Products {

	public String nome;
	public double preco;
	public int quantidade;

	public Products() {

	}
	
	public Products(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {

		return preco * quantidade;
	}

	public void adicionaProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return  nome 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", " + quantidade 
				+ " unidades, Total: $"
				+ String.format("%.2f", valorTotalEmEstoque());

	}
}