package com.bootcamp.app;

import java.io.FileWriter;

public class Bootcamp {
	public static void main(String[] argv) throws Exception {
		FileWriter writer = new FileWriter("C:\\\\Tools\\\\workspace\\\\File\\\\src\\\\com\\\\bootcamp\\\\app\\\\Names.txt");
		
		String names[] = { "justin\n", "bryan\n", "juscelino\n", "enverny\n", "kirsten\n", "jianti\n" };
		
		int len = names.length;
		
		for (int i = 0; i < len; i++) {
			writer.write(names[i]);
		}
		writer.close();
	}
}