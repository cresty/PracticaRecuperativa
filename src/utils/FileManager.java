package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase para la carga de los ficheros
 * Contiene todo lo necesario en el manejo de ficheros para su posterior tokenizacion.
 * @author Antonio
 *
 */

public class FileManager {
	
/**
 * Este metodo toma dos archivos, uno de entrada con texto plano, y uno de salida, al que se le
 * anadira el contenido del archivo de entrada
 * @param f Archivo de entrada
 * @param s Archivo de salida
 * @return Archivo con el texto de entrada anadido.
 * @throws IOException
 */
	
	public File append(File f, File s) throws IOException
	{
	    FileWriter fw = new FileWriter(s,true);///< Variable FileWritter para utilizar las funcionalidades de la libreria FileWritter 
	    String arr; ///< String donde almacenamos el texto del archivo entrante para aadirlo al archivo de salida 
	    Scanner sc=new Scanner(f); ///< Variable scanner para funcionalidades de archivos 
	    while(sc.hasNext()) 
	    {
	        arr=(sc.next());
	        fw.write(arr);
	        fw.write(" ");
	    }
	    fw.close();
	    sc.close();
	    return s;
	}
	
	/**
	 * Le pasamos un archivo y lo formatea, dejandolo sin ningun contenido.
	 * @param f Archivo de entrada
	 * @throws FileNotFoundException
	 */
	
	public void formatear(File f) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(f);
		writer.print("");
		writer.close();
		
	}
	
	/**
	 * Pasamos un archivo y nos devuelve un string
	 * @param f Archivo de entrada
	 * @return String con el contenido del archivo
	 * @throws FileNotFoundException
	 */
            
    public String fileToString(File f) throws FileNotFoundException
    {
    	String str = "";
    	Scanner sc = new Scanner(f);
    	while (sc.hasNext())
    	{
    		str = str + sc.next() + " ";
    	}
    	sc.close();
    	return str;
    }

}
