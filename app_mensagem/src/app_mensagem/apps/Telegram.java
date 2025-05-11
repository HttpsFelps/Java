package app_mensagem.apps;

public class Telegram  extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem do Telegram");
		salvarHistoricomensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Enviando mensagem do Telegram\n");
	}

	@Override
	protected void salvarHistoricomensagem() {
		System.out.println("Salvando o historico de mensagens do Telegram");
	}

}
