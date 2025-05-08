package enums;

public class SistemaIBGE {
	public static void main(String[] args) {
//		for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
//			System.out.println(estado.getSigla()+"-"+estado.getNome());
//		}
		EstadoBrasileiro meuEstado = EstadoBrasileiro.SAO_PAULO;
		System.out.println(meuEstado.getNome()+"\n"+meuEstado.getSigla()+"\n"+meuEstado.getNomeMaiusculo()+"\n"+meuEstado.getIbge());
	}
}
