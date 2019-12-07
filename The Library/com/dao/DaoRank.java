package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classes.Rank;

public class DaoRank extends ConnectFactory {
	
	public List<Object> listaRank = new ArrayList<>();
	
	public Rank rank1, rank2, rank3, rank4, rank5;
	
	ConnectFactory conexao = new ConnectFactory();
	
	public DaoRank() {
		String sql = "select * from ranque";
		
		try {
			
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			
			if(res != null && res.next()) {
				
				
				rank1 = new Rank(res.getInt("lugar"), res.getString("nick"), res.getInt("pontuacao"));
				res.relative(1);
				
				rank2 = new Rank(res.getInt("lugar"), res.getString("nick"), res.getInt("pontuacao"));
				res.relative(1);
				
				rank3 = new Rank(res.getInt("lugar"), res.getString("nick"), res.getInt("pontuacao"));
				res.relative(1);
				
				rank4 = new Rank(res.getInt("lugar"), res.getString("nick"), res.getInt("pontuacao"));
				res.relative(1);
				
				rank5 = new Rank(res.getInt("lugar"), res.getString("nick"), res.getInt("pontuacao"));
				res.relative(1);
			}
				
				listaRank.add(rank1);
				listaRank.add(rank2);
				listaRank.add(rank3);
				listaRank.add(rank4);
				listaRank.add(rank5);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public List<Object> procurarValores() {
//		
//		String sql = "select * from ranque";
//				
//				
//		try {
//			
//			stmt = con.createStatement();
//			res = stmt.executeQuery(sql);
//			
//			if(res != null && res.next()) {
//				
//				
//				rank1 = new Rank(res.getInt("lugar"), res.getString("nome"), res.getInt("pontuacao"));
//				res.relative(1);
//				
//				rank2 = new Rank(res.getInt("lugar"), res.getString("nome"), res.getInt("pontuacao"));
//				res.relative(1);
//				
//				rank3 = new Rank(res.getInt("lugar"), res.getString("nome"), res.getInt("pontuacao"));
//				res.relative(1);
//				
//				rank4 = new Rank(res.getInt("lugar"), res.getString("nome"), res.getInt("pontuacao"));
//				res.relative(1);
//				
//				rank5 = new Rank(res.getInt("lugar"), res.getString("nome"), res.getInt("pontuacao"));
//				res.relative(1);
//			}
//				
//				listaRank.add(rank1);
//				listaRank.add(rank2);
//				listaRank.add(rank3);
//				listaRank.add(rank4);
//				listaRank.add(rank5);
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return listaRank;
//		
//	}
	
}
