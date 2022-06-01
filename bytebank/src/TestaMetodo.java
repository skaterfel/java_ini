
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		contaDoFelipe.deposita(29);
		contaDoFelipe.deposita(342);
		System.out.println(contaDoFelipe.saldo);
	}
}
