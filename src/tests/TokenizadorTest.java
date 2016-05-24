package tests;


import java.io.IOException;

import org.junit.Test;

import opennlp.tools.tokenize.TokenizerModel;
import utils.Tokenizador;

public class TokenizadorTest {
	@Test
	public void TokenTest() throws IOException {
		Tokenizador t = new Tokenizador();
		TokenizerModel tm = t.initTokenizer();
		t.Tokenizar(tm);
	}
	

}
