package brcombytebank.contaherdado;

public class GuardadorDeContas {

	private Conta[] referencias;
	
	private int posicaoLivre;
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
	
		
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		
		return this.referencias[pos];
	}
	
	
}
