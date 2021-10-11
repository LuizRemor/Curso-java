package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numContrato, Date dataContrato, Double valorContrato) {
		this.numContrato = numContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

}