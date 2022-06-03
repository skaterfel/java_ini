
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
	
		conta.deposita(100);
		conta.deposita(100);
		System.out.println(conta.saca(101));
		//System.out.println(conta.saldo); 
		
		// conta.saldo -= 101;
		//System.out.println(conta.saldo);
		System.out.println(conta.mostraSaldo());
		
	}
}
