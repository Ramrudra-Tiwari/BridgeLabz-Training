package com.annotationsreflection.annotations.markannotationimp;

public class Service {
	@ImportantMethod()
	public void method1() {
		System.out.println("Method 1");
	}
	
	@ImportantMethod(level="LOW")
	public void method2() {
		System.out.println("method 2");
	}
}