package com.view.intern;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.dao.DaoResumo;
import com.view.TelaPrincipal;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class InternTelaResumoCORT extends JInternalFrame {
	private static final long serialVersionUID = 1L;

	public JTextArea txtArea;

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
					InternTelaResumoCORT frame = new InternTelaResumoCORT();
					
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}

	public InternTelaResumoCORT() {
		
		setFrameIcon(new ImageIcon(InternTelaResumoCORT.class.getResource("/images/kamui.png.png")));
		setTitle("Resumo de O Cortiço");
		getContentPane().setBackground(new Color(225, 225, 225));
		setClosable(true);
		setBorder(null);//retirar bordas
		setBounds(100, 100, 836, 433);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 816, 385);
		getContentPane().add(scrollPane);
		
		
		txtArea = new JTextArea();
		txtArea.setEditable(false);
		scrollPane.setViewportView(txtArea);
		
		if(TelaPrincipal.numeroBandeira == 1) {
			getResumoBR(1);
		}else if(TelaPrincipal.numeroBandeira == 2) {
			getResumoUS(2);
		}else if(TelaPrincipal.numeroBandeira == 3) {
			getResumoES(3);
		}
	}

public void getResumoBR(int livro) {
		
		txtArea.setText(DaoResumo.resumoBR(livro));
		
	}
	
	private void getResumoUS(int livro) {
		
		txtArea.setText(DaoResumo.resumoUS(livro));
		
	}
	
	private void getResumoES(int livro) {
		
		txtArea.setText(DaoResumo.resumoES(livro));
		
	}
}
