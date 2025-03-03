import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        
        double media = calculaMediaDaTurma(alunos, sc);

        System.out.printf("media da turma %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {   //Corrigir o erro de int para double
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
