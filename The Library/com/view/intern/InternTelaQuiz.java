package com.view.intern;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;

import com.classes.Usuario;
import com.dao.DaoQuiz;
import com.view.TelaPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class InternTelaQuiz extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	Usuario usuario = new Usuario();
	
	public static JRadioButton rdbtA;
	public static JRadioButton rdbtB;
	public static JRadioButton rdbtC;
	public static JRadioButton rdbtD;
	
	static JTextArea textArea;
	public static DaoQuiz quiz;
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
					InternTelaQuiz frame = new InternTelaQuiz();
					
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InternTelaQuiz() {
		setFrameIcon(new ImageIcon(InternTelaQuiz.class.getResource("/images/kamui.png.png")));
		
		setClosable(true);
		getContentPane().setBackground(new Color(206, 14, 89));
		setTitle("Quiz");
		setBorder(null);//retirar bordas
		setBounds(100, 100, 836, 433);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 816, 385);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, Color.PINK));
		panel_1.setBounds(257, 261, 288, 111);
		panel_1.setBackground(new Color(206, 14, 89));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		rdbtA = new JRadioButton("A)");
		rdbtA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaoQuiz.retornarQuestao(DaoQuiz.pegarLinguaTabela(TelaPrincipal.numeroBandeira), DaoQuiz.pegarTitulo(titulo()), DaoQuiz.quiz.getPerguntaAtual());
				textArea.setText(DaoQuiz.quiz.getPergunta());
			}
		});
		buttonGroup.add(rdbtA);
		rdbtA.setForeground(Color.WHITE);
		rdbtA.setContentAreaFilled(false);
		rdbtA.setBounds(40, 5, 47, 31);
		rdbtA.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		panel_1.add(rdbtA);
		
		rdbtC = new JRadioButton("C)");
		rdbtC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaoQuiz.retornarQuestao(DaoQuiz.pegarLinguaTabela(TelaPrincipal.numeroBandeira), DaoQuiz.pegarTitulo(titulo()), DaoQuiz.quiz.getPerguntaAtual());
				textArea.setText(DaoQuiz.quiz.getPergunta());
			}
		});
		buttonGroup.add(rdbtC);
		rdbtC.setForeground(Color.WHITE);
		rdbtC.setContentAreaFilled(false);
		rdbtC.setBounds(40, 73, 49, 31);
		rdbtC.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		panel_1.add(rdbtC);
		
		rdbtD = new JRadioButton("D)");
		rdbtD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaoQuiz.retornarQuestao(DaoQuiz.pegarLinguaTabela(TelaPrincipal.numeroBandeira), DaoQuiz.pegarTitulo(titulo()), DaoQuiz.quiz.getPerguntaAtual());
				textArea.setText(DaoQuiz.quiz.getPergunta());
			}
		});
		buttonGroup.add(rdbtD);
		rdbtD.setForeground(Color.WHITE);
		rdbtD.setContentAreaFilled(false);
		rdbtD.setBounds(173, 73, 49, 31);
		rdbtD.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		panel_1.add(rdbtD);
		
		rdbtB = new JRadioButton("B)");
		rdbtB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaoQuiz.retornarQuestao(DaoQuiz.pegarLinguaTabela(TelaPrincipal.numeroBandeira), DaoQuiz.pegarTitulo(titulo()), DaoQuiz.quiz.getPerguntaAtual());
				textArea.setText(DaoQuiz.quiz.getPergunta());
			}
		});
		buttonGroup.add(rdbtB);
		rdbtB.setForeground(Color.WHITE);
		rdbtB.setContentAreaFilled(false);
		rdbtB.setBounds(173, 5, 47, 31);
		rdbtB.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 20));
		panel_1.add(rdbtB);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 25));
		textArea.setBounds(10, 11, 777, 226);
		panel.add(textArea);
		
		quiz = new DaoQuiz(); 
		
		DaoQuiz.retornarQuestao(DaoQuiz.pegarLinguaTabela(TelaPrincipal.numeroBandeira), DaoQuiz.pegarTitulo(titulo()), DaoQuiz.quiz.getPerguntaAtual());
		textArea.setText(DaoQuiz.quiz.getPergunta());

	}
	
	public static void mudarPergunta(String pergunta) {
		textArea.setText(pergunta);
		System.out.println(DaoQuiz.quiz.getPerguntaAtual());
	}
	
	public static int titulo() {
		
		if(TelaPrincipal.rdbtnAutoDaCompadecida.isSelected()) {
			return 1;
		}else if(TelaPrincipal.rdbtnMemoriasPostumasBras.isSelected()) {
			return 2;
		}else if(TelaPrincipal.rdbtnOCortio.isSelected()) {
			return 3;
		}
		
		return 0;
	}
}
