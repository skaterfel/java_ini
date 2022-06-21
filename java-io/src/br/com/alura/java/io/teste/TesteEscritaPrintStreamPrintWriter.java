package br.com.alura.java.io.teste;

import java.io.PrintWriter;
 
public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws Exception {

		// fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));
		
		// PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem7.txt");
		ps.println("BOM DIA PRIMEIRA LINHA USANDO WRITER, agora usando FileWriter");
		ps.println("lajhiuehiuaehdiuaheiuhediuhaeiuhdaiuehfakehefkaiuhdr");
		ps.println("");
		ps.println("");
		ps.println("Felipe Melo");
		
		ps.close();
	}

}
