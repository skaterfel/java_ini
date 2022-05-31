
public class TesteSemana {
	public static void main(String[] args) {
		String diaSemana = "Sexta".toLowerCase();
		int dia = 0;
		switch (diaSemana) {
		case "segunda":
			dia = 2;
			break;
		case "terça":
			dia = 3;
			break;
		case "quarta":
			dia = 4;
			break;
		case "quinta":
			dia = 5;
			break;
		case "sexta":
			dia = 6;
			break;
		case "sabado":
			dia = 7;
			break;
		case "domingo":
			dia = 1;
			break;

		default:
			break;
		}
		System.out.println("Hoje é " + diaSemana.to + "! O " + dia + "º dia da semana");
	}
}
