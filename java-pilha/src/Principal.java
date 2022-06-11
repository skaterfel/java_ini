
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String nome = "Alura";
//		System.out.println("ANTES");
//		
//		try {
//			System.out.println(nome);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("CATCH");
//		}
//		
//		System.out.println("DEPOIS");
		
		try {
		    System.out.println(1/0);
		} catch(ArithmeticException ex) {
		    ex.printStackTrace();
		} catch(NullPointerException ex) {
		    ex.printStackTrace();    
		}
	}

}
