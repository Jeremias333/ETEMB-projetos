package com.view.intern;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.view.TelaPrincipal;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InternTelaEscolha extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	public static int tela;
	
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
					InternTelaEscolha frame = new InternTelaEscolha();
					TelaPrincipal.desktopPane.add(frame);
					
					frame.show();
					frame.setResizable(false);
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InternTelaEscolha() {
		setFrameIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/kamui.png.png")));
		if(tela == 1) {//quiz
			setTitle("Menu de Escolha - Quiz");
		}else if(tela == 2) {//resumos
			setTitle("Menu de Escolha - Resumos");
		}
		
		
		getContentPane().setBackground(new Color(225, 225, 225));
		setClosable(true);
		setBorder(null);//retirar bordas
		setBounds(100, 100, 836, 433);
		getContentPane().setLayout(null);
		
		JLabel lblAdicionar = new JLabel("Adicionar");
		lblAdicionar.setForeground(Color.WHITE);
		lblAdicionar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 26));
		lblAdicionar.setBounds(391, 134, 101, 49);
		getContentPane().add(lblAdicionar);
		
		JLabel lblExcluir = new JLabel("Excluir");
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 26));
		lblExcluir.setBounds(402, 326, 101, 49);
		getContentPane().add(lblExcluir);
		
		JLabel lblIniciar = new JLabel("Iniciar");
		lblIniciar.setForeground(Color.WHITE);
		lblIniciar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 26));
		lblIniciar.setBounds(402, 35, 101, 49);
		getContentPane().add(lblIniciar);
		
		JLabel lblEditar = new JLabel("Editar");
		lblEditar.setForeground(Color.WHITE);
		lblEditar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 26));
		lblEditar.setBounds(402, 230, 101, 49);
		getContentPane().add(lblEditar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExcluir.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExcluir.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
				
			}
		});
		btnExcluir.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
		btnExcluir.setContentAreaFilled(false);
		btnExcluir.setBounds(314, 315, 243, 81);
		getContentPane().add(btnExcluir);
		
		JButton btnEditar = new JButton("");
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEditar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEditar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
			}
		});
		btnEditar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
		btnEditar.setContentAreaFilled(false);
		btnEditar.setBounds(314, 215, 243, 89);
		getContentPane().add(btnEditar);
			
		
		
		JButton btnIniciar = new JButton("");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tela == 1) {
					InternTelaQuiz quiz = new InternTelaQuiz();
					
					TelaPrincipal.desktopPane.add(quiz);
					
					quiz.show();
				}else if(tela == 2) {
					
					if(TelaPrincipal.rdbtnAutoDaCompadecida.isSelected()) {
						
						InternTelaResumoADC tela = new InternTelaResumoADC();
						
						TelaPrincipal.desktopPane.add(tela);
						
						tela.show();
						
					}else if(TelaPrincipal.rdbtnMemoriasPostumasBras.isSelected()) {
						
						InternTelaResumoBRAS tela = new InternTelaResumoBRAS();
						
						TelaPrincipal.desktopPane.add(tela);
						
						tela.show();
					
					}else if(TelaPrincipal.rdbtnOCortio.isSelected()) {
					
						InternTelaResumoCORT tela = new InternTelaResumoCORT();
						
						TelaPrincipal.desktopPane.add(tela);
						
						tela.show();
					}
				}
			}
		});
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIniciar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIniciar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
			}
		});
		btnIniciar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
		btnIniciar.setContentAreaFilled(false);
		btnIniciar.setBounds(314, 24, 243, 81);
		getContentPane().add(btnIniciar);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAdicionar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle_hover.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdicionar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
			}
		});
		btnAdicionar.setIcon(new ImageIcon(InternTelaEscolha.class.getResource("/images/rectangle.png")));
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setBounds(314, 123, 243, 81);
		getContentPane().add(btnAdicionar);
		
	}

	
}
