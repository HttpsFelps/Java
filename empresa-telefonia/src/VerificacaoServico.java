import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.print("Digite o serviço que deseja fazer a verificação: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.print("Digite o nome e serviços que assina separados por virgula: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for(int i=1;i<partes.length;i++){
          if((partes[i].trim()).equals(servico)){
            contratado = true;
            break;
          }
        }
        if (contratado){
          System.out.println("O cliente "+nomeCliente+" assina o serviço de "+servico);
        }else{
          System.out.println("O cliente "+nomeCliente+"não assina o serviço de "+servico);
        }
        
        scanner.close();
    }
}