public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"Luis", "Maria", "Roberto", "Regina"};
        
        for (int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice "+ (i+1) +" é "+ alunos[i]);
        }

        //for each (serve para percorrer o array de forma mais simples)
        for (String aluno : alunos) {
            System.out.println("O aluno é "+ aluno);
        }
    }
}