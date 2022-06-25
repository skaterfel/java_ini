package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

//		Comparator<String> comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador);
//		palavras.sort((s1, s2) -> s1.length() - s2.length());// Lambda
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));// Lambda
//		palavras.sort(Comparator.comparing(s -> s.length()));// Lambda
		palavras.sort(Comparator.comparing(String::length)); // Metodo de Referencia
		
		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

		palavras.forEach(s -> System.out.println(s)); // Lambda
		palavras.forEach(System.out::println); // Metodo de Referencia

		//teste
		new Thread(() -> System.out.println("Execuntando um Runnable")).start();
	}
}
