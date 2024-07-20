package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) {
		try {
			FileInputStream FI = new FileInputStream("C:/Users/ramak/OneDrive/Documents/mo.jpg");
			FileOutputStream FI1 = new FileOutputStream("C:/Users/ramak/OneDrive/Documents/new mo.jpg");

			int i = 0;
			while ((i=FI.read()) != -1) {
				FI1.write(i);
			}
			
			/*for(i=0;i!=(i=FI.read());i++) {
				System.out.print((char)i);
			}*/
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}