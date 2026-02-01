package com.collectors.orderrevenuesummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Order> orders = List.of(
	            new Order("Titu", 1200.50),
	            new Order("Ravi", 800.00),
	            new Order("Titu", 300.00),
	            new Order("Ravi", 150.75),
	            new Order("Kiran", 999.99)
	        );
		
		 Map<String, Double> revenuePerCustomer = orders.stream()
														.collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::getOrderTotal)));
		 
		 
		 System.out.println(revenuePerCustomer);
	}
}