public class Condicionais {
    public static void main(String[] args) {
        int num = 10;
        String resultado;

        // Condicional if, else if e else
        if (num > 10) {
            System.out.println("O número é maior que 10");
        } else if (num == 10) {
            System.out.println("O número é igual a 10");
        } else {
            System.out.println("O número é menor que 10");
        }

        // Operador Ternário
        resultado = (num % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é: " + resultado);

        // Estrutura switch-case
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
