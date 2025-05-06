package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionar lanche hamburguer no balcao");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionar suco no balcao");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando suco");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o hamburguer");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
