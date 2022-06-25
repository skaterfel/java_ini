package br.com.alura.teste;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno com matricula 32672?");
		Aluno aluno = javaColecoes.buscaMatriculado(123);
		System.out.println("Aluno: " + aluno);
		
		
		
		
		
	}
}
