package tests;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import utils.FileManager;

/**
 * Clase de Testing para las funcionalidades de la clase FileManager
 * @author Antonio
 *
 */

public class FileManagerTest {
	
	/**
	 * Probamos las distintas funciones y metodos
	 * @throws IOException
	 */
  @Test
  public void fileTest() throws IOException {
    
	  File file1 = new File("archivo1.txt"); ///< Generacion de un archivo de texto plano
	  File file2 = new File("archivo2.txt"); ///< Generacion de un archivo de texto plano
	  File salida = new File("salida.txt"); ///< Generacion de un archivo de texto plano
	  String str = ""; 
	  FileManager fm = new FileManager();
	  
	  fm.formatear(salida);  ///< Limpia el archivo 'salida'
	  
	  fm.append(file1, salida); ///< Concatena el contenido del archivo1 al archivo salida
	  fm.append(file2, salida); ///< Concatena el contenido del archivo2 al archivo salida
	  
	  str = fm.fileToString(salida); ///< Inserta el contenido del archivo Salida en un string
  }
}