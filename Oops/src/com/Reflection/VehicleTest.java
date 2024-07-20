package com.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import inheritance.Vehicle;

public class VehicleTest {
	
	public void createobj(int vl,String na) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Vehicle>co=Vehicle.class.getDeclaredConstructor();
		co.setAccessible(true);
		Object o=co.newInstance();
		if(o instanceof Vehicle) {
		
			Vehicle v=(Vehicle) o;
			
		}
	}

	public static void main(String[] args) {

	}

}
