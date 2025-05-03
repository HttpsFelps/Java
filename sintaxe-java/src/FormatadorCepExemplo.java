public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvaliodoException e) {
            System.out.println("O cep não corresponde com as regras de negocio!\nERRO:");
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvaliodoException{
        if(cep.length() != 8)
        throw new CepInvaliodoException();
        //simulando um cep formatado
        return "23.765-064";
    }
}
