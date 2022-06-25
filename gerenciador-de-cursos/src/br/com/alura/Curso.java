package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	
	private String titulo;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
//	private Set<Aluno> alunos = new TreeSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	
	

	public Curso(String titulo, String instrutor) {
		this.titulo = titulo;
		this.instrutor = instrutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void remover(Aula aula) {
		this.aulas.remove(aula);
	}
	
	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
		
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Curso: " + this.titulo + ", " + "Tempo total: " + this.getTempoTotal();
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		// TODO Auto-generated method stub
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		return matriculaParaAluno.get(numero);
	}
	
	
	
}

