package abstractMethod;

public class TelaProjeto {
	
	

	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;


	}

	public void montar() {
		this.janela = fabrica.criarJanela();
		this.botao = fabrica.criarBotao();
		this.menu = fabrica.criarMenu();

	}

	public String desenhar() {
		return janela.desenhar() +"{"+ menu.desenhar() +","+ botao.desenhar()+"}";

	}

}
