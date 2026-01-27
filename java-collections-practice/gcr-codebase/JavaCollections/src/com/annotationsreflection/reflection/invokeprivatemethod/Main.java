package com.annotationsreflection.reflection.invokeprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String args[]) {
		try {
			Calculator cal = new Calculator();
			
			Class<?> clazz = cal.getClass();
			
			Method method = clazz.getDeclaredMethod("mul", int.class,int.class);
			method.setAccessible(true);
						
			Object result = method.invoke(cal, 5,6);
			System.out.println("Result via reflection: "+result);
		}
		catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			System.out.println(" "+e.getMessage());
		}
	}
}