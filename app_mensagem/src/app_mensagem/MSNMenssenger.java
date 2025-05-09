package app_mensagem;

public class MSNMenssenger extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		 System.out.println("Enviando mensagem do MSN");	
	}

	@Override
	public void receberMensagem() {
		 System.out.println("Recebendo mensagem do MSN");
	}
	
}
