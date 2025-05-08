package construtores;

public class Pessoa {
	private String nome, cpf, endereco;
	
//garante que na inicialização do objeto seja enviado dados importantes
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
		System.out.println("Classe pai");
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
