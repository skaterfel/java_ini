package brcombytebank.contateste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import brcombytebank.contaherdado.Cliente;
import brcombytebank.contaherdado.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("Felipe");
		cliente.setProfissao("Developer");
		cliente.setCpf("12312312311");
		
		ContaCorrente cc = new ContaCorrente(222,221);
		cc.setTitular(cliente);
		cc.deposita(123.43);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		
	}

}
