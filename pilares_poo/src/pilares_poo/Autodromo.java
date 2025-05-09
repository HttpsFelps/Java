package pilares_poo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897");
		Moto z400 = new Moto();
		z400.setChassi("467754");
		Veiculo carro = jeep;
		carro.ligar();// ou apenas jeep.ligar();
		System.out.println("\n");
		z400.ligar();
	}
}
