package br.com.alura.teste;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

//    	// Busca mais lenta
//        Collection<Integer> numeros = new ArrayList<Integer>();
//
//        long inicio = System.currentTimeMillis();
//
//        for (int i = 1; i <= 50000; i++) {
//            numeros.add(i);
//        }
//
//        for (Integer numero : numeros) {
//            numeros.contains(numero);
//        }
//
//        long fim = System.currentTimeMillis();
//
//        long tempoDeExecucao = fim - inicio;
//
//        System.out.println("Tempo gasto: " + tempoDeExecucao);
        
     // Busca mais rapida
        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}