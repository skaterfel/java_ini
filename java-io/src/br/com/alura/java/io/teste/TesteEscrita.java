package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws Exception {

		// fluxo de entrada com arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		
		bw.write("BOM DIA PRIMEIRA LINHA USANDO WRITER");
		bw.newLine();
		bw.newLine();
		bw.write("BOM DIA 'Segunda!' LINHA USANDO WRITER");
		bw.close();
	}

}
