
package com.collectors.librarybookstatistics;

public class Book {
	private long bookId;
	private String genere;
	private String BookName;
	private double price;
	private int bookPage;
	
	public Book(long bookId, String genere, String bookName, double price, int bookPage) {
		this.bookId = bookId;
		this.genere = genere;
		BookName = bookName;
		this.price = price;
		this.bookPage = bookPage;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", genere=" + genere + ", BookName=" + BookName + ", price=" + price
				+ ", bookPage=" + bookPage + "]";
	}	
}
