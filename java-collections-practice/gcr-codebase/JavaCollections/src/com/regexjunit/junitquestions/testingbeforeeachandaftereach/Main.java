package com.regexjunit.junitquestions.testingbeforeeachandaftereach;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Main {
	DatabaseConnection db;
	
	@BeforeEach
	void setup() {
		db = new DatabaseConnection();
		db.connect();
	}
	
	@AfterEach
	void tearDown() {
		db.disconnect();
	}
	
	@Test
	void testConnectionIsEstablished() {
		assertTrue(db.isConnected());
	}
	
	@Test
	void testConnectionIsClosedAfterTest() {
		assertTrue(db.isConnected());
	}
	
}