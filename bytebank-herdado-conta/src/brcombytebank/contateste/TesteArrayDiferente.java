package brcombytebank.contateste;

import brcombytebank.contaherdado.*;

public class TesteArrayDiferente {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(123, 321);
		
		int[] refs = {1,2,3,4,5};
		
		for (int i : refs) {
			System.out.println(refs[i]);
		}
	}

}
