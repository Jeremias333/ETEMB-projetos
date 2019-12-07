package com.telas;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.bancodedados.DaoUsuario;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PainelCadastro extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JPasswordField txtReSenha;
	private JTextField txtNomecompleto;
	JLabel lblCadastreseJ;
	JLabel lblJSeCadastrou;
	
	public PainelCadastro() {
		setBounds(new Rectangle(0, 0, 733, 309));
		setLayout(null);
		
		lblCadastreseJ = new JLabel("<html><body><font color = \"RED\"> Cadastre-se </font> j\u00E1!</body> </html>");
		lblCadastreseJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastreseJ.setForeground(Color.DARK_GRAY);
		lblCadastreseJ.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblCadastreseJ.setBounds(118, 0, 550, 44);
		add(lblCadastreseJ);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblJSeCadastrou.setForeground(Color.BLACK);
				lblJSeCadastrou.setText("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
			}
		});
		txtUsuario.setBounds(227, 66, 396, 38);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblJSeCadastrou.setForeground(Color.BLACK);
				lblJSeCadastrou.setText("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
			}
		});
		txtSenha.setBounds(227, 156, 396, 38);
		add(txtSenha);
		
		txtReSenha = new JPasswordField();
		txtReSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblJSeCadastrou.setForeground(Color.BLACK);
				lblJSeCadastrou.setText("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
			}
		});
		txtReSenha.setBounds(227, 198, 396, 38);
		add(txtReSenha);
		
		lblJSeCadastrou = new JLabel("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
		lblJSeCadastrou.setHorizontalAlignment(SwingConstants.CENTER);
		lblJSeCadastrou.setForeground(Color.DARK_GRAY);
		lblJSeCadastrou.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblJSeCadastrou.setBounds(118, 265, 550, 44);
		add(lblJSeCadastrou);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.chamarLoginCliente();
			}
		});
		btnLogin.setBounds(592, 278, 89, 23);
		add(btnLogin);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(verificarCamposVazios()) {
					@SuppressWarnings("deprecation")
					boolean permissao = DaoUsuario.cadastrarUsuario(txtNomecompleto.getText(), txtUsuario.getText(), txtSenha.getText(), txtReSenha.getText());
					if(permissao) {
						lblJSeCadastrou.setText("Cadastrado com sucesso");
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e1) {

							e1.printStackTrace();
						}
						lblJSeCadastrou.setForeground(Color.BLACK);
						lblJSeCadastrou.setText("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
					}else {
						lblJSeCadastrou.setForeground(Color.RED);
						lblJSeCadastrou.setText("Alguns dos campos estão inválidos.");
					}
				
				}else {
					lblJSeCadastrou.setForeground(Color.RED);
					lblJSeCadastrou.setText("Nenhum dos campos devem ficar em branco.");
					
				}
			}
		});
		btnCadastrar.setBounds(375, 247, 89, 23);
		add(btnCadastrar);
		
		JLabel label = new JLabel("Usuario");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		label.setBounds(112, 78, 105, 27);
		add(label);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblSenha.setBounds(118, 161, 105, 27);
		add(lblSenha);
		
		JLabel lblRepitaASenha = new JLabel("Repita a senha");
		lblRepitaASenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRepitaASenha.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblRepitaASenha.setBounds(118, 203, 105, 27);
		add(lblRepitaASenha);
		
		JLabel lblNomecompleto = new JLabel("NomeCompleto");
		lblNomecompleto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomecompleto.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNomecompleto.setBounds(118, 116, 105, 27);
		add(lblNomecompleto);
		
		txtNomecompleto = new JTextField();
		txtNomecompleto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblJSeCadastrou.setForeground(Color.BLACK);
				lblJSeCadastrou.setText("J\u00E1 se cadastrou? Acesse sua conta agora mesmo!");
			}
		});
		txtNomecompleto.setColumns(10);
		txtNomecompleto.setBounds(227, 107, 396, 38);
		add(txtNomecompleto);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(157, 72, 21, 21);
		add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(112, 108, 21, 21);
		add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(167, 156, 21, 21);
		add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(118, 198, 21, 21);
		add(label_4);

	}
	
	@SuppressWarnings("deprecation")
	public boolean verificarCamposVazios() {
		if(txtUsuario.getText() != null && !txtUsuario.getText().equals("")) {
			if(txtNomecompleto.getText() != null && !txtNomecompleto.getText().equals("")) {
				if(txtSenha.getText() != null && !txtSenha.getText().equals("")) {
					if(txtReSenha.getText() != null && !txtReSenha.getText().equals("")) {
						return true;
					}
				}
			}
		}
		return false;
	}
		
}
