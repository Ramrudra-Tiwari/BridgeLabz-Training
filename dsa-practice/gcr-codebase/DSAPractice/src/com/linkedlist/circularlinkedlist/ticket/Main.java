package com.linkedlist.circularlinkedlist.ticket;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Booking book = new Booking();
		Ticket t1 = new Ticket(101l,"Ramrudra","Titu the Coder",001,LocalDate.now());
		Ticket t2 = new Ticket(102l,"merazz","DJ",002,LocalDate.now());
		Ticket t3 = new Ticket(103l,"Anni","Bahubali",003,LocalDate.now());
		book.add(t1);
		book.add(t2);
		book.add(t3);
		book.currentTicket();
		book.search("DJ");
		book.totalAmount();
		book.delete(103l);
		book.currentTicket();
		book.totalAmount();
	}
}