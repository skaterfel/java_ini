package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteIO {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("test.txt");
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Um arquivo criado via java, a leitura sera realizada a seguir.");
		bw.newLine();
		bw.write("Um arquivo criado via java, a leitura sera realizada a seguir.");
		
		bw.close();
		
		InputStream is = new FileInputStream("test.txt");
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		String linhas = br.readLine();
		
		while (linhas != null) {
			System.out.println(linhas);
			linhas = br.readLine();
		}
		
		br.close();
		
		
	}

}
