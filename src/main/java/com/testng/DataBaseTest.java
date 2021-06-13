package com.testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTest {

	public static void main(String[] args) throws SQLException {

			//MySQl DataBase
		//jdbc:mysql://localhost:3306/databasename
		Connection con=DriverManager.getConnection("url", "username", "password");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from temp;");
	
	while(rs.next())
	{
		String username=rs.getString("UserName");
		System.out.println(username);
		String password=rs.getString("Password");
		System.out.println(password);
	}


	}

}
