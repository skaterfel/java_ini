package brcombytebank.conta.util;

import java.util.LinkedList;
import java.util.List;

import brcombytebank.contaherdado.Conta;
import brcombytebank.contaherdado.ContaCorrente;

public class TesteLinkledList {

	public static void main(String[] args) {
		// introdução java.util | ArrayList
		
		
		//Generics 
		List<Conta> list = new LinkedList<Conta>();
				
		Conta cc = new ContaCorrente(11, 22);
		list.add(cc);
		
		Conta cc2 = new ContaCorrente(32, 43);
		list.add(cc2);
		
		System.out.println("Tamanho: "+list.size());
		Conta ref = list.get(0);
		
		System.out.println(ref.getNumero());

		list.remove(0);
		
		System.out.println("Tamanho: "+list.size());
		
		Conta cc3 = new ContaCorrente(24, 656);
		list.add(cc3);
		
		Conta cc4 = new ContaCorrente(4343, 2434);
		list.add(cc4);
		
		for (int i = 0; i < list.size(); i++) {
			Object oRef = list.get(i);
			System.out.println(oRef);
		}
		
		
		System.out.println("----------------------");
		for(Conta conta : list) {
			System.out.println(conta);
		}
		
		
	}

}
