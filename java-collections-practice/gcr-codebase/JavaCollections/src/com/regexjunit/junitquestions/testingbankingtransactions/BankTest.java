package com.regexjunit.junitquestions.testingbankingtransactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BankTest {
	BankAccount bank = new BankAccount();
	
	@Test
	void deposit() {
		assertTrue(bank.deposit(200));
	}
	
	@Test
	void withdraw() {
		assertTrue(bank.withdraw(100));
	}
	
	@Test
	void getBalance() {
		assertEquals(BankAccount.balance,bank.getBalance());
	}
}