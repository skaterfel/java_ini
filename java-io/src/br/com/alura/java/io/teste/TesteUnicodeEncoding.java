package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws Exception {
		String s = "�";
		System.out.println(s.codePointAt(0));
		
		Charset charter = Charset.defaultCharset();
		System.out.println(charter.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(sNovo);
	
		String s1 = "13� �rg�o Oficial";
		bytes = s1.getBytes(StandardCharsets.UTF_8);
		String s2 = new String(bytes, "UTF-8");
		System.out.println(s2);
	}

}
