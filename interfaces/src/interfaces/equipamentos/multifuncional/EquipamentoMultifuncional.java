package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("Copiando Equipamento Multifuncional");
	}
	public void digitaliar() {
		System.out.println("Digitalizando Equipamento Multifuncional");
	}
	public void imprimir() {
		System.out.println("Imprimindo Equipamento Multifuncional");
	}
}
