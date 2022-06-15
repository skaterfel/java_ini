package brcombytebank.contateste;
import brcombytebank.contaherdado.Conta;
import brcombytebank.contaherdado.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try {
			conta.saca(888);
		} catch (Exception e) {
			System.out.println("EX: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
