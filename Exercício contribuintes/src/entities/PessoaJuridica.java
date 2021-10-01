package entities;

public class PessoaJuridica extends Contribuinte{

	protected Integer numFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String name, Double renda, Integer numFunc) {
		super(name, renda);
		this.numFunc = numFunc;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public Double impPago() {
		
		Double imposto;
		
		if(numFunc <= 10) {
			imposto = renda*0.16;
		}
		else {
			imposto = renda*0.14;
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Nome " + name + " $" + String.format("%.2f", impPago());
	}
	
	
	
}
