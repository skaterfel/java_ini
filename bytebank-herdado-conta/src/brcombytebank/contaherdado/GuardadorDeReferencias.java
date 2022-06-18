package brcombytebank.contaherdado;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[5];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencias(int pos) {
		return this.referencias[pos];
	}
	
	
	
}
