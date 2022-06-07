public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE (POLIMORFOS)");
		return super.getSalario();
	}
	

	
	
}
