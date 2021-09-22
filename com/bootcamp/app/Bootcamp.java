package com.bootcamp.app;

import java.io.File;

public class Bootcamp {

	public static void main(String[] args) {
		createTextFile();
	}
	
	private static void createTextFile() {

		textFile = new File("mijntest.txt");
	}

	private static File textFile = new File("");
	private String[] names = {"justin", 
			"bryan", 
			"juscelino", 
			"enverny", 
			"kirsten", 
			"jianti"};
	
}
