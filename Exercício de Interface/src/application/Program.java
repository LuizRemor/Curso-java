package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ContractService;
import services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//System.out.println("Entre com os dados do contrato:");
		//System.out.println("Número do contrato: ");
		Integer numContrato = 8028;
		//System.out.println("Data do contrato: ");
		Date dataContrato = sdf.parse("11/10/2021");
		//System.out.println("Valor do contrato: ");
		Double valorContrato = 600.0;
		//System.out.println("Número de parcelas: ");
		Integer numParcelas = 3;
		
		Contrato contrato = new Contrato(numContrato, dataContrato, valorContrato);
		
		ContractService cs = new ContractService(new PayPalService());
		
		cs.processContract(contrato, numParcelas);
		
		System.out.println("PARCELAMENTO: ");
		
		for(Parcela parc : contrato.getParcelas()) {
			System.out.println(parc);
		}

		sc.close();
		
	}

}