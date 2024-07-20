package com.ram.Interface;

public class maths implements Books {

	@Override
	public void Chapters() {
     System.out.println("Chapter Name");		
	}

	@Override
	public void Summary() {
	 System.out.println("Summary of the Chapter");
	}

	@Override
	public void Questions() {
     System.out.println("Questions of the Chapter");		
	}

	@Override
	public void Answers() {
     System.out.println("Answer of Question to related Chapter");		
	}

	@Override
	public void Grammer() {
     System.out.println("Grammer");		
	}

	@Override
	public void Diagrams() {
     System.out.println("Diagrams");		
	}

	@Override
	public void Activites() {
       System.out.println("Activites");
       
      }
	  
	}

