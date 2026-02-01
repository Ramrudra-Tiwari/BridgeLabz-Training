package com.collectors.librarybookstatistics;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Book> list = List.of(
					new Book(101,"Comedy","happy happy",290,200),
					new Book(101,"Finance","Rich Dad Poor Dad",400,900),
					new Book(101,"Motivation","happy happy",560,399),
					new Book(101,"Personal Developemnt","automic Habits",460,568),
					new Book(101,"Comic","how to win",990,332),
					new Book(101,"Wealth","Heatheir life style",490,134)
				);
		
		
		System.out.println(
				list.stream()
					.collect(Collectors.groupingBy(Book::getGenere, Collectors.summarizingInt(Book::getBookPage)))
				);
	}
}