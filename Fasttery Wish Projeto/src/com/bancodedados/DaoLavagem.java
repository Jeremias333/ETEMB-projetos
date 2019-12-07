package com.bancodedados;

import java.sql.SQLException;

import com.classes.ModeloLavagem;

public class DaoLavagem extends ConnectFactory{
	
	static ConnectFactory conexao;
	
	public static boolean adicionarLavagem(String nick, String veiculo, String tipoLavagem, String marca,
				String dia, String hora, String observacao, float preco) {
		conexao = new ConnectFactory();
		
		String sql = "INSERT INTO lavagem (nomeCliente, veiculo, tipoLavagem, marca, dia,"
		+"hora, observacao, preco) VALUES "
		+"('"+nick+"','"+veiculo+"','"+tipoLavagem+"',"
		+"'"+marca+"','"+dia+"','"+hora+"','"+observacao+"','"+preco+"');";		
		
		try {
		stmt = con.createStatement();
		stmt.executeUpdate(sql);
		
		return true;
		} catch (SQLException e) {
		e.printStackTrace();
		return false;
		}
		}
		
	public static ModeloLavagem retornarLavagem(String nick) {
		
		conexao = new ConnectFactory();
		ModeloLavagem lavagem = new ModeloLavagem();
		
		String sql = "SELECT * FROM lavagem WHERE nome = '"+nick+"';";
		
		try {
		stmt = con.createStatement();
		res = stmt.executeQuery(sql);
		
		while(res.next()) {
		lavagem.setCodigo(res.getInt("codigo"));
		lavagem.setNome(res.getString("nome"));
		lavagem.setTipoLavagem(res.getString("tipoLavagem"));
		lavagem.setMarca(res.getString("marca"));
		lavagem.setDia(res.getString("hora"));
		lavagem.setObservacao(res.getString("observacao"));
		lavagem.setPreco(res.getFloat("preco"));
		return lavagem;
		}
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	return null;
	}
	
}
