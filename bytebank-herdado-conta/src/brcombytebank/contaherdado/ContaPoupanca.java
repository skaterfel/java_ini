package brcombytebank.contaherdado;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {

		
		return "Conta Poupanca | " + super.toString();
	}

}
