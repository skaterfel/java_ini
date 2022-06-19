package brcombytebank.conta.util;

import java.util.ArrayList;
import java.util.Iterator;

import brcombytebank.contaherdado.Cliente;
import brcombytebank.contaherdado.Conta;
import brcombytebank.contaherdado.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
		
//		
//		Conta cc = new ContaCorrente(11, 22);
//		Conta cc2 = new ContaCorrente(11, 22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		
//		System.out.println(igual);
//		
		
		ArrayList<Conta> list = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11, 22);
		list.add(cc);
		
		Conta cc2 = new ContaCorrente(32, 43);
		list.add(cc2);
		
		Conta cc3 = new ContaCorrente(32, 43);
		//list.add(cc3);
		
		
		boolean existe = list.contains(cc3);
		System.out.println("Ja existe? " + existe);
		
		
		for(Conta conta : list) {
			System.out.println(conta);
		}
		
		
	}

}
