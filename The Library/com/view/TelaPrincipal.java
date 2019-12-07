package com.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import com.dao.DaoUsuario;
import com.utils.FundoBg;
import com.view.intern.InternTelaEscolha;
import com.view.intern.InternTelaRank;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TelaPrincipal extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private static Point point = new Point();
	
	FundoBg contentPane = new FundoBg("C:\\\\Users\\\\Sagitta Draco\\\\eclipse-workspace\\\\The Library\\\\src\\images\\screen_large.png");// trocar por pasta com background;
	
//	FundoBg contentPane = new FundoBg(".\\images\\screen_large.png");// trocar por pasta com background;
	
	
	private JLabel lblBandeira;
	
	public static int numeroBandeira = TelaLogin.numeroBandeira;
	
	public static JDesktopPane desktopPane;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static JRadioButton rdbtnAutoDaCompadecida;
	public static JRadioButton rdbtnMemoriasPostumasBras;
	public static JRadioButton rdbtnOCortio;
	
	
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
					TelaPrincipal frame = new TelaPrincipal();
					frame.setTitle("The Library - Menu Principal");
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

	
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/images/kamui.png.png")));
//		livro = 1;
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnEkis.setBounds(1037, 0, 53, 67);
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
		btnMinum.setBounds(988, 0, 55, 67);
		contentPane.add(btnMinum);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(Color.DARK_GRAY);
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblMenu.setBounds(76, 78, 93, 39);
		contentPane.add(lblMenu);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		desktopPane.setOpaque(false);
		desktopPane.setBounds(254, 78, 836, 433);
		contentPane.add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		
		//R: 206 G: 14 B: 89
		panel.setBackground(new Color(206, 14, 89));
		desktopPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Library");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 82));
		lblNewLabel.setBounds(10, 0, 812, 117);
		panel.add(lblNewLabel);
		
		JLabel lblBemVindosA = new JLabel("<html><body>Bem vindos a nossa biblioteca virtual de acesso a cultura <br>brasileira, o The Library, fique avontade para acessar nosso conte\u00FAdo, na esquerda temos alguns bot\u00F5es, clique neles e o conte\u00FAdo ser\u00E1 exibido.<br><br>\r\nDivirta-se!!<br><br>\r\n<font color=\"C0C0C0\">*Antes de escolher o QUIZ ou RESUMO, selecione um dos livros.*</font>\r\n</body></html>");
		lblBemVindosA.setVerticalAlignment(SwingConstants.TOP);
		lblBemVindosA.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindosA.setForeground(Color.WHITE);
		lblBemVindosA.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 30));
		lblBemVindosA.setBounds(10, 111, 812, 307);
		panel.add(lblBemVindosA);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/images/_book.gif")));
		label.setBounds(109, 229, 177, 108);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 522, 1080, 2);
		contentPane.add(separator);
		
		lblBandeira = new JLabel("");
		trocarBandeira(numeroBandeira);
		lblBandeira.setBounds(956, 535, 134, 44);
		contentPane.add(lblBandeira);
		
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
		btnTrocarIdioma.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/images/language.png")));
		btnTrocarIdioma.setBounds(20, 533, 166, 67);
		contentPane.add(btnTrocarIdioma);

		JLabel lblEntrar = new JLabel("Sair da Conta");
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar.setForeground(Color.WHITE);
		lblEntrar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 18));
		lblEntrar.setBounds(255, 545, 100, 26);
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
		btnEntrar.setBounds(214, 533, 173, 67);
		contentPane.add(btnEntrar);
		
		JButton btnRank = new JButton("");
		btnRank.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				
				desktopPane.add(panel);
				panel.show();
				
				InternTelaRank telaRank = new InternTelaRank();
				
				desktopPane.add(telaRank);
				
				telaRank.show();
			}
		});
		btnRank.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRank.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRank.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRank.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
		});
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setHorizontalAlignment(SwingConstants.CENTER);
		lblRank.setForeground(Color.WHITE);
		lblRank.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblRank.setBounds(80, 325, 89, 26);
		contentPane.add(lblRank);
		btnRank.setContentAreaFilled(false);
		btnRank.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
		btnRank.setBounds(0, 289, 254, 107);
		contentPane.add(btnRank);
		
		JButton btnResumos = new JButton("");
		btnResumos.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				desktopPane.add(panel);
				panel.show();
				
				InternTelaEscolha.tela = 2;
				InternTelaEscolha.inicio();
			}
		});
		btnResumos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnResumos.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnResumos.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnResumos.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
		});
		
		JLabel lblResumos = new JLabel("Resumos");
		lblResumos.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumos.setForeground(Color.WHITE);
		lblResumos.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblResumos.setBounds(80, 237, 89, 26);
		contentPane.add(lblResumos);
		btnResumos.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
		btnResumos.setContentAreaFilled(false);
		btnResumos.setBounds(0, 209, 254, 91);
		contentPane.add(btnResumos);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuiz.setForeground(Color.WHITE);
		lblQuiz.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblQuiz.setBounds(80, 145, 89, 26);
		contentPane.add(lblQuiz);
		
		JButton btnQuiz = new JButton("");
		btnQuiz.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.removeAll();
				desktopPane.add(panel);
				panel.show();
			
				InternTelaEscolha.tela = 1;
				InternTelaEscolha.inicio();
			}
		});
		btnQuiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnQuiz.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnQuiz.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnQuiz.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
			}
		});
		btnQuiz.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/rectangle.png")));
		btnQuiz.setContentAreaFilled(false);
		btnQuiz.setBounds(0, 116, 254, 91);
		contentPane.add(btnQuiz);
		
