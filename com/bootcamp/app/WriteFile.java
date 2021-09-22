package com.bootcamp.app;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			FileWriter writeTo = new FileWriter("C:\\Tools\\workspace\\File\\src\\com\\bootcamp\\app\\File.txt");
			writeTo.write("justin");
			writeTo.close();
			System.out.println("succesfuly written");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
