package com.exception;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChackedException {

	public static void main(String[] args) throws FileNotFoundException {
       try { 
    	   FileInputStream fil=new FileInputStream("");
       }catch(FileNotFoundException e) {
    	   System.out.println("file could not be found");
       }
	}

}
