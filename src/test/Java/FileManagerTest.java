package test.Java;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.concurrent.CompletableFuture;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import  java.util.OptionalLong;
import utils.FileManager;

/**
 * Clase de Testing para las funcionalidades de la clase FileManager
 * @author Antonio
 *
 */

@SuppressWarnings("unused")
public class FileManagerTest {
	
	/**
	 * Probamos las distintas funciones y metodos
	 * @throws IOException
	 */
   
	/**
	 * Metodo Test para comprobar que un archivo se genera correctamente
	 * @throws IOException
	 */
	 @SuppressWarnings("deprecation")
	@Test
	 public void file1Test() throws IOException{
		
		 File expected = new File("Expected1.txt"); ///< Archivo que contiene el texto esperado
		 File file1 = new File("Entrada1.txt"); ///< Archivo de entrada de prueba
		 FileWriter fileWriter = new FileWriter(expected); 
		 fileWriter.write("My name is"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de entrada de prueba
		 fileWriter.close();
		 assertThat(file1).hasContentEqualTo(expected); ///< Comprobamos que el archivo de entrada sea igual al archivo que acabamos de crear
		 
	 }
	 
	 /**
	  * Metodo Test para comprobar la generacion correcta de un archivo
	  * @throws IOException
	  */
	 
	 @SuppressWarnings("deprecation")
	@Test
	 public void file2Test() throws IOException{
		
		 File expected = new File("Expected2.txt"); ///< Archivo que contiene el texto esperado
		 File file2 = new File("Entrada2.txt"); ///< Archivo de entrada de prueba
		 FileWriter fileWriter = new FileWriter(expected); 
		 fileWriter.write("Antonio Vicente Suarez Spinosi"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de entrada de prueba
		 fileWriter.close();
		 assertThat(file2).hasContentEqualTo(expected); ///< Comprobamos que el archivo de entrada sea igual al archivo que acabamos de crear
		 
	 }
	 
	 /**
	  * Metodo Test para comprobar el correcto funcioanmiento del metodo Append
	  * @throws IOException
	  */
	 
	 @SuppressWarnings("deprecation")
	@Test
	 public void fileAppendTest() throws IOException{
		
		 File file1 = new File("Entrada1.txt"); ///< Archivo de entrada de prueba
		 File file2 = new File("Entrada2.txt"); ///< Archivo de entrada de prueba
		 File expected = new File("Expected3.txt"); ///< Archivo que contiene el texto esperado
		 File salida = new File("Concatenado.txt"); ///< Generacion de un archivo de texto plano
		 String str = ""; 
		 FileManager fm = new FileManager();
		 fm.formatear(salida);  ///< Limpia el archivo 'salida'
		  
		 fm.append(file1, salida, true); ///< Concatena el contenido del archivo1 al archivo salida
		 fm.append(file2, salida, false); ///< Concatena el contenido del archivo2 al archivo salida
		 FileWriter fileWriter = new FileWriter(expected); 
		 fileWriter.write("My name is Antonio Vicente Suarez Spinosi"); ///< Escribimos la cadena de caracter que esperamos que tenga el archivo de entrada de prueba
		 fileWriter.close();
		 assertThat(salida).hasContentEqualTo(expected); ///< Comprobamos que el archivo de salida sea igual al archivo que acabamos de crear
		 
	 }
	

//@Test
//  public void fileTest() throws IOException {
//    
//	  
//	  str = fm.fileToString(salida); ///< Inserta el contenido del archivo Salida en un string
//  }
}