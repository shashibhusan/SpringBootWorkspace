package com.javapoint.junit.learn;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class TestClass002Test {

	private Connection con =null;
	
	@Test
	void testGetConnection() {
		assertDoesNotThrow(()->{
			TestClass002 class002 = new TestClass002();
			con = class002.getConnectionMethod();
		});
		
		assertNotNull(con,"There is error is creating connection please check");
	}

}
