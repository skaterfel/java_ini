
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(2209);
		g.setNome("Iori Melo");
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
	}

}
