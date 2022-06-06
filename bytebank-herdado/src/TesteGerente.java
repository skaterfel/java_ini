
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();

		g1.setCpf("1230902912");
		g1.setNome("Felipe Melo");
		g1.setSalario(5039.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autenticou = g1.autentica(0);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}
