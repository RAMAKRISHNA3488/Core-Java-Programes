package com.interveiw;

public class AlphabetsUsingLoop {
	static char v=' ',c=' ';
	public static void main(String[] args) {

		char ch;
		
		for (ch = 'a'; ch <= 'z'; ch++) {
			//System.out.print(ch+" ");
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o') {
				//System.out.print(ch+" ");
				v++;
			}else  {
				//System.out.println(ch+" ");
				c++;
			}

		}
		
	}
	
}
