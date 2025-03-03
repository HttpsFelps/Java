public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("inicio do programa no metodo main");
        a();
        System.out.println("fim do programa no metodo main");
    }

    static void a(){    // Não é necessario colocar o public antes, pois fica entendido que ele está lá por padrão
        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Saiu do metodo a");
    }

    static void b(){
        System.out.println("Entrou no metodo b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Saiu do metodo b");
    }

    static void c(){
        System.out.println("Entrou no metodo c");
        Thread.dumpStack(); // Imprime a stack trace (se le dde baixo para cima)
        System.out.println("Saiu do metodo c");
    }
}
