
package com.streamAPI.loggingtransactions;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> transcationList = List.of(
					"1234ASDF",
					"95934DKJ",
					"9493DKCK",
					"483DJSIK",
					"1234EFS3",
					"1234DW23F"
				);
		
		transcationList.stream()
						.forEach(id-> System.out.println(LocalDate.now()+" transcation :"+id));
	}
}
