package com.dao;

import java.sql.SQLException;

public class Dao extends ConnectFactory {
	
	private static String guard = "";
	
	static ConnectFactory conexao;
	
	public static void passarSqlCode(String sql) throws SQLException{ //caso queira passar um sql de emerg�ncia
		stmt = con.createStatement();
	    stmt.executeUpdate(sql);
	}
	
	
	public static String recuperarDados() throws SQLException {
		conexao = new ConnectFactory();
		
		String sql = "Select * from usuario";
		
		String perfil = "";
		
		stmt = con.createStatement();
		res = stmt.executeQuery(sql);
		
		while(res.next()){
			if(res.getInt("adm") == 0) {
				perfil = "Usu�rio";
			}else {
				perfil = "Administrador";
			}
			guard = guard+" "+res.getInt("id")+"      "+res.getString("user")+"               "+res.getString("password")+"        "+perfil+"\n";
			
		}
		return guard; 
	}
	

	
	
}
