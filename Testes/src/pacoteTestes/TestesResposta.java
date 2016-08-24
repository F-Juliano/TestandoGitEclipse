package pacoteTestes;

public class TestesResposta {
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma dos dois valores �: " + s);
	}

	static int somaReturn(int a, int b) {
		int s = a + b;

		return s;
	}
	
	static int calcularReturn(int a, int b, int c){
		return somaReturn(a, b)*c; //usando o m�todo somaReturn (q retorna um inteiro) no c�lculo
	}
	
//	static int calcularVoid(int a, int b, int c){
//		return soma(a, b)*c; //tentando usar o m�todo soma (q retorna void) no c�lculo - gera erro de compila��o
//	}

	public static void main(String[] args) {

		System.out.println("M�todo void");
		soma(5, 2);

		int sm = somaReturn(5, 2);
		System.out.println("M�todo com retorno");
		System.out.println("A soma dos valores �: " + sm);
		
		System.out.println("Resultado do c�lculo: " + calcularReturn(10, 5, 3));
	}

}
