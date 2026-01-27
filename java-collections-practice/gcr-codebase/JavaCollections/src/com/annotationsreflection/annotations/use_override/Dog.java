package com.annotationsreflection.annotations.use_override;

public class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog sound--");
	}
}