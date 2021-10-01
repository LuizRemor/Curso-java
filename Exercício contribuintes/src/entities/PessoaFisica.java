package entities;

public class PessoaFisica extends Contribuinte{

	protected Double gastoSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String name, Double renda, Double gastoSaude) {
		super(name, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double impPago() {
		
		Double imposto;
		
		if(gastoSaude < 0) {
			if(renda < 20000) {
				imposto = renda*0.15;
			}
			else {
				imposto = renda*0.25;
			}
		}
		else {
			if(renda < 20000) {
				imposto = renda*0.15-gastoSaude*0.5;
			}
			else {
				imposto = renda*0.25-gastoSaude*0.5;
			}
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Nome: " + name + " $" + impPago();
	}
	
	
	
}
