
public class SistemaInterno {
	
	private int senha = 2209;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar " + fa.getNome());
			
		} else {
			System.out.println(fa.getNome() + " X Senha incorreta. Tente novamente.");
		}
	}
}
