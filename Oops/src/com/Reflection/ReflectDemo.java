package com.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo {

	public static void main(String[] args) {

		String parm = args[0];
		Class classname = void.class;
		try {
			classname = Class.forName(parm);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Not a class or Interface.");
			System.exit(0);
		}
		describeClassorInterface(classname, parm);

	}

	static void describeClassorInterface(Class classname, String name) {
		if (classname.isInterface()) {
			System.out.println("Interface: " + name);
			displayModifiers(classname.getModifiers());
			displayFields(classname.getDeclaredFields());
			displayMethods(classname.getMethods());
		} else {
			System.out.println("Class: " + name);
			displayModifiers(classname.getModifiers());
			displayInterfaces(classname.getInterfaces());
			displayFields(classname.getFields());
			displayConstructors(classname.getConstructors());
			displayMethods(classname.getMethods());

		}
	}

	static void displayModifiers(int m) {
		System.out.println("Modifiers: " + Modifier.toString(m));
	}

	static void displayConstructors(Constructor[] constructors) {
		if (constructors.length > 0) {
			System.out.println("Constructors: ");
			for (int i = 0; i < constructors.length; ++i)
				System.out.println(constructors[i].toString());

		}
	}

	static void displayInterfaces(Class[] interfaces) {

		if (interfaces.length > 0) {
			System.out.println("Interface: ");
			for (int i = 0; i < interfaces.length; ++i)
				System.out.println(interfaces[i].toString());
		}

	}

	static void displayMethods(Method[] methods) {

		if (methods.length > 0) {
			System.out.println("Methods: ");
			for (int i = 0; i < methods.length; ++i)
				System.out.println(methods[i].toString());
		}
	}

	static void displayFields(Field[] declaredFields) {

		if (declaredFields.length > 0) {
			System.out.println("Fields: ");
			for (int i = 0; i < declaredFields.length; ++i)
				System.out.println(declaredFields[i].toString());
		}
	}

}
