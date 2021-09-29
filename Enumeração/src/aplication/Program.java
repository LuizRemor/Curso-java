package aplication;

import java.util.Date;

import entities.Pedido;
import entities.enums.Enumeracao;

public class Program {

	public static void main(String[] args) {
		
		Pedido ped = new Pedido(1080, new Date(), Enumeracao.AGUARDANDO_PAGAMENTO);
		
		System.out.println(ped);
		
		Enumeracao os1 = Enumeracao.ENTREGUE;
		
		Enumeracao os2 = Enumeracao.valueOf("ENTREGUE");
		
		System.out.println(os1);
		
		System.out.println(os2);

	}

}
