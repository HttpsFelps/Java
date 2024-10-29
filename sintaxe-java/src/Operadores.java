public class Operadores {
    
        public static void main(String[] args) {
            // Operadores Aritméticos
            int a = 10;
            int b = 5;
            
            // Soma
            int soma = a + b; // Resultado: 15
            // Subtração
            int subtracao = a - b; // Resultado: 5
            // Multiplicação
            int multiplicacao = a * b; // Resultado: 50
            // Divisão
            int divisao = a / b; // Resultado: 2
            // Módulo (resto da divisão)
            int modulo = a % b; // Resultado: 0
    
            // Operadores de Atribuição
            int x = 10;    // Atribui 10 a 'x'
            x += 5;        // Equivalente a x = x + 5; Resultado: 15
            x -= 3;        // Equivalente a x = x - 3; Resultado: 12
            x *= 2;        // Equivalente a x = x * 2; Resultado: 24
            x /= 4;        // Equivalente a x = x / 4; Resultado: 6
            x %= 3;        // Equivalente a x = x % 3; Resultado: 0
    
            // Operadores Relacionais
            boolean ehMaior = a > b;  // true, pois 10 é maior que 5
            boolean ehMenor = a < b;  // false, pois 10 não é menor que 5
            boolean ehIgual = a == b; // false, pois 10 não é igual a 5 (para objetos usamos a.equals(b))
            boolean ehDiferente = a != b; // true, pois 10 é diferente de 5
    
            // Operadores Lógicos
            boolean condicao1 = true;
            boolean condicao2 = false;
    
            boolean resultadoE = condicao1 && condicao2; // false, pois uma das condições é falsa
            boolean resultadoOu = condicao1 || condicao2; // true, pois uma das condições é verdadeira
            boolean resultadoNao = !condicao1; // false, pois 'condicao1' é true
    
            // Operadores Unários
            int contador = 10;
            contador++; // Incrementa 1, equivalente a contador = contador + 1; Resultado: 11
            contador--; // Decrementa 1, equivalente a contador = contador - 1; Resultado: 10
            int negativo = -contador; // Resultado: -10
    
            // Operador Ternário
            int idade = 18;
            String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade"; // Resultado: "Maior de idade"
    
            // Exibindo resultados
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Divisão: " + divisao);
            System.out.println("Módulo: " + modulo);
            System.out.println("Atribuição após operações: " + x);
            System.out.println("É maior: " + ehMaior);
            System.out.println("É menor: " + ehMenor);
            System.out.println("É igual: " + ehIgual);
            System.out.println("É diferente: " + ehDiferente);
            System.out.println("Operador E lógico: " + resultadoE);
            System.out.println("Operador OU lógico: " + resultadoOu);
            System.out.println("Operador NÃO lógico: " + resultadoNao);
            System.out.println("Operador unário (negativo): " + negativo);
            System.out.println("Mensagem (operador ternário): " + mensagem);
        }
    }
    

