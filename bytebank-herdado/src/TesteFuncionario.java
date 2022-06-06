
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario felipe = new Funcionario();
		felipe.setNome("Felipe Melo");
		felipe.setCpf("123123123-32");
		felipe.setSalario(2345.00);
		
		System.out.println(felipe.getNome());
		System.out.println(felipe.getBonificacao());

	}

}
