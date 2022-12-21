package com.javatpoint.controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitSampleTest {

	@BeforeAll
	  static void beforeAll() {
	    System.out.println("**--- Executed once before all test methods in this class ---**");
	  }
	
	@BeforeEach
	  void beforeEach() {
	    System.out.println("**--- Executed before each test method in this class ---**");
	  }
	
	@Test
	void test() {
		System.out.println("**--- Test method1 executed ---**");
	}
	
	@DisplayName("Test method2 with condition")
	  @Test
	  void testMethod2() {
	    System.out.println("**--- Test method2 executed ---**");
	  }
	
	@AfterEach
	  void afterEach() {
	    System.out.println("**--- Executed after each test method in this class ---**");
	  }
	
	@AfterAll
	  static void afterAll() {
	    System.out.println("**--- Executed once after all test methods in this class ---**");
	  }

}
