package antrob.santacasa.euromilhoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApostaTest {

	@Test
	void testAposta() {
		fail("Not yet implemented");
	}

	@Test
	void testApostaIntArrayIntArray() {
		// Numero de Numeros diferente de 5
		assertThrows(IllegalArgumentException.class, () -> {Aposta aposta2 = new Aposta(new int[] {1,2,3}, new int[] {1,2,});}, "O array de números tem de ter um tamanho igual a 5");
	}

	@Test
	void testGetNumeros() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEstrelas() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAcertos() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
