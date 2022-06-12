
public class TesteConnection {

	
	public static void main(String[] args) {
		
		
		try(Connect conexao = new Connect()){
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexao");
		}
		
//		// -----------------------------------------
//		Connect conn = null;
//		
//		try {
//			conn = new Connect();
//			conn.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("Finally");
//			if(conn != null) {
//				
//				conn.fecha();
//				
//			}
//		}
		
	}
}
