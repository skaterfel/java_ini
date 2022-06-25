package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Iori Melo");
		alunos.add("Felipe Melo");
		alunos.add("Willi Alves");
		alunos.add("Rayane Camargo");
		alunos.add("Sueli Maria");
		alunos.add("Jose Melo");
		alunos.add("Jose Melo");
		
		System.out.println("Qtd alunos: " + alunos.size());
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	
		
		System.out.println(alunos.contains("Felipe Melo"));
		
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista);
		
		
		
		
	}
}
