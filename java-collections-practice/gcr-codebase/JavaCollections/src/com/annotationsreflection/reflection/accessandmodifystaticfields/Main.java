package com.annotationsreflection.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Configuration.class;
		
		Field fields = clazz.getDeclaredField("API_KEY");
		fields.setAccessible(true);
		
		fields.set(null, "NULL");
		
		System.out.println((String)fields.get(fields));
	}
}