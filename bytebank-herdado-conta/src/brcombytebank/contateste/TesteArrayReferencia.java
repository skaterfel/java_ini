package brcombytebank.contateste;

import brcombytebank.contaherdado.ContaCorrente;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente conta1 = new ContaCorrente(123, 890);
		contas[1] = conta1;
		contas[0] = new ContaCorrente(221, 432);
		
		
		System.out.println(contas[1].getAgencia());
		
		System.out.println(contas[0]);
	}
}
