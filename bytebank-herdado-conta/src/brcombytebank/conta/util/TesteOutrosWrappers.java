package brcombytebank.conta.util;

import java.lang.Number;
import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(90); //autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(29);
		System.out.println(dRef.doubleValue()); 
		
		Long lRef = Long.valueOf(9223372036854775807l);
		System.out.println(Long.MAX_VALUE + " + " + Long.MIN_VALUE);
		
		Boolean bool = Boolean.FALSE;
		System.err.println(bool.booleanValue());
		
		//Testando Wrappers.
		
		Number num = Integer.valueOf(2123);
		
		List<Number> lista = new ArrayList<>();
		lista.add(123);
		lista.add(1.2);
		lista.add(123123.2f);
		
		System.out.println(lista); // Lista como no JS h
		
		
		
		
	}
}
