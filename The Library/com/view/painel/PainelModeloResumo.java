package com.view.painel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.view.TelaLogin;

import javax.swing.JSeparator;

public class PainelModeloResumo extends JPanel {
	private static final long serialVersionUID = 1L;

	public static JTextArea txtResumo;
	public static JSeparator separadorCima;
	public static JSeparator sepradorBaixo;
	public static JLabel lblEscolha;
	public static JButton btnEscolha;
	
	public PainelModeloResumo() {
		setLayout(null);
		
		txtResumo = new JTextArea();
		txtResumo.setBounds(23, 28, 538, 304);
		add(txtResumo);
		
		JSeparator separadorCima = new JSeparator();
		separadorCima.setBounds(22, 11, 539, 2);
		add(separadorCima);
		
		JSeparator sepradorBaixo = new JSeparator();
		sepradorBaixo.setBounds(22, 352, 539, 2);
		add(sepradorBaixo);
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		btnEscolha = new JButton("");
		btnEscolha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnEscolha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEscolha.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEscolha.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEscolha.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
		});
		btnEscolha.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
		btnEscolha.setContentAreaFilled(false);
		btnEscolha.setBounds(23, 392, 254, 91);
		add(btnEscolha);
		
	}
}
