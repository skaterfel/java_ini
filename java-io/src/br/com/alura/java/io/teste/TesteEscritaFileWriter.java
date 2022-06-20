package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws Exception {

		// fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));
		
		bw.write("BOM DIA PRIMEIRA LINHA USANDO WRITER, agora usando FileWriter");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("BOM DIA 'Segunda!' LINHA USANDO TIM CLIENTE, agora usando FileWriter");
		bw.write(System.lineSeparator());
		bw.write("BOM DIA 'Segunda!' LINHA USANDO WRITER, agora usando FileWriter osidhkjashdfjkahsdlkjfhasldkjhfalkjsd");
		bw.close();
	}

}
