package brcombytebank.contateste;

import brcombytebank.contaherdado.Conta;
import brcombytebank.contaherdado.ContaCorrente;
import brcombytebank.contaherdado.GuardadorDeContas;

public class TesteGuardadorConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuardadorDeContas gc = new GuardadorDeContas();
		Conta cc = new ContaCorrente(11, 22);
		gc.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(32, 43);
		gc.adiciona(cc2);
		
		int tamanho = gc.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = gc.getReferencia(0);
		
		System.out.println(ref);
	}

}
