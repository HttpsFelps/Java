package app_mensagem.apps;

public abstract class ServicoDeMensagemInstantanea {
	private String app;
	
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	
	public abstract void enviarMensagem() ;
	public abstract void receberMensagem() ;
		
	//somente filhos devem conhecer esse metodo
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado com a internet");
	}
	
	protected abstract void salvarHistoricomensagem();
}
