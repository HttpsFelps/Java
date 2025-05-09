package pilares_poo;

public class Carro extends Veiculo {//herda caracteristicas de veiculo
	
	@Override
	public void ligar() {
		confereCambio();// confere cambio esta encapsulado em ligar
		confereCombustivel();// confere combustivel esta encapsulado em ligar
		System.out.println("Carro ligado");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio");
	}
}
