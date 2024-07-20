package com.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SolutionReflectionDemo {

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c = ReflectionDemo.class;

		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("cube", new Class[] { int.class });
		m.setAccessible(true);
		m.invoke(o, 5);

	}

}
