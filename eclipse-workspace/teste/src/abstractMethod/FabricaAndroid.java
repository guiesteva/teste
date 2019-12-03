package abstractMethod;

public class FabricaAndroid implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		return criarJanela();
	}

	@Override
	public Menu criarMenu() {
		return criarMenu();
	}

	@Override
	public Botao criarBotao() {
		return criarBotao();
	}

}
