package app_mensagem;

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
		
		
}
