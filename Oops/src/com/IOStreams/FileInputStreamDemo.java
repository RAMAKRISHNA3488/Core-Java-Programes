package com.IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		try {
		FileInputStream FI=new FileInputStream("C:/Users/ramak/OneDrive/Desktop/myfile.txt");
		
		 int i= 0;    
         while((i=FI.read())!=-1)
		System.out.print((char)i);
		
		FI.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}