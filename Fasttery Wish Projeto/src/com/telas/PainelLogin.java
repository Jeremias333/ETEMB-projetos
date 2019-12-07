package com.telas;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.bancodedados.DaoUsuario;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PainelLogin extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtNick;
	JLabel lblCadastreseAgoraE;
	
	public static String persistirNome;
	
	public PainelLogin() {
		setBounds(new Rectangle(0, 0, 733, 309));
		setLayout(null);
		
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCadastreseAgoraE.setForeground(Color.BLACK);
				lblCadastreseAgoraE.setText("Cadastre-se agora e lave seu veiculo \"more fasttery\"");
			}
		});
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSenha.setEchoChar('*');
		txtSenha.setBounds(185, 153, 414, 39);
		add(txtSenha);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblUsuario.setBounds(73, 94, 105, 27);
		add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblSenha.setBounds(129, 165, 46, 18);
		add(lblSenha);
		
		JLabel lblFaaSeuLogin = new JLabel("<html><body>Fa\u00E7a seu<font color = \"RED\"> LOGIN </font> j\u00E1!</body> </html>");
		lblFaaSeuLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaaSeuLogin.setForeground(Color.DARK_GRAY);
		lblFaaSeuLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblFaaSeuLogin.setBounds(91, 18, 550, 44);
		add(lblFaaSeuLogin);
		
		lblCadastreseAgoraE = new JLabel("Cadastre-se agora e lave seu veiculo \"more fasttery\"");
		lblCadastreseAgoraE.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastreseAgoraE.setForeground(Color.DARK_GRAY);
		lblCadastreseAgoraE.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblCadastreseAgoraE.setBounds(102, 258, 550, 44);
		add(lblCadastreseAgoraE);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				persistirNome = txtNick.getText();
				
				boolean permissao;
				permissao = DaoUsuario.loginUsuario(txtNick.getText(), txtSenha.getText());
				
				if(permissao == true) {
					TelaInicial.chamarPainelPrincipal();
				}else {
					lblCadastreseAgoraE.setForeground(Color.RED);
					lblCadastreseAgoraE.setText("Senha ou Usuário errados");
				}
				
			}
		});
		btnEntrar.setBounds(323, 217, 89, 23);
		add(btnEntrar);
		
		JButton btnCadastrarse = new JButton("Cadastrar-se");
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial.chamarCadastro();
			}
		});
		btnCadastrarse.setBounds(584, 267, 139, 31);
		add(btnCadastrarse);
		
		txtNick = new JTextField();
		txtNick.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCadastreseAgoraE.setForeground(Color.BLACK);
				lblCadastreseAgoraE.setText("Cadastre-se agora e lave seu veiculo \"more fasttery\"");
			}
		});
		txtNick.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNick.setBounds(185, 89, 414, 39);
		add(txtNick);
		txtNick.setColumns(10);

	}
}
