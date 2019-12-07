package com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import com.dao.DaoUsuario;
import com.utils.FundoBg;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Point point = new Point();
	
	public static int numeroBandeira = TelaLogin.numeroBandeira;
	
	FundoBg contentPane = new FundoBg("C:\\\\Users\\\\Sagitta Draco\\\\eclipse-workspace\\\\The Library\\\\src\\images\\screen.png");// trocar por pasta com background;
	
//	FundoBg contentPane = new FundoBg(".\\images\\screen.png");// trocar por pasta com background;
	
	public static JLabel lblAvisos;
	public static JLabel lblUsurioOuSenha;
	
	String toLblAviso = "AVISO";
	String toLblAdvertencia;
	
	public static JTextField txtUsuario;
	public static JPasswordField txtRePassword;
	public static JPasswordField txtPassword;
	
	
	private JLabel lblBandeira;
	
	public static JLabel lblAvisoUser;
	public static JLabel lblAvisoSenha;
	
	public static void inicio() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
		            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		        } catch (UnsupportedLookAndFeelException ex) {
		            ex.printStackTrace();
		        } catch (InstantiationException ex) {
		            ex.printStackTrace();
		        } catch (IllegalAccessException ex) {
		            ex.printStackTrace();
		        } catch (ClassNotFoundException ex) {
		            ex.printStackTrace();
		        }
				
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setTitle("The Library - Cadastro");
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);

				    frame.addMouseListener(new MouseAdapter() {
				      public void mousePressed(MouseEvent e) {
				        point.x = e.getX();
				        point.y = e.getY();
				        
				      }
				    });
				    
				    frame.addMouseMotionListener(new MouseMotionAdapter() {
				      public void mouseDragged(MouseEvent e) {
				        Point p = frame.getLocation();
				        frame.setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
				        
				      }
				    });

				    frame.getContentPane().add(new JLabel("Drag Me", JLabel.CENTER), BorderLayout.CENTER);

				    frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastro.class.getResource("/images/kamui.png.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField("");
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAvisoUser.setText("");
			}
		});
		txtUsuario.setToolTipText("Digite um nome de acesso para sua conta");
		txtUsuario.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(243, 164, 484, 44);
		contentPane.add(txtUsuario);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAvisoSenha.setText("");
			}
		});
		txtPassword.setEchoChar('*');
		txtPassword.setToolTipText("Digite sua senha");
		txtPassword.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 25));
		txtPassword.setBounds(243, 261, 485, 44);
		contentPane.add(txtPassword);
		
		txtRePassword = new JPasswordField();
		txtRePassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAvisoSenha.setForeground(Color.RED);
				lblAvisoSenha.setText("");
			}
		});
		txtRePassword.setToolTipText("Confirme a senha");
		txtRePassword.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 25));
		txtRePassword.setEchoChar('*');
		txtRePassword.setBounds(244, 316, 485, 44);
		contentPane.add(txtRePassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 524, 780, 2);
		contentPane.add(separator);
		
		final JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setForeground(new Color(204, 0, 51));
		lblRegistro.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
		lblRegistro.setBounds(297, 91, 263, 62);
		contentPane.add(lblRegistro);
		
		
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsuario.setForeground(Color.DARK_GRAY);
		lblUsuario.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblUsuario.setBounds(146, 165, 93, 39);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblSenha.setBounds(140, 262, 93, 39);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblConfirmarSenha.setForeground(Color.DARK_GRAY);
		lblConfirmarSenha.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblConfirmarSenha.setBounds(-14, 316, 248, 44);
		contentPane.add(lblConfirmarSenha);
		
		lblAvisoUser = new JLabel("");
		lblAvisoUser.setForeground(Color.RED);
		lblAvisoUser.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		lblAvisoUser.setBounds(171, 215, 577, 39);
		contentPane.add(lblAvisoUser);
		
		lblAvisoSenha = new JLabel("");
		lblAvisoSenha.setForeground(Color.RED);
		lblAvisoSenha.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		lblAvisoSenha.setBounds(171, 371, 577, 39);
		contentPane.add(lblAvisoSenha);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setBounds(389, 412, 164, 63);
		btnRegistrar.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				DaoUsuario dao = new DaoUsuario();
				
				boolean campos = false; 
				
				if(txtUsuario.getText() != null && !txtUsuario.getText().isEmpty()) {
					if(txtPassword.getText() != null && !txtPassword.getText().isEmpty()) {
						if(txtRePassword.getText() != null && !txtRePassword.getText().isEmpty()) {
							boolean registrado = dao.fazerRegistro(txtUsuario.getText(), txtPassword.getText(), txtRePassword.getText());
							
							campos = true;
							
							if(registrado) {
								lblAvisoSenha.setText("Usuário Cadastrado com sucesso, por favor acesse sua conta.");
								lblAvisoSenha.setForeground(Color.BLUE);
							}
						}
					}
				}
				
				if(!campos) {
					lblAvisoSenha.setText("Nenhum dos campos podem estar vazio!");
				}
					
				
			}
			
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegistrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
			}
		});
		
		JLabel lblRegistrar = new JLabel("Registrar");
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblRegistrar.setBounds(432, 412, 93, 44);
		contentPane.add(lblRegistrar);
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
		contentPane.add(btnRegistrar);
		
		JButton btnTrocarIdioma = new JButton("");
		btnTrocarIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaIdioma.main(null);
				dispose();
			}
		});
		btnTrocarIdioma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnTrocarIdioma.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/language.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnTrocarIdioma.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/language_selected.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnTrocarIdioma.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/language.png")));
			}
		});
		btnTrocarIdioma.setContentAreaFilled(false);
		btnTrocarIdioma.setIcon(new ImageIcon(TelaCadastro.class.getResource("/images/language.png")));
		btnTrocarIdioma.setBounds(20, 524, 164, 76);
		contentPane.add(btnTrocarIdioma);
	
		lblBandeira = new JLabel("");
		trocarBandeira(numeroBandeira);
		lblBandeira.setBounds(656, 537, 134, 44);
		contentPane.add(lblBandeira);
		
		JLabel lblTemConta = new JLabel("JÁ TEM UMA CONTA?");
		lblTemConta.setForeground(new Color(204, 0, 51));
		lblTemConta.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		lblTemConta.setBounds(379, 472, 253, 54);
		contentPane.add(lblTemConta);
		

		JLabel lblEntrar = new JLabel("Entrar");
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar.setForeground(Color.WHITE);
		lblEntrar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblEntrar.setBounds(656, 471, 89, 26);
		contentPane.add(lblEntrar);
		
		JButton btnEntrar = new JButton("");
		btnEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				TelaLogin.inicio();
				dispose();
			}
		});
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/entrar.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/entrar_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/entrar.png")));
			}
		});
		btnEntrar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/entrar.png")));
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBounds(605, 464, 185, 62);
		contentPane.add(btnEntrar);
		
		JButton btnEkis = new JButton("");
		btnEkis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEkis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnEkis.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/X_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEkis.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/X.png")));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnEkis.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/X.png")));
			}
		});
		btnEkis.setContentAreaFilled(false);
		btnEkis.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/X.png")));
		btnEkis.setBounds(737, 0, 53, 67);
		contentPane.add(btnEkis);
		
		JButton btnMinum = new JButton("");
		btnMinum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		
		btnMinum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMinum.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/minus_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMinum.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/minus.png")));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnMinum.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/minus.png")));
			}
		});
		
		btnMinum.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/minus.png")));
		btnMinum.setContentAreaFilled(false);
		btnMinum.setBounds(688, 0, 55, 67);
		contentPane.add(btnMinum);
	}
	
	public void trocarBandeira(int numeroBandeira) {
		if(numeroBandeira == 1) {
			lblBandeira.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/br_normal.png")));
		}else if(numeroBandeira == 2) {
			lblBandeira.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/us_normal.png")));
		}else if(numeroBandeira == 3) {
			lblBandeira.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/mx_normal.png")));
		}
	}
}
