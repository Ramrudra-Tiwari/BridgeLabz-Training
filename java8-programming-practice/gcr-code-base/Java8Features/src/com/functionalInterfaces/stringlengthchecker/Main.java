
package com.functionalInterfaces.stringlengthchecker;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		Function<String, Integer> a = s-> s.length();
		
		System.out.println(a.apply("ravi"));
	}
}
