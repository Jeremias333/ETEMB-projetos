package com.dao;

import java.sql.SQLException;

import com.classes.Usuario;
import com.view.TelaCadastro;

public class DaoUsuario extends ConnectFactory{
	
	public static ConnectFactory conexao;
	public static String userBD;
	public String passwordBD;
	public static Usuario usuario = new Usuario();
	
	public boolean fazerLogin(String user, String password) {
//		conexao = new ConnectFactory();
		
		userBD = user;
		
		String sqlLogin = "select usuario,senha from Usuario where usuario = '"+user+"';";
		
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sqlLogin);
			
			
			if(res != null && res.next()) {
				passwordBD = res.getString("senha");
			}
			try {
				if(userBD.equals(user) && passwordBD.equals(password)) {
					
					while(res.next())
					usuario.setUser(res.getString("usuario"));
					return true;
				}
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	public boolean fazerRegistro(String user, String password, String rePassword) {
		
//		conexao = new ConnectFactory();
		
		String sqlRegistro = "insert into Usuario (usuario,senha) values ('"+user+"','"+password+"')";
		
		if(verificarUsuario(user)) {
			if(verificarSenha(password, rePassword)) {
			
				try {
					
					stmt = con.createStatement();
					stmt.executeUpdate(sqlRegistro);
				
					 return true;
				} catch (SQLException e) {
					e.printStackTrace();
					return false;
				
				}
			
			}else {//verificar senha
				TelaCadastro.lblAvisoSenha.setText("Senhas não coincidem, digite as senhas iguais novamente.");
			}
		}else {//verificar usuario
			TelaCadastro.lblAvisoUser.setText("Usuário já existe, por favor, escreva outro nome para usuário.");
			
		}
		
		return false;
	}
	
	public boolean verificarUsuario(String user) {
		String sqlVerificarUser = "select usuario from Usuario where usuario = '"+user+"';";
		
		try {
			
			stmt = con.createStatement();
			res = stmt.executeQuery(sqlVerificarUser);
			System.out.println(res);
			
			userBD = user;

			while(!res.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return true;
		}
		System.out.println("Fora do try");
		return false;
		
	}
	
	public boolean verificarSenha(String password, String rePassword) {
		
		if(password.equals(rePassword)) {
			return true;
		}
		
		return false;
		
	}
	
	public static void getPontos(String user) {
		String sql = "select pontuacao_total from usuario where usuario = '"+user+"'";
		
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			
			System.out.println("entrou no try");
			
			System.out.println(res.next());
			while(res.next()) {
				usuario.setPontosTotal(res.getInt("pontuacao_total"));
				System.out.println(res.getInt("pontuacao_total"));
				System.out.println(usuario.getPontosTotal());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Saiu do try");
	}
	
	public static void setPontos(int qtd, String user) {
//		String sql = "insert into usuario (pontuacao_total) values ('"+qtd+"');";
		
		String sql = "Update usuario set pontuacao_total = '"+qtd+"' where usuario = '"+user+"';";
		
		try {
			stmt = con.createStatement();
			stmt.executeQuery(sql);
			
			getPontos(usuario.getUser());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void conectarBanco() {
		conexao = new ConnectFactory();
	}
}
