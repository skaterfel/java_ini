package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico"); 
        
        alunos.remove("Paulo");
        
        
        alunos.add("Felipe");
        
        alunos.forEach(aluno -> {
        	System.out.println(aluno);
        });
	}

}
