package com.streamAPI.filteringexpiringmemberships;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Gym> list = new ArrayList<>();
		
		list.add(new Gym(101,"ravi",LocalDate.of(2026, 02, 11),LocalDate.of(2026, 02, 02)));
		list.add(new Gym(102,"kali",LocalDate.of(2025, 05, 22),LocalDate.of(2026, 03, 04)));
		list.add(new Gym(103,"suriya",LocalDate.of(2026, 02, 13),LocalDate.of(2026, 01, 06)));
		list.add(new Gym(104,"adam",LocalDate.of(2025, 12, 04),LocalDate.of(2026, 03, 04)));
		list.add(new Gym(105,"alice",LocalDate.of(2026, 11, 05),LocalDate.of(2025, 03, 05)));
		
		list.stream()
			.filter(Gym-> Gym.getExpriyDate().isAfter(LocalDate.now().plusDays(30)))
			.forEach(System.out::println);
	}
}