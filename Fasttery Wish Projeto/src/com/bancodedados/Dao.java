package com.bancodedados;

import java.sql.SQLException;

public class Dao extends ConnectFactory{
	
	public static ConnectFactory conexao;
	
	public static String pesquisarSqlCode() throws SQLException{
		
		conexao = new ConnectFactory();
		
		String sql = "select * from cliente;";
		String guard = "";
		
		stmt = con.createStatement();
	    res = stmt.executeQuery(sql);
	    String vip = "";
		while(res.next()){
			if(res.getInt("vip") == 0) {
				vip = "Cliente Comum";
			}else if(res.getInt("vip") == 1) {
				vip = "Cliente Vip";
			}
			
			guard = guard+" "+res.getInt("id")+"      "+res.getString("nome")+"       "+res.getInt("idade")+"      "+res.getString("cpf")+
					"     "+vip+"       "+res.getString("veiculo")+"\n";
		}
		
		con.close();
		
		return guard;
	}
	
	
}
