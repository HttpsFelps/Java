package app_mensagem.apps;

public class MSNMenssenger extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem do MSN");
		salvarHistoricomensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem do MSN\n");
	}

	@Override
	protected void salvarHistoricomensagem() {
		System.out.println("Salvando o historico de mensagens do MSN");
	}
	
}
