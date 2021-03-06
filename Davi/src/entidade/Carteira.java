package entidade;

import java.util.ArrayList;
import java.util.List;

public class Carteira {

	private List<Cliente> clientes;

	public Carteira() {

		this.clientes = new ArrayList<Cliente>();

	}

	public void adiciona(Cliente cliente) {

		this.clientes.add(cliente);

	}

	public void imprime() {

		for (Cliente cliente : clientes) {

			System.out.println(cliente.toString());

		}

	}

	public void imprime(String prefixo) {

		for (Cliente cliente : clientes) {

			if (cliente.iniciaCom(prefixo)) {

				System.out.println(cliente.toString());

			}

		}

	}
	
	
	public Integer retornaId(String nome) {
		
		for (Cliente cliente : clientes) {
			
			if(cliente.getNome().contains(nome)) {
				
				return cliente.getId();
				
			}
			
		}
		
		return -1;
			
	}
	
	

}
