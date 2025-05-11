package app_mensagem;

import app_mensagem.apps.FacebookMenssenger;
import app_mensagem.apps.MSNMenssenger;
import app_mensagem.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMenssenger msn = new MSNMenssenger();
		FacebookMenssenger fbk = new FacebookMenssenger();
		Telegram tele = new Telegram();
		String[] apps = {"msn", "fbk", "tele"};
		for(int i = 0; i < apps.length; i++) {
			if (i==0){
				msn.enviarMensagem();
				msn.receberMensagem();
			}else if(i==1) {
				fbk.enviarMensagem();
				fbk.receberMensagem();
			}else {
				tele.enviarMensagem();
				tele.receberMensagem();
			}
		}
	}
}
