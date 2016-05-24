package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class Tokenizador {
	
	
	public TokenizerModel initTokenizer() throws FileNotFoundException{
		TokenizerModel model = null;
	InputStream modelIn = new FileInputStream("en-token.bin");

	try {
	  model = new TokenizerModel(modelIn);
	}
	catch (IOException e) {
	  e.printStackTrace();
	}
	
	finally {
	  if (modelIn != null) {
	    try {
	      modelIn.close();
	    }
	    catch (IOException e) {
	    }
	  }
	}
	return model;


	}
	
	public void Tokenizar(TokenizerModel model) throws IOException
	{
		Tokenizer tokenizer = new TokenizerME(model);
		FileManager fm = new FileManager();
		
		File token = new File("tokenizado.txt");
		File entrada = new File("salida.txt");
		String str = "";
		str = fm.fileToString(entrada);
		String tokens[] = tokenizer.tokenize(str);
		
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
