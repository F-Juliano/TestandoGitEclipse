package pacoteTestes;

public class TestesResposta {
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma dos dois valores é: " + s);
	}

	static int somaReturn(int a, int b) {
		int s = a + b;

		return s;
	}
	
	static int calcularReturn(int a, int b, int c){
		return somaReturn(a, b)*c; //usando o método somaReturn (q retorna um inteiro) no cálculo
	}
	
//	static int calcularVoid(int a, int b, int c){
//		return soma(a, b)*c; //tentando usar o método soma (q retorna void) no cálculo - gera erro de compilação
//	}

	public static void main(String[] args) {

		System.out.println("Método void");
		soma(5, 2);

		int sm = somaReturn(5, 2);
		System.out.println("Método com retorno");
		System.out.println("A soma dos valores é: " + sm);
		
		System.out.println("Resultado do cálculo: " + calcularReturn(10, 5, 3));
	}
	//comentário apenas para testar

}
