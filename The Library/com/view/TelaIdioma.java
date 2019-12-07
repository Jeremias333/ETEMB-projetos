package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.dao.DaoUsuario;
import com.utils.FundoBg;
import com.utils.VariaveisAuxiliares;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class TelaIdioma extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static Point point = new Point();
	FundoBg contentPane = new FundoBg("C:\\\\Users\\\\Sagitta Draco\\\\eclipse-workspace\\\\The Library\\\\src\\images\\screen.png");// trocar por pasta com background;
	
//	FundoBg contentPane = new FundoBg(".\\images\\screen.png");// trocar por pasta com background;
	
	VariaveisAuxiliares aux = new VariaveisAuxiliares();
	

	
	public static void main(String[] args) {
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
					
					TelaIdioma frame = new TelaIdioma();
					frame.setTitle("The Library - Idioma");
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
				    DaoUsuario.conectarBanco();
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaIdioma() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIdioma.class.getResource("/images/kamui.png.png")));
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEkis = new JButton("");
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
		btnEkis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEkis.setContentAreaFilled(false);
		btnEkis.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/X.png")));
		btnEkis.setBounds(737, 0, 53, 67);
		contentPane.add(btnEkis);
		
		JButton btnPortugues = new JButton("");
		btnPortugues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin.numeroBandeira = 1;
				TelaLogin.inicio();
				
				dispose();
				/*
				 *Aqui terá um indicador da lingua escolhida e 
				 *chamará a próxima tela. 
				 * 
				 */
			}
		});
		btnPortugues.setBorder(null);
		btnPortugues.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPortugues.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/portuguese_selected.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPortugues.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/portuguese.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnPortugues.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/portuguese.png")));//troca essa imagem por uma de click ===============
				
			}
		});
		btnPortugues.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/portuguese.png")));
		btnPortugues.setContentAreaFilled(false);
		btnPortugues.setBounds(10, 277, 238, 93);
		contentPane.add(btnPortugues);
		
		JButton btnIngles = new JButton("");
		btnIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin.numeroBandeira = 2;
				TelaLogin.inicio();
				
				dispose();
				/*
				 *Aqui terá um indicador da lingua escolhida e 
				 *chamará a próxima tela.
				 * 
				 */
			}
		});
		btnIngles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIngles.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/english_selected.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIngles.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/english.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnIngles.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/english.png")));//troca essa imagem por uma de click ===============
			}
		});
		btnIngles.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/english.png")));
		btnIngles.setContentAreaFilled(false);
		btnIngles.setBounds(286, 277, 238, 93);
		contentPane.add(btnIngles);
		
		JButton btnEspanhol = new JButton("");
		btnEspanhol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin.numeroBandeira = 3;
				TelaLogin.inicio();
				
				dispose();
				/*
				 *Aqui terá um indicador da lingua escolhida e 
				 *chamará a próxima tela. 
				 * 
				 */
			}
		});
		btnEspanhol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEspanhol.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/spanish_selected.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEspanhol.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/spanish.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEspanhol.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/spanish.png")));//troca essa imagem por uma de click ===============
			}
		});
		btnEspanhol.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/spanish.png")));
		btnEspanhol.setContentAreaFilled(false);
		btnEspanhol.setBounds(542, 277, 238, 93);
		contentPane.add(btnEspanhol);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/br_normal.png")));
		label.setBounds(63, 361, 136, 81);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/us_normal.png")));
		label_1.setBounds(330, 361, 136, 81);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/mx_normal.png")));
		label_2.setBounds(607, 361, 136, 81);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(TelaIdioma.class.getResource("/images/selecione_um_dos_idiomas.png")));
		label_3.setBounds(43, 150, 712, 67);
		contentPane.add(label_3);
		
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
}
