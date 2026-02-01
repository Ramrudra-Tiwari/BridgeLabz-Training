
package com.lambdaexpressions.hospitalpatientIDprinting;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Patient> p = new ArrayList<>();
		
		
		p.add(new Patient(101,"ravi","Normal fever"));
		p.add(new Patient(102,"kali","common cold"));
		p.add(new Patient(103,"suriya","apendice"));
		
		p.stream().map(Patient::getId).forEach(System.out::println);
	}
}
	