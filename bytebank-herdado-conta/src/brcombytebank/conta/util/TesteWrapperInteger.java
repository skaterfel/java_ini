package brcombytebank.conta.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		// Array
		int[] idades = new int[5];

		// Array de referencias
		String[] nome = new String[5];

		// List
		int idade = 29; // Interger

		Integer idadeRef = Integer.valueOf(29);

		// Usado pela linha de comando :> String s = args[0]; //"10"
		// Integer numero = Integer.valueOf(s);
		String s = "12";
		int numero = Integer.parseInt(s);

		// System.out.println(numero + idadeRef);

		List<Integer> numeros = new ArrayList<Integer>();
		//System.out.println(idadeRef);

		numeros.add(idadeRef);
		
		System.out.println(Integer.MAX_VALUE + 1);

		// Autoboxing - transforma primitivo em objeto

		// Wrapper embrulha o tipo primitivo

//		Integer ref = Integer.valueOf("3");
//        ref++;
//        System.out.println(ref);
		
	}

}
