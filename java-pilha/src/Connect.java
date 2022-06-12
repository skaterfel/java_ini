
public class Connect implements AutoCloseable {

	public Connect() {
		System.out.println("Abrindo conexao...");
		// throw new IllegalStateException();
	}

	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}

	@Override
	public void close(){
		System.out.println("Fechando conexao");

	}
}
