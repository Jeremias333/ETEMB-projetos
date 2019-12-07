package com.dao;

import java.sql.SQLException;

public class DaoResumo extends ConnectFactory{
	
	
	public static String resumoBR(int num) {
		String sql = "select texto from resumobr where id = '"+num+"';";
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			while(res.next()) {
				return res.getString("texto");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String resumoUS(int num) {
		String sql = "select texto from resumous where id = '"+num+"';";
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			while(res.next()) {
				return res.getString("texto");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String resumoES(int num) {
		String sql = "select texto from resumoes where id = '"+num+"';";
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			while(res.next()) {
				return res.getString("texto");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
