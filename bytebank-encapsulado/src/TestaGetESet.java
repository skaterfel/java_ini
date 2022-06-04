
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente felipe = new Cliente();
		
		felipe.setNome("Felipe Melo");		
		felipe.setProfissao("Programador Java, JavaScript, Python");
		
		conta.setTitular(felipe);
		conta.getTitular().setCpf("123.123.123.11");
				
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
	}
}
