package com.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectFactory {
		
	public static String url = "";
	public static String user = "";
	public static String password = "";
	
	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet res = null;

	
	public ConnectFactory() {
		url = "jdbc:mysql://localhost:3306/fastterywish";
		user = "root";
		password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
