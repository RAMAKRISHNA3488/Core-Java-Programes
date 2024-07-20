package com.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import javax.annotation.processing.SupportedAnnotationTypes;

import FlowControlStatement.Calculater;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class<?> myclass = Class.forName(Calculater.class.getName());
			System.out.println(myclass.getName());
			Constructor<?>[] constructors=myclass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myclass.getMethods()));
			Constructor<?> constructor = myclass.getConstructor(null);
			System.out.println(constructor.newInstance(null));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		Class c=Class.forName("TestWithFramework");
		System.out.println(c.getName());
	}

}
