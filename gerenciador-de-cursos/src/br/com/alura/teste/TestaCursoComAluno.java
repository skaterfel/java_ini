package br.com.alura.teste;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveria");
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 32672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Carlos Alberto", 23452);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		System.out.println("Todos alunos matriculadors: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		
		System.out.print("O aluno " + a1 + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 32672);
		System.out.println("E esse turini, está matriculado ? ");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 é equals ao turini?");
		System.out.println(a1.equals(turini));
		
		System.out.println(turini.hashCode());
		System.out.println(a1.hashCode());
		
		//reescrever o equals e reescrever o hackCode
		
		for (Aluno a  : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		
		System.out.println("---------------------------------------------------------");
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		System.out.println("---------------------------------------------------------");
		
	}

}
