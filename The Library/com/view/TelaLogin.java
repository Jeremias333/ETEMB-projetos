package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.utils.LimitaNroCaracteres;
import com.classes.Usuario;
import com.dao.DaoUsuario;
import com.utils.FundoBg;
import com.utils.VariaveisAuxiliares;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Point point = new Point();
	
	public static int numeroBandeira;
	
//	FundoBg contentPane = new FundoBg(".\\images\\screen.png");// trocar por pasta com background;
	
	FundoBg contentPane = new FundoBg("C:\\Users\\Sagitta Draco\\eclipse-workspace\\The Library\\src\\images\\screen.png");// trocar por pasta com background;
	
	
	VariaveisAuxiliares aux = new VariaveisAuxiliares();
	
	public JLabel lblBandeira;
	
	DaoUsuario daoUser;
	JLabel lblAdvertencia;
	String toLblAviso = "*USUÁRIO OU SENHA NÃO CONFEREM, TENTE NOVAMENTE!*";
	String toLblAviso1 = "AVISO";
	
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
					TelaLogin frame = new TelaLogin();
					frame.setTitle("The Library - Login");
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
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/images/kamui.png.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txtUser = new JTextField("");;
		txtUser.setDocument(new LimitaNroCaracteres(14));
		
		txtUser.setToolTipText("Digite seu nome de usuário cadastrado");
		txtUser.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent arg0) {
				lblAdvertencia.setText("");
			}
		});
		txtUser.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		txtUser.setBounds(217, 186, 484, 44);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 524, 780, 2);
		contentPane.add(separator);
		
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAdvertencia.setText("");
			}
		});
		txtPassword.setEchoChar('*');
		txtPassword.setToolTipText("Digite sua senha");
		txtPassword.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 25));
		txtPassword.setBounds(216, 263, 485, 44);
		contentPane.add(txtPassword);
		
		lblBandeira = new JLabel("");
		trocarBandeira(numeroBandeira);
		lblBandeira.setBounds(656, 537, 134, 44);
		contentPane.add(lblBandeira);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(Color.DARK_GRAY);
		lblUsurio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsurio.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblUsurio.setBounds(114, 188, 93, 39);
		contentPane.add(lblUsurio);
		
		JLabel lblLogin = new JLabel("ENTRAR");
		lblLogin.setForeground(new Color(204, 0, 51));
		lblLogin.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(299, 98, 263, 62);
		contentPane.add(lblLogin);
		
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
		
		JButton btnMinum= new JButton("");
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
		
		JLabel lblNaoTemConta = new JLabel("N\u00C3O TEM UMA CONTA?");
		lblNaoTemConta.setForeground(new Color(204, 0, 51));
		lblNaoTemConta.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		lblNaoTemConta.setBounds(377, 462, 253, 54);
		contentPane.add(lblNaoTemConta);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblSenha.setBounds(113, 262, 93, 39);
		contentPane.add(lblSenha);
		
		JLabel lblRegistrar = new JLabel("Registrar");
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setBounds(667, 463, 93, 44);
		contentPane.add(lblRegistrar);
		
		JButton btnRegistar = new JButton("");
		btnRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastro.inicio();
				dispose();
			}
		});
		btnRegistar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegistar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
			}
		});
		btnRegistar.setContentAreaFilled(false);
		btnRegistar.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/registrar.png")));
		btnRegistar.setBounds(626, 463, 164, 63);
		contentPane.add(btnRegistar);
		
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
		btnTrocarIdioma.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/language.png")));
		btnTrocarIdioma.setBounds(20, 535, 164, 65);
		contentPane.add(btnTrocarIdioma);
		
		JLabel lblEntrar = new JLabel("Entrar");
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar.setForeground(Color.WHITE);
		lblEntrar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblEntrar.setBounds(396, 398, 89, 26);
		contentPane.add(lblEntrar);
		
		JButton btnEntrar = new JButton("");
		btnEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Usuario usuario = new Usuario();
				daoUser = new DaoUsuario();
				boolean permissao = false;
				
				String user = txtUser.getText();
				usuario.setUser(user);
				
				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				usuario.setPassword(password);
				try {
					permissao = daoUser.fazerLogin(usuario.getUser(), usuario.getPassword());
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(permissao);
				
				if(permissao == true) {
					TelaPrincipal.inicio();
					dispose();
				}else{
					lblAdvertencia.setText(toLblAviso);
					txtPassword.setText("");
				}
				
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
		btnEntrar.setBounds(344, 388, 185, 65);
		contentPane.add(btnEntrar);
		
		lblAdvertencia = new JLabel("");
		lblAdvertencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvertencia.setForeground(Color.RED);
		lblAdvertencia.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		lblAdvertencia.setBounds(166, 328, 577, 39);
		contentPane.add(lblAdvertencia);
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
	
	public void conectar() {
		
	}
}
