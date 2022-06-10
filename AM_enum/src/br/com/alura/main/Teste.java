package br.com.alura.main;

public class Teste {
	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIM;
		Prioridade pMax = Prioridade.MAX;
		Prioridade pNor = Prioridade.NORMAL;
		
		System.out.println(pMin.name());
		System.out.println(pNor.name());
		System.out.println(pMax.name());

		
		System.out.println(pMin.ordinal());
		System.out.println(pNor.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pNor.getValor());
		System.out.println(pMax.getValor());
		

		
		// Definir prioridade.
	}
}
