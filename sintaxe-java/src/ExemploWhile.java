import java.util.concurrent.ThreadLocalRandom; // Classe para gerar numeros aleatorios
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0){ // O laco while sempre valida a condicao, então se a condicao for falsa o bloco nem chega a ser executado
            double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+valorDoce+" adicionado ao carrinho");
            mesada -= valorDoce;
            System.out.println("Mesada: "+mesada);
        }
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8); // Gera um valor de 2 a 8
    }
}
