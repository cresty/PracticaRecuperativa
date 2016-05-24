package tests;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import utils.FileManager;

public class FileManagerTest {
  @Test
  public void fileTest() throws IOException {
    
	  File file1 = new File("archivo1.txt");
	  File file2 = new File("archivo2.txt");
	  File salida = new File("salida.txt");
	  String str = "";
	  FileManager fm = new FileManager();
	  
	  fm.formatear(salida);
	  
	  fm.append(file1, salida);
	  fm.append(file2, salida);
	  
	  str = fm.fileToString(salida);
  }
}