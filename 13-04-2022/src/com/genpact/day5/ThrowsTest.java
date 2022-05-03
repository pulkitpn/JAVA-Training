package com.genpact.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	
	public static void findFile() throws IOException , FileNotFoundException{
		File newFile = new File("test.txt");
		FileInputStream st = new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			findFile();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
