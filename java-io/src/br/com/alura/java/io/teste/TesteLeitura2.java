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
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s - %04d<->%06d %s R$ %.2f %n", 
					tipoConta, agencia, numero, titular, saldo);
			
			System.out.println(valorFormatado);
			
			
			linhaScanner.close();
			
//			String [] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			
			
			
		}
		
		
		
		
		scanner.close();
	}

}
