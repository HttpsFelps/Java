package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
//		selecaoCandidatos();
//		analisarCandidato();
//		imprimirSelecionados();
		String[] candidatos = {"Ana","Bruno","Carlos","Daniela","Eduardo"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas= 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu=atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso!!!");
				}
			
		} while (continuarTentando  && tentativasRealizadas<3);
		
		if(atendeu) {
			System.out.println("conseguimos contato com "+candidato+" na "+tentativasRealizadas+" tentativa");
		}else {
			System.out.println("não conseguimos contato com "+candidato+", número maximo de tentativas "+tentativasRealizadas+ " realizadas");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"Ana","Bruno","Carlos","Daniela","Eduardo"};
		
//		for(int i=0; i < candidatos.length; i++) {
//			System.out.println("O candidato de número "+(i+1)+" é "+candidatos[i]);
//		}
	
//		estrutura for each
		int i = 1;
		for(String candidato: candidatos) {
			System.out.println("O candidato de número "+(i)+" é "+candidato);
			i++;
		}
	}
	
	static void selecaoCandidatos() {
		int candidatosSelecionados = 0, candidatoAtual = 0;
		double salarioBase= 2000.0;
		 String[] candidatos = {"Ana","Bruno","Carlos","Daniela","Eduardo","Fernanda","Gabriel","Helena","Igor","Juliana"};
		 while (candidatosSelecionados < 5 && candidatoAtual<candidatos.length) {
			 String candidato = candidatos[candidatoAtual];
			 double salarioPretendido = valorPretendido();
			 
			 System.out.println("O candidato " +candidato+" solicitou este valor de salário "+ salarioPretendido);
			 if (salarioBase >= salarioPretendido) {
				 System.out.println("O candidato " +candidato+" foi selecionado para a vaga");
				 candidatosSelecionados++;
			 }
			 candidatoAtual++;
		 }
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		System.out.println("\n===================================================");
		if (salarioBase > salarioPretendido){
			System.out.println("Ligar para o candato");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
	}
}
