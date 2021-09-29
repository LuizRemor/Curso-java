package Util;

import java.util.Scanner;

public class Logica {

	Scanner sc = new Scanner(System.in);

	private int conta;
	private String titular;
	private double saldo;

	public Logica() {

	}

	public Logica(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public Logica(int conta, String titular, double depInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double saque) {
		saldo -= (saque + 5);
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public String toString() {
		return "Conta: " + conta + ", Titular: " + titular + ", saldo: R$" + saldo;
	}

}
