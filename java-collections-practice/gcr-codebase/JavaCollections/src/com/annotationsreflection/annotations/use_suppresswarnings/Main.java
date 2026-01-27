package com.annotationsreflection.annotations.use_suppresswarnings;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.domonstrateList();
	}
	@SuppressWarnings("unchecked")
	public void domonstrateList() {
		List list = new ArrayList<>();
		
		list.add(39);
		list.add("344");
		list.add("ramrudra");
		
		System.out.println(list.toString());
	}
}