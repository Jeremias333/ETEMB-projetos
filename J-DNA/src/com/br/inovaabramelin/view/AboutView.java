package com.br.inovaabramelin.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class AboutView extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;

	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						   UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
						} catch (Exception e) {
						    e.printStackTrace();
						}
					AboutView frame = new AboutView();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AboutView() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
			}
			public void windowLostFocus(WindowEvent arg0) {
				MenuView.cont = 0;
				dispose();
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				MenuView.cont = 0;
			}
		});
		MenuView.cont = 1;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuView.class.getResource("/images/icone.png")));
		Font squareFont32 = new Font ("SquareFont", Font.PLAIN, 32);
		
		Font squareFont18 = new Font ("SquareFont", Font.ITALIC, 18);
		
		Font squareFont15 = new Font ("SquareFont", Font.PLAIN, 15);
		
		Font squareFont12 = new Font ("SquareFont", Font.PLAIN, 12);
		
		setTitle("J-DNA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 571, 359);
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
				MenuView.cont = 0;
				dispose();
			}
		});
		lblVoltar.setBounds(6, 6, 79, 41);
		lblVoltar.setFont(squareFont15);
		lblVoltar.setForeground(new Color(28,130,244));
		contentPane.add(lblVoltar);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobre.setBounds(219, 17, 130, 41);
		lblSobre.setFont(squareFont18);
		lblSobre.setForeground(Color.WHITE);
		contentPane.add(lblSobre);
		
		JLabel lblInovaAbramelin = new JLabel("Inova Abramelin");
		lblInovaAbramelin.setToolTipText("Clique e acesse o site");
		lblInovaAbramelin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInovaAbramelin.setForeground(new Color(217,80,48));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInovaAbramelin.setForeground(new Color(28,130,244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
			        java.awt.Desktop.getDesktop().browse(new java.net.URI("https://inovaabramelin.000webhostapp.com"));
			    } catch (Exception ex) {
			        ex.printStackTrace();
			    }
			}
		});
		lblInovaAbramelin.setBounds(312, 286, 251, 41);
		lblInovaAbramelin.setForeground(new Color(28,130,244));
		lblInovaAbramelin.setFont(squareFont32);
		contentPane.add(lblInovaAbramelin);
		
		JLabel lblMoreInfo = new JLabel("Para mais informa\u00E7\u00F5es acesse o site:");
		lblMoreInfo.setForeground(Color.WHITE);
		lblMoreInfo.setFont(squareFont12);
		lblMoreInfo.setBounds(83, 286, 223, 41);
		contentPane.add(lblMoreInfo);
		
		JLabel lblContatosPorEmail = new JLabel("Contatos por E-mail: inovaabramelin@gmail.com");
		lblContatosPorEmail.setForeground(Color.WHITE);
		lblContatosPorEmail.setFont(new Font("SquareFont", Font.PLAIN, 12));
		lblContatosPorEmail.setBounds(30, 71, 300, 41);
		contentPane.add(lblContatosPorEmail);
		
		JLabel lblJeremiasS = new JLabel(" Jeremias S. - jeremiasprogrammer@gmail.com - Developer");
		lblJeremiasS.setForeground(new Color(255,71,171));
		lblJeremiasS.setFont(new Font("SquareFont", Font.PLAIN, 12));
		lblJeremiasS.setBounds(15, 139, 344, 31);
		contentPane.add(lblJeremiasS);
		
		JLabel lblThulioA = new JLabel("    Thulio A. - alvezthulio@gmail.com - Designer");
		lblThulioA.setForeground(new Color(255,71,171));
		lblThulioA.setFont(new Font("SquareFont", Font.PLAIN, 12));
		lblThulioA.setBounds(6, 192, 343, 35);
		contentPane.add(lblThulioA);
		
		JLabel lblAndrewM = new JLabel(" Andrew M. - andrewmnascimento@aluno.educacao.pe.gov.br - Writer");
		lblAndrewM.setForeground(new Color(255,71,171));
		lblAndrewM.setFont(new Font("SquareFont", Font.PLAIN, 12));
		lblAndrewM.setBounds(16, 111, 443, 35);
		contentPane.add(lblAndrewM);
		
		JLabel lblRaulM = new JLabel("    Raul M.- raulmsales@aluno.educacao.pe.gov.br - Searcher");
		lblRaulM.setForeground(new Color(255,71,171));
		lblRaulM.setFont(new Font("SquareFont", Font.PLAIN, 12));
		lblRaulM.setBounds(6, 165, 453, 31);
		contentPane.add(lblRaulM);
		
		
	}
}
