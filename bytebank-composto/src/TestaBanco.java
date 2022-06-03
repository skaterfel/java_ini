
public class TestaBanco {

	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Melo";
		felipe.cpf = "012.345.678.90";
		felipe.profissao = "Programador";
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		
		contaDoFelipe.titular = felipe;
		
		System.out.println(contaDoFelipe.titular.nome);
		System.out.println(contaDoFelipe.titular.profissao);
		System.out.println(contaDoFelipe.titular.cpf);
		
		
	}
}
