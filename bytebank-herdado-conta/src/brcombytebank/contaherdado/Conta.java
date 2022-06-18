package brcombytebank.contaherdado;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	
	
	public Conta(int agencia,int numero) {	
		Conta.total++;
		// System.out.println("O total de contas abertas no ByTeBank é de: " + total);
		this.agencia = agencia;
		this.numero = numero;
		
		
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsulficienteException{
		
		if (this.saldo < valor) {
			throw new SaldoInsulficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsulficienteException{
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor da conta melhor que 1!");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			System.out.println("Valor da conta melhor que 1!");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {

		
		return "Numero: " + this.numero + ", Ag: " + this.agencia;
	}


}