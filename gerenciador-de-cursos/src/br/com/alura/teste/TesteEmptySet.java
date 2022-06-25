package br.com.alura.teste;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
	}

}
