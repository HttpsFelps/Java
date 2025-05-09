package app_mensagem;

public class ServicoDeMensagemInstantanea {
	private String app;
	
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	
	public void enviarMensagem() {
		validarConectadoInternet();
		 System.out.println("Enviando mensagem do "+app);
		 salvarHistoricoMensagem();
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem do "+app+"\n");
		}
		private void validarConectadoInternet() {
			System.out.println("Validadndo se está conectado a internet");
		}
		private void salvarHistoricoMensagem() {
			System.out.println("Salvando o hstorico da mensagem");
		}
}
