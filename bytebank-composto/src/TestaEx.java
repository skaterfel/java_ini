
public class TestaEx {
	public static void main(String[] args) {
		Endereco houseIori = new Endereco();
		houseIori.logradouro = "Rua Joao";
		houseIori.numero = 519;
		houseIori.complemento = "a";
		houseIori.bairro = "PQ Boa";
		houseIori.cep = "08341010";
		houseIori.cidade = "São Paulo";
		
		Pessoa iori = new Pessoa();
		iori.nome = "Iori Melo";
		iori.idade = 20; // meses
		iori.cpf = "123.321.123-32";
		iori.endereco = houseIori;
		
		
	}
	
	
	
}
