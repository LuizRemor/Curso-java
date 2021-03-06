package entidade;

public class Cliente {

	private Integer id;
	private String nome;
	private String tipo;

	public Cliente() {

	}

	public Cliente(Integer id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	
	public String toString() {
		
		return this.nome;
		
	}

	
	public Boolean iniciaCom(String prefixo) {
		
		if(this.nome == null) {
			
			return false;
			
		}
		
		if(this.nome.startsWith(prefixo)) {
			
			return true;
			
		}
		
		return false;
		
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
