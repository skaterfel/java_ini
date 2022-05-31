
public class TesteFatorial {
	public static void main(String[] args) {
		int valorFatorial = 1;
		int fatorial = 5;
		while(fatorial >= 1) {
			System.out.print(fatorial);
			valorFatorial = valorFatorial * fatorial;
			fatorial--;
			if(fatorial >= 1) {
				System.out.print("x");
			}
		}
		System.out.print("=" + valorFatorial);
	}
}
