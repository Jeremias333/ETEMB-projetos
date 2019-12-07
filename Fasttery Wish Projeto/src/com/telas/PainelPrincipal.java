package com.telas;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.bancodedados.DaoUsuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelPrincipal extends JPanel {
	private static final long serialVersionUID = 1L;
	JLabel lblNick;
	public PainelPrincipal() {
		setBounds(new Rectangle(0, 0, 733, 309));
		setLayout(null);
		
		JLabel lblSelecioneUmaDas = new JLabel("Selecione uma das op\u00E7\u00F5es");
		lblSelecioneUmaDas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneUmaDas.setForeground(Color.DARK_GRAY);
		lblSelecioneUmaDas.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblSelecioneUmaDas.setBounds(73, 11, 513, 44);
		add(lblSelecioneUmaDas);
		
		JButton btnPerfil = new JButton(" Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.chamarPainelPerfil();
			}
		});
		btnPerfil.setBounds(270, 263, 137, 35);
		add(btnPerfil);
		
		JButton btnPedirNovaLavagem = new JButton("Agendar Lavagem");
		btnPedirNovaLavagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.chamarProduto();
			}
		});
		btnPedirNovaLavagem.setBounds(270, 101, 137, 35);
		add(btnPedirNovaLavagem);
		
		JButton btnLavagensAgendadas = new JButton("Lavagens Agendadas");
		btnLavagensAgendadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLavagensAgendadas.setBounds(270, 161, 137, 35);
		add(btnLavagensAgendadas);
		
		JButton btnSairDaConta = new JButton("Sair da Conta");
		btnSairDaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.chamarLoginCliente();
			}
		});
		btnSairDaConta.setBounds(10, 263, 137, 35);
		add(btnSairDaConta);
		
		lblNick = new JLabel(" ");
		lblNick.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNick.setBounds(417, 268, 306, 30);
		add(lblNick);
		
		aplicarNome();
	}
	
	public void aplicarNome() {
		lblNick.setText(DaoUsuario.getNomeCompleto(PainelLogin.persistirNome));
	}
	
	
}
