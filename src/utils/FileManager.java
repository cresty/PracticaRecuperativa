package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Clase para la carga de los ficheros
 * Contiene todo lo necesario en el manejo de ficheros apra su posterior tokenizacion
 * @author Antonio
 *
 */

public class FileManager {
	
/**
 * Este metodo toma dos archivos, uno de entrada con texto plano, y uno de salida, al que se le
 * añadira el contenido del archivo de entrada
 * @param f Archivo de entrada
 * @param s Archivo de salida
 * @return
 * @throws IOException
 */
	
	public File append(File f, File s) throws IOException
	{
	    FileWriter fw = new FileWriter(s,true);
	    String arr;
	    Scanner sc=new Scanner(f);
	    while(sc.hasNext())
	    {
	        arr=(sc.next());
	        fw.write(arr);
	        fw.write(" ");
	    }
	    fw.close();

	    return s;
	}
	
	/**
	 * Le pasamos un archivo y lo formatea, dejandolo sin ningun contenido.
	 * @param f
	 * @throws FileNotFoundException
	 */
	
	public void formatear(File f) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(f);
		writer.print("");
		writer.close();
		
	}
            
    public String fileToString(File f) throws FileNotFoundException
    {
    	String str = "";
    	Scanner sc = new Scanner(f);
    	while (sc.hasNext())
    	{
    		str = str + sc.next() + " ";
    	}
    	return str;
    }

}
