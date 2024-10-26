public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Gleyson"; // Atribuindo um valor à variável 'primeiroNome'
        String segundoNome = "Sampaio";  // Atribuindo um valor à variável 'segundoNome'
        
        // Chamando o método 'nomeCompleto' para concatenar os dois nomes
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto); // Exibindo o nome completo
        
        // Exemplo de constante em Java (costuma-se usar maiusculas)
        final int NUMERO_MAXIMO = 100;
        
        // Tipos primitivos de Java e seus tamanhos em bytes
        int inteiro = 10;           // 4 bytes
        byte pequeno = 1;           // 1 byte
        short curto = 100;          // 2 bytes
        long grande = 100000L;      // 8 bytes - termina com 'L'
        float decimalPequeno = 1.5F;// 4 bytes - termina com 'F'
        double decimalGrande = 10.5;// 8 bytes
        boolean verdadeiro = true;  // tipo booleano
        char caractere = 'A';       // tipo caractere, armazena um único caractere

        // Os tipos primitivos não são considerados objetos e são armazenados na pilha de memória (memory stack).

        System.out.println(NUMERO_MAXIMO);
        System.out.println(inteiro);
        System.out.println(pequeno);
        System.out.println(curto);
        System.out.println(grande);
        System.out.println(decimalPequeno);
        System.out.println(decimalGrande);
        System.out.println(verdadeiro);
        System.out.println(caractere);
    }

    // Métodos devem ser verbos
    // Este método concatena dois nomes e retorna o resultado
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // Concatenação de 'primeiroNome' com 'segundoNome'
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}