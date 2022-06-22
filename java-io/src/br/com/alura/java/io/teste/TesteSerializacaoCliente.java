package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Transformar em bin 
//		String nome = "Felipe Melo";

		Cliente cliente = new Cliente();
		cliente.setNome("Felipe");
		cliente.setProfissao("Developer");
		cliente.setCpf("12312312311");
		
		
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
	
		// De bin para class 
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente =  ( Cliente ) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getCpf());
		
		
	}

}
