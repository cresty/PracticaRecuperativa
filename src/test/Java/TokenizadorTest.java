package test.Java;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.Optional;
import org.junit.Test;
import opennlp.tools.tokenize.TokenizerModel;
import utils.Tokenizador;

/**
 * Clase de Testing para las funcionalidades de la clase Tokenizador
 * @author Antonio
 *
 */

public class TokenizadorTest {
	
	/**
	 * Metodo test para probar la funcionalidad del metodo Tokenizer de la API de OpenNLP
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void TokenTest() throws IOException {
		File expected = new File("ExpectedToken.txt");
		File token = new File("Tokenizado.txt");
		File entrada = new File("Concatenado.txt");
		FileWriter fileWriter = new FileWriter(expected); 
		FileWriter fileWriter2 = new FileWriter(entrada);
		 fileWriter.write("My\nname\nis\nAntonio\nVicente\nSuarez\nSpinosi"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de comparacion de tokens
		 fileWriter.close();
		 fileWriter2.write("My name is Antonio Vicente Suarez Spinosi"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de entrada de prueba
		 fileWriter2.close();
		Tokenizador t = new Tokenizador();
		TokenizerModel tm = t.initTokenizer(); ///< Inicializamos el model del tokenizador
		t.Tokenizar(tm, entrada, token); ///< Realizamos el proceso de tokenizacion
		assertThat(token).hasSameContentAs(expected); ///< Comprobamos que el archivo tokenizado sea igual al archivo que acabamos de crear
	}
	

}
