package entities;

public class funcionario {

	public String nome;
	public double salario, imposto, percAumento;

	public double salarioLiquido() {
		return salario - imposto;
	}

	public double aumentoSalario() {
		return (salario + (salario * percAumento/100)) - imposto;
	}
	
	public String toString() {
		return nome
			+ ", $"
			+ String.format("%.2f", salarioLiquido());
	}

}