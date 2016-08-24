package pacoteTestes;

public class Alunos {
	private String nome;
	private double nota;
	private static double mediaClasse;
	private static int contAlunos;
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	void setNota(double nota){
		this.nota = nota;
	}
	
	void setContAlunos(int contAlunos){
		this.contAlunos += contAlunos; 
	}
	
	void setMediaClasse(double mediaClasse){
		this.mediaClasse += mediaClasse / contAlunos;
	}
	
	String getNome(){
		return nome;
	}
	
	double getNota(){
		return nota;
	}
	
	double getMediaClasse(){
		return mediaClasse;
	}
	
	int getContAlunos(){
		return contAlunos;
	}
	
	void MostrarDados(){
		
	}
	
	

}