//		JComboBox<Object> comboBox = new JComboBox<Object>(EnumLivro.values());
//		comboBox.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(comboBox.getSelectedIndex() == 0) {
//					livro = 1;
//					if(comboBox.getSelectedIndex() == 1) {
//						livro = 2;
//						if(comboBox.getSelectedIndex() == 2) {
//							livro = 3;
//						}
//					}
//				}
//				System.out.println(comboBox.getSelectedIndex());
//			}
//		});
//		comboBox.setMaximumRowCount(4);
//		comboBox.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
//		comboBox.setToolTipText("Escolha seu livro");
//		comboBox.setBounds(10, 473, 234, 39);
//		contentPane.add(comboBox);
		
		JLabel lblLivros = new JLabel("Livros");
		lblLivros.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivros.setForeground(Color.DARK_GRAY);
		lblLivros.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 36));
		lblLivros.setBounds(76, 384, 93, 39);
		contentPane.add(lblLivros);
		
		rdbtnAutoDaCompadecida = new JRadioButton("Auto da Compadecida");
		rdbtnAutoDaCompadecida.setSelected(true);
		buttonGroup.add(rdbtnAutoDaCompadecida);
		rdbtnAutoDaCompadecida.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 16));
		rdbtnAutoDaCompadecida.setContentAreaFilled(false);
		rdbtnAutoDaCompadecida.setBounds(10, 430, 238, 26);
		contentPane.add(rdbtnAutoDaCompadecida);
		
		rdbtnMemoriasPostumasBras = new JRadioButton("Memorias Postumas Bras Cubas");
		buttonGroup.add(rdbtnMemoriasPostumasBras);
		rdbtnMemoriasPostumasBras.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 16));
		rdbtnMemoriasPostumasBras.setContentAreaFilled(false);
		rdbtnMemoriasPostumasBras.setBounds(10, 459, 238, 26);
		contentPane.add(rdbtnMemoriasPostumasBras);
		
		rdbtnOCortio = new JRadioButton("O Corti\u00E7o");
		buttonGroup.add(rdbtnOCortio);
		rdbtnOCortio.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 16));
		rdbtnOCortio.setContentAreaFilled(false);
		rdbtnOCortio.setBounds(10, 488, 238, 26);
		contentPane.add(rdbtnOCortio);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.setBounds(433, 550, 89, 23);
		contentPane.add(btnSobre);
		
		JLabel lblNewLabel_1 = new JLabel("Pontua\u00E7\u00E3o: ");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(587, 535, 128, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPontos = new JLabel("0");
		lblPontos.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 35));
		lblPontos.setBounds(683, 522, 53, 78);
		contentPane.add(lblPontos);
		
		DaoUsuario.getPontos(DaoUsuario.usuario.getUser());
		
		lblPontos.setText(DaoUsuario.usuario.getPontosTotal()+"");
		
		System.out.println(DaoUsuario.usuario.getPontosTotal());
		
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
