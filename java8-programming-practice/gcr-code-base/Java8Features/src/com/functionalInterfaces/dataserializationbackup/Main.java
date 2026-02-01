package com.functionalInterfaces.dataserializationbackup;

import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		Animal a = new Animal();
		
		if(p instanceof Serializable) {
			System.out.println("Person is Serializable");
		}else {
			System.out.println("Person is not Serializable");
		}
		
		if(a instanceof Serializable) {
			System.out.println("Animal is Serializable");
		}else {
			System.out.println("Animal is not Serializable");
		}
	}
}