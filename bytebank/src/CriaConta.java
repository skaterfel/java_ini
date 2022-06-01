
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 100;
		
		System.out.println("R$" + primeiraConta.saldo + " na Primeira Conta");
		System.out.println("R$" + segundaConta.saldo + " na Segunda Conta");
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
				
		
	}
}
