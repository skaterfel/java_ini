package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Transformar em bin 
//		String nome = "Felipe Melo";

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
	
		// De bin para class 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome =  ( String ) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		
	}

}
