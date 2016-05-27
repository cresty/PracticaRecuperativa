package tests;


import java.io.IOException;

//import junit.Test;

import opennlp.tools.tokenize.TokenizerModel;
import utils.Tokenizador;

/**
 * Clase de Testing para las funcionalidades de la clase Tokenizador
 * @author Antonio
 *
 */

public class TokenizadorTest {
	@org.junit.Test
	public void TokenTest() throws IOException {
		Tokenizador t = new Tokenizador();
		TokenizerModel tm = t.initTokenizer(); ///< Inicializamos el model del tokenizador
		t.Tokenizar(tm); ///< Realizamos el proceso de tokenizacion
	}
	

}
