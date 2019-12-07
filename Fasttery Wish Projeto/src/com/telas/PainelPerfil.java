package com.telas;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.bancodedados.DaoUsuario;
import com.classes.Usuario;

import javax.swing.JButton;

public class PainelPerfil extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JLabel lblUserId;
	JLabel lblUsernome;
	JLabel lblUserDeve;
	
	public PainelPerfil() {
		setBounds(new Rectangle(0, 0, 733, 309));
		setLayout(null);
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setForeground(Color.DARK_GRAY);
		lblPerfil.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblPerfil.setBounds(84, 11, 513, 44);
		add(lblPerfil);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(24, 11, 89, 23);
		add(btnVoltar);
		
		JLabel lblId = new JLabel(" ID:");
		lblId.setBounds(118, 85, 24, 14);
		add(lblId);
		
		lblUserId = new JLabel("");
		lblUserId.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUserId.setBounds(146, 76, 62, 33);
		add(lblUserId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(84, 129, 58, 14);
		add(lblNome);
		
		lblUsernome = new JLabel("");
		lblUsernome.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUsernome.setBounds(146, 120, 435, 33);
		add(lblUsernome);
		
		JLabel lblDeve = new JLabel("Deve:");
		lblDeve.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeve.setBounds(84, 175, 58, 14);
		add(lblDeve);
		
		lblUserDeve = new JLabel("");
		lblUserDeve.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUserDeve.setBounds(146, 164, 62, 33);
		add(lblUserDeve);
		
		popularPerfil();
	}
	
	public void popularPerfil() {
		
		Usuario user = DaoUsuario.popularPerfil(PainelLogin.persistirNome);
		
		lblUserId.setText(""+user.getID());
		lblUsernome.setText(user.getNome());
		lblUserDeve.setText(""+user.getDeve());
		
		
	}
	
}
