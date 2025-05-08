package escola;

public class Aluno {
//Jeito incorreto
//	String nome;
//	int idade;

//Jeito correto
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String newNome) {
		nome = newNome;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
