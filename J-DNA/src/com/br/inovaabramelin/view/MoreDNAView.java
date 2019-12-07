package com.br.inovaabramelin.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class MoreDNAView extends JFrame {
	private static JScrollPane scrollPane = new JScrollPane();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						   UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
						} catch (Exception e) {
						    e.printStackTrace();
						}
					MoreDNAView frame = new MoreDNAView();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MoreDNAView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuView.class.getResource("/images/icone.png")));
		Font squareFont32 = new Font ("SquareFont", Font.PLAIN, 32);
		
		Font squareFont18 = new Font ("SquareFont", Font.ITALIC, 18);
		
		Font squareFont15 = new Font ("SquareFont", Font.PLAIN, 15);
		
		setTitle("J-DNA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblVoltar.setForeground(new Color(255,71,171));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblVoltar.setForeground(new Color(28,130,244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuView.main(null);
				dispose();
			}
		});
		lblVoltar.setBounds(19, 27, 151, 31);
		lblVoltar.setForeground(new Color(28,130,244));
		lblVoltar.setFont(squareFont32);
		contentPane.add(lblVoltar);
		
		JLabel lblMaisDoDna = new JLabel("Mais do DNA");
		lblMaisDoDna.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaisDoDna.setBounds(251, 42, 209, 41);
		lblMaisDoDna.setFont(squareFont18);
		lblMaisDoDna.setForeground(Color.WHITE);
		contentPane.add(lblMaisDoDna);
		
		
		scrollPane.setBounds(6, 86, 732, 381);
		contentPane.add(scrollPane);
				
		
		JTextArea txtrUmComposto = new JTextArea();
		txtrUmComposto.setWrapStyleWord(true);
		txtrUmComposto.setLineWrap(true);
		txtrUmComposto.setFont(squareFont15);
		txtrUmComposto.setText("\u00E9 um composto org\u00E2nico DNAcujas mol\u00E9culas cont\u00EAm as instru\u00E7\u00F5es gen\u00E9ticas que \r\ncoordenam o desenvolvimento e funcionamento de todos os seres vivos e de alguns v\u00EDrus.\r\n\r\nA Gen\u00E9tica \u00E9 a parte da Biologia que estuda a hereditariedade, ou seja, a forma como as \r\ncaracter\u00EDsticas s\u00E3o repassadas de gera\u00E7\u00E3o para gera\u00E7\u00E3o. \r\n\r\nDesde de tempos atr\u00E1s todos queriam saber como eram passadas as caracteristicas de um \r\nind\u00EDviduo para outro. As ideas inicias de estudiosos da \u00E9poca falavam que os filhos eram \r\nsemelhantes aos pais, mas eles n\u00E3o sabiam dizer, provar ou muito menos demostrar como \r\nisso ocorria.\r\n\r\nMas um Monge chamado de Gregor Mendel criou um metodo de estudo com ervilhas amarelas e verdes,ele foi cruzando elas atr\u00E1ves da polimeriza\u00E7\u00E3o e foi estuando afundo, com esse m\u00E9todo ele conseguiu entender como funcionava a gen\u00E9tica, por\u00E9m pelo fato de Gregor \r\nMendel ser um monge eles n\u00E3o ligaram para esses estudos,mas depois de muito tempo a \r\nfrente depois do monge morrer foi que eles provaram que o m\u00E9todo de Gregor Mendel \r\nestava correto.\r\n\r\nCom o avan\u00E7o da ci\u00EAncia gen\u00E9tica foi descobrindo mais e mais fatores, Mas quem deu o \r\nprimeiro passo para isso foi o Monge Gregor Mendel.");
		scrollPane.setViewportView(txtrUmComposto);
		
	}
}
