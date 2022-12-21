package com.javatpoint.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JunitAssertionTest {

	@Test
	void testAssertEqual() {
		 assertEquals("ABC", "ABC");
		 assertEquals(20, 20, "optional assertion message");
		 assertEquals(2 + 2, 4);
	}
	
	@Test
	void testAssertFalse() {
		 assertFalse("FirstName".length() == 10);
		 assertFalse(10 > 20, "assertion message");
	}
	
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 assertNull(str1);
		 assertNotNull(str2);	
	}
	
	@Test
	void testAssertAll() {
		 String str1 = "abc";
		 String str2 = "pqr";
		 String str3 = "xyz";
		 assertAll("numbers",
		      () -> assertEquals(str1,"abc"),
			  () -> assertEquals(str2,"pqr"),
			  () -> assertEquals(str3,"xyz")
		 );
	}
	
	@Test
	void testAssertTrue() {
		 assertTrue("FirstName".startsWith("F"));
	}
}
