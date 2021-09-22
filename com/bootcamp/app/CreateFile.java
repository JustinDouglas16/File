package com.bootcamp.app;
import java.io.*;

/**
 *  Schrijf een programma
 *  
 *  - Dat een serie van willekeurige namen maakt en deze naar een file write.
 *  - een functie waarbij u directory listing opvraagt nadat u zelf de gebruiker om een specifieke
 *    directory naam vraagt
 *  - een functie waarbij u een file delete als deze groter is geworden dan 1000 bytes. (file.size of lenght)
 *  
 */


public class CreateFile {

	public static void main(String[] args) {
		
		File obj = new File("C:\\Tools\\workspace\\File\\src\\com\\bootcamp\\app\\File.txt");
		
		try {
			if(obj.createNewFile()) {
				System.out.println("file " + obj.getName() + " is created");
			}else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
