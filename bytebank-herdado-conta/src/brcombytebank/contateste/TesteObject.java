package brcombytebank.contateste;

import brcombytebank.*;
import brcombytebank.contaherdado.ContaCorrente;
import brcombytebank.contaherdado.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 122);
		ContaPoupanca cp = new ContaPoupanca(345, 128);
		
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
	}

}
