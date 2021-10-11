package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contrato contrato, int meses) {
		double valorSemJuros = contrato.getValorContrato() / meses;
		for(int i=1; i<=meses; i++) {
			double valorAtualizado = valorSemJuros + onlinePaymentService.juros(valorSemJuros, i);
			double parcelaFinal = valorAtualizado + onlinePaymentService.taxa(valorAtualizado);
			Date vencimento = adicionaMes(contrato.getDataContrato(), i);
			contrato.getParcelas().add(new Parcela(parcelaFinal, vencimento));
		}
	}
	
	private Date adicionaMes(Date data, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(calendar.MONTH, n);
		return calendar.getTime();
	}
	
}
