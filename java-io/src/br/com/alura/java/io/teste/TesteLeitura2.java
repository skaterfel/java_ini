package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNext()) { // tem proxima linha?
			//linha por linha
			String linha = scanner.nextLine();
//			System.out.println(linha);
			// separa valor por linha
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);
			System.out.println(valor4);
			System.out.println(valor5);
			System.out.println("--------");
			
			
			linhaScanner.close();
			
//			String [] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			
			
			
		}
		
		
		
		
		scanner.close();
	}

}
