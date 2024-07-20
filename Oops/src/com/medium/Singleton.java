package com.medium;


public final class Singleton {
	private static Singleton Instance;
	private String info = "initial info class";

	private Singleton() {

	}

	public static Singleton getInstance() {
		if(Instance==null) {
			Instance=new Singleton();
		}
		return Instance;
	}

	public static void setInstance(Singleton instance) {
		Instance = instance;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
}
