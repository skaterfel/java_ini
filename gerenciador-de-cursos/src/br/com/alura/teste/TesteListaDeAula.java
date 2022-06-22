package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TesteListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Coisas Revistando as Listas", 21);
		Aula a2 = new Aula("Lista de Objetos", 15);
		Aula a3 = new Aula("A descoberta do Relacionamento de listas e objetos", 10);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);

		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
		
	}
}
