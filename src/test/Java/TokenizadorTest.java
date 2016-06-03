package test.Java;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import opennlp.tools.tokenize.TokenizerModel;
import utils.Tokenizador;

/**
 * Clase de Testing para las funcionalidades de la clase Tokenizador
 * @author Antonio
 *
 */

public class TokenizadorTest {
	@Test
	public void TokenTest() throws IOException {
		File expected = new File("ExpectedToken.txt");
		File token = new File("Tokenizado.txt");
		FileWriter fileWriter = new FileWriter(expected); 
		 fileWriter.write("My\nname\nis\nAntonio\nVicente\nSuarez\nSpinosi"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de entrada de prueba
		 fileWriter.close();
		Tokenizador t = new Tokenizador();
		TokenizerModel tm = t.initTokenizer(); ///< Inicializamos el model del tokenizador
		t.Tokenizar(tm); ///< Realizamos el proceso de tokenizacion
		assertThat(token).hasContentEqualTo(expected); ///< Comprobamos que el archivo tokenizado sea igual al archivo que acabamos de crear

	}
	

}
