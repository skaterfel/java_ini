
public class TesteIR {
	public static void main(String[] args) {
		double salario = 2033;
		if (salario >= 1902.99 || salario <= 2826.65) {
			System.out.println("Voc� esta na faixa 1: 7,5%! "
					+ "Ser� deduzido o valor de R$" + (salario*0.075));
		}
		
	}
}
