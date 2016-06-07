package main.Java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import opennlp.tools.tokenize.TokenizerModel;
import utils.FileManager;
import utils.Tokenizador;

public class main {
	
	public static void main(String [] args) throws IOException
	{
		Boolean end = true, repeat = true;
		File concat = new File("Concat.txt");
		File token = new File("Token.txt");
		Scanner sc = new Scanner(System.in);
		FileManager fm = new FileManager();
		fm.formatear(concat);
		fm.formatear(token);
		while (end)
		{
			System.out.println("indique la ruta del archivo a tokenizar");
			File entrada = new File(sc.next());
			repeat = true;
				while (repeat)
				{	
					System.out.println("Desea incluir un archivo mas? (s/n)");
					String entry = sc.next();
					if (entry.matches("s"))
						{
						repeat = false;
						end = true;
						}
					else if (entry.matches("n"))
						{
						repeat = false;
						end = false;
						}
					else
						System.out.println("Por favor responda con s o n para si y no");
					
				}
			
			
			fm.append(entrada, concat, end);
		}
		sc.close();	
		Tokenizador t = new Tokenizador();
		TokenizerModel tm = t.initTokenizer();
		t.Tokenizar(tm, concat, token);
	}

}
