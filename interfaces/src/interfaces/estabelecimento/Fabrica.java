package interfaces.estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		Impressora impressora = em;
		
		copiadora.copiar();
		digitalizadora.digitaliar();
		impressora.imprimir();
	}
}
