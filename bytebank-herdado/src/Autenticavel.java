// Contrato Autenticavel
	// Quem assina esse contrato, precisa implementar:
		// Metodo setSenha
		// Metodo Autentica


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
