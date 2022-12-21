package com.javapoint.junit.learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass001Test {

	@Test
	void testHelloWorld() {
		String expected="hi shashi";
		 TestClass001 class001=new TestClass001();
		 String actual=class001.helloWorld("shashi");
		 assertEquals(expected, actual);
	}

}
