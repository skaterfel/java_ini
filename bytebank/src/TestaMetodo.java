
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		contaDoFelipe.deposita(29);
		contaDoFelipe.deposita(342);
		System.out.println(contaDoFelipe.saldo);
		
		System.out.println(contaDoFelipe.saca(20));
		System.out.println(contaDoFelipe.saldo);
		
		Conta contaDoIori = new Conta();
		System.out.println("Conta Iori: " + contaDoIori.saldo);
		contaDoFelipe.transfere(300, contaDoIori);
		System.out.println("Conta Iori: " + contaDoIori.saldo);
		System.out.println("Conta Felipe: " + contaDoFelipe.saldo);
	}
}
