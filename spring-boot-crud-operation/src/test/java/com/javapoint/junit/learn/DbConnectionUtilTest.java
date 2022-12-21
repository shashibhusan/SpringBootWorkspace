package com.javapoint.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DbConnectionUtilTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	

	@BeforeEach
	public void setUpStreams() {
		System.out.println("==============");
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void out() {
		System.out.print("hello");
		assertEquals("hello", outContent.toString());
	}

	@Test
	void testGetCon() {
		Connection con1 = null;
		Connection con2 = null;
		con1 = DbConnectionUtil.getCon();
		con2 = DbConnectionUtil.getCon();
		assertNotNull(con1);
		assertSame(con1, con2);
	}

	@Test
	void testClass() {
		DbConnectionUtil connectionUtil = new DbConnectionUtil();
		assertNotNull(connectionUtil);
	}

	@Test
	void testException() {
		ClassNotFoundException ex = assertThrows(ClassNotFoundException.class, () -> {
			Class.forName("com.mysql.jdbc.abc");
		});
		assertThrows(SQLException.class, () -> {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/localdatabase", "root2", "root2");
		});
		
		 
	}

}
