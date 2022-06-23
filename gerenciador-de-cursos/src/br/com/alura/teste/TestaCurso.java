package br.com.alura.teste;

import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveria");
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
