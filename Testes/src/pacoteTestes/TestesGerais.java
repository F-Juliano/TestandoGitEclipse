package pacoteTestes;

public class TestesGerais {
	 public static void main(String[] args) {
		int i;
		
		
		
		try{
			i = 1/0;
			
			System.out.println(i);
		}
		catch(ArithmeticException e){
			System.out.println("Tratando exceção");
			e.printStackTrace();
		}
	}
	//Apenas para testar o pull em um novo brach

}
