package abstractMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	void test() {
	TelaProjeto t = new TelaProjeto();
	t.setFabrica( new FabricaWindows());
	t.montar();
	
	
	assertEquals("janelaWindows{menuWindows,botaoWindows}", t.desenhar());
	
	}
}