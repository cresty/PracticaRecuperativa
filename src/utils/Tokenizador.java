package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

/**
 * Clase que contiene toda la funcionalidad extraida de la API de OpenNLP para la tokenizacion
 * @author Antonio
 *
 */

public class Tokenizador {
	
	/**
	 * Este metodo inicializa el model de los token que sera utilizado para la
	 * tokenizacion aprendida, es un requerimiento de la API OpenNLP
	 * @return Modelo del Tokenizador TokenizerModel
	 * @throws IOException 
	 */ 
	public TokenizerModel initTokenizer() throws IOException{
		TokenizerModel model = null;
		InputStream modelIn = new FileInputStream("en-token.bin"); ///< Recibe un parametro basico para realizar el modelo.
		modelIn.close();
		try {
		  model = new TokenizerModel(modelIn);
		}
		catch (IOException e) {
		  e.printStackTrace();
		}
		
		finally {
		 
		    try {
		      modelIn.close();
		    }
		    catch (IOException e) {
		    }
		  }
		
		return model;
	}
	
	/**
	 * Metodo que recibe el model del tokenizador y utilizando el fichero completo de entrada,
	 * genera un fichero nuevo completamente tokenizado.
	 * @param model Modelo del tokenizador
	 * @throws IOException
	 */
	
	public void Tokenizar(TokenizerModel model) throws IOException
	{
		Tokenizer tokenizer = new TokenizerME(model); ///< Declaracion del tokenizador
		FileManager fm = new FileManager(); ///< Variable FileManager para la manipulacion de archivos
		
		File token = new File("tokenizado.txt"); ///< Archivo a tokenizar
		File entrada = new File("salida.txt"); ///< Archivo tokenizado
		String str = ""; ///< String donde almacenamos el archivo a tokenizar
		str = fm.fileToString(entrada); 
		String tokens[] = tokenizer.tokenize(str); ///< Array de tokens
		
		FileWriter fw = new FileWriter(token);
	    String arr;
	    for (int i=0; i<tokens.length; i++) 
	    {		
	    	fw.write(tokens[i]);
	    	fw.write("\r\n"); 
	    }
	    fw.close();
	}
	

}
