package services;

public interface OnlinePaymentService {

	double taxa(double quantia); 
	double juros(double quantia, int meses);
}
