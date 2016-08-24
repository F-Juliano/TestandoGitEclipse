package pacoteTestes;

public class Classes {
	Alunos Juliano = new Alunos();
	Alunos Sabrina = new Alunos();
	Alunos Carina = new Alunos();
	Alunos Flavio = new Alunos();
	Alunos Valdete = new Alunos();
	Alunos Zezinho = new Alunos();
	
	public static void main(String[] args) {
	
		Classes novos = new Classes();
		Classes velhos = new Classes();
		
		novos.Juliano.setNome("Juliano");
		novos.Juliano.setNota(7.5);
		novos.Juliano.setMediaClasse(novos.Juliano.getNota());
		
		
		System.out.println(novos.Juliano.getNota());
		
	}

}
