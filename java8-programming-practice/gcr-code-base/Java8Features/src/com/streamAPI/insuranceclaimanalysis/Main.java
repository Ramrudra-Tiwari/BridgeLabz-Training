
package com.streamAPI.insuranceclaimanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Claim> claimList = new ArrayList<>();
		
		claimList.add(new Claim(101,"Ravi","Chlid Insurance",34322));
		claimList.add(new Claim(108,"karma","Home Insurance",5443222));
		claimList.add(new Claim(102,"adam","Whole Life Insurance",2000));
		claimList.add(new Claim(103,"alice","Term Insurance",30000));
		claimList.add(new Claim(104,"monika","Money Back Policy",999900));
		claimList.add(new Claim(107,"suriya","Home Insurance",549492));
		claimList.add(new Claim(105,"suriya","Health Insurance",54332));
		claimList.add(new Claim(106,"kali","Home Insurance",549492));
	
		
		System.out.println(
					claimList.stream()
							.collect(Collectors.groupingBy(Claim::getType, Collectors.averagingDouble(Claim::getAmount)))
				);
	}
}
