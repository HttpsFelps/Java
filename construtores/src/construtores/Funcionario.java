package construtores;

public class Funcionario extends Pessoa {
    Funcionario() {
        super(); // Chama o construtor da classe Pessoa (classe pai)
        System.out.println("Filho herda pai");
    }
}
