package com.javapoint.junit.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestClass002 {
	
	public Connection getConnectionMethod() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localdatabase","root","root");
		return con;
	}

}
