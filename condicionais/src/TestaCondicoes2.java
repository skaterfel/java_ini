
public class TestaCondicoes2 {
	public static void main(String[] args) {

		System.out.println("Testando condi��es");
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
		}

	}
}
