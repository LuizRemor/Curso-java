package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	
	private Double valorParcela;
	private Date datas;

	public Parcela() {
		
	}

	public Parcela(Double valorParcela, Date datas) {
		this.valorParcela = valorParcela;
		this.datas = datas;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Date getDatas() {
		return datas;
	}

	public void setDatas(Date datas) {
		this.datas = datas;
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Parcela R$" + valorParcela + " - Data: " + sdf.format(datas);
	}
	
}