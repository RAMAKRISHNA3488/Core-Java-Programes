package Abstraction;

public  class Test { 
	public static void main(String[] args) {
		HP hp=new HP();
		  hp.Click();
		  hp.Scroll();
		  
		  HPNoteBook hpnotebook=new HPNoteBook();
		  hpnotebook.click();
		  
		  
		  
		  Dell dell=new Dell();
		  dell.Click();
		  dell.Scroll();
		  
		  DellNoteBook dellnotebook=new DellNoteBook();
		  dellnotebook.click();
		  
	}

}
