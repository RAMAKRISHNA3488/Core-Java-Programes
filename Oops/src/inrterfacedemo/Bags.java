package inrterfacedemo;

public interface Bags {
	public void Goodclothe();
	
	public void Goodzip();
	
	public void Morepockets();
	
	public void Waterproof();
	public static void comman1() {
		System.out.println("comman1");
		
    	   
		}
	
	public default void comman(){
		System.out.println( "comman bags");
		
	}
	
		
	}


