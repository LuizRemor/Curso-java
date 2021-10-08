package entities;

public class ItensVendidos {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public ItensVendidos(String nome, Double preco, Integer quantidade) {
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return preco*quantidade;
	}
	
	@Override
	public String toString() {
		return getNome() + "," + getPreco() + "," + getQuantidade();
	}
}