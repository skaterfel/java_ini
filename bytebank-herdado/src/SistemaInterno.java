
public class SistemaInterno {
	
	private int senha = 2209;
	
	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar " + g.getNome());
			
		} else {
			System.out.println("Senha incorreta. Tente novamente.");
		}
	}
}
