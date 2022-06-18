package brcombytebank.contateste;

import brcombytebank.contaherdado.*;
public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente conta1 = new ContaCorrente(123, 890);
		contas[1] = conta1;
		contas[0] = new ContaCorrente(221, 432);
		
		Conta cp = new ContaPoupanca(123, 890);
		contas[2] = cp;
		
		System.out.println(contas[1].getAgencia());
		
		System.out.println(cp);
		System.out.println(contas[0]);
		
		ContaPoupanca ref = (ContaPoupanca) contas[2];
		System.out.println(ref);
		
		
		
		
	}
}
