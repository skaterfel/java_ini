public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE (POLIMORFOS)");
		return super.getSalario();
	}
	

	
	
}
