package services;

public class PayPalService implements OnlinePaymentService{

	public static final double TAXA = 0.02;
	public static final double JUROS = 0.01;
	
	@Override
	public double taxa(double quantia) {
		return quantia*TAXA;
	}

	@Override
	public double juros(double quantia, int meses) {
		return quantia * meses * JUROS;
	}

}