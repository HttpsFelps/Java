package app_mensagem.apps;

public class FacebookMenssenger  extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		 System.out.println("Enviando mensagem do Facebook");
		 salvarHistoricomensagem();
	}

	@Override
	public void receberMensagem() {
		 System.out.println("Enviando mensagem do Facebook\n");
	}

	@Override
	protected void salvarHistoricomensagem() {
		System.out.println("Salvando o historico de mensagens do Facebook");
	}

}
