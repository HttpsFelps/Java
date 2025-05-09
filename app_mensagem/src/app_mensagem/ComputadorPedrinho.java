package app_mensagem;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();
		FacebookMenssenger fbk = new FacebookMenssenger();
		Telegram tele = new Telegram();
		String[] apps = {"msn", "fbk", "tele"};
		for(int i = 0; i <= apps.length; i++) {
			if (i==0){
				msn.setApp("MSN menssenger");
				msn.enviarMensagem();
				msn.receberMensagem();
			}else if(i==1) {
				fbk.setApp("Facebook menssenger");
				fbk.enviarMensagem();
				fbk.receberMensagem();
			}else {
				tele.setApp("Telegram");
				tele.enviarMensagem();
				tele.receberMensagem();
			}
		}
	}
}
