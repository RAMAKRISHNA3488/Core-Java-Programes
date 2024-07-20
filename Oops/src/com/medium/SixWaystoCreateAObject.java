package com.medium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import sun.misc.Unsafe;

//1.the New keyword
//2.Reflection:class New Instance()
//3.Reflection:DeclaredConstructor new instance
//Not called Constructor
//4.Object clone()
//5.Serializable
//6.unsafe

public class SixWaystoCreateAObject {
	public static class Pumpkin implements Cloneable, Serializable {
		public Pumpkin() {
			System.out.println("Constructor called");

		}

		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, NoSuchFieldException {
		System.out.println("-------Start--------");
		System.out.println("(1) new");
		Pumpkin p1 = new Pumpkin();

		System.out.println("(2) Class new Instance");
		Pumpkin p2 = Pumpkin.class.newInstance();

		System.out.println("(3) Constructor new Instance");
		Pumpkin p3 = Pumpkin.class.getDeclaredConstructor().newInstance();

		System.out.println("(4) clone");
		Pumpkin p4 = (Pumpkin) p1.clone();
		
		System.out.println("(5) Serialization");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.bin"));
		oos.writeObject(p1);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.bin"));
		Pumpkin p5=(Pumpkin) ois.readObject();
		
		System.out.println("(6) unsafe");
		Field f=Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe=(Unsafe) f.get(null);
		Pumpkin p6=(Pumpkin) unsafe.allocateInstance(Pumpkin.class);
		
		System.out.println("----------End----------");
		
	}

}
