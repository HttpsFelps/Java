package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno luis = new Aluno();
//		luis.nome = "Luís";
//		luis.idade = 18;
//		
//		System.out.println("O aluno "+luis.nome+" tem "+luis.idade+" anos");
		
		luis.setNome("Luís Felipe");
		luis.setIdade(18);
		
		System.out.println("O aluno "+luis.getNome()+" tem "+luis.getIdade()+" anos");
	}
}
