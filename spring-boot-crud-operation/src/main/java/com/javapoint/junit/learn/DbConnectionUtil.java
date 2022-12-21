package com.javapoint.junit.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbConnectionUtil {
	private static final Logger logger = LoggerFactory.getLogger(DbConnectionUtil.class);
	static Connection con = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.error("Exception is class loading");
		}
	}

	static {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/localdatabase", "root", "root");
		} catch (SQLException e) {
			logger.error("Exception is making connection");
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}
