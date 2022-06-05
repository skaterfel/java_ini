
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(123, 132133);
		System.out.println(conta.getAgencia());
		conta.setAgencia(1321);
		Conta conta2 = new Conta(123, 9420);
		conta2.getSaldo();
		System.out.println(Conta.getTotal());
		
	}
}
