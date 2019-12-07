package com.br.inovaabramelin.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Toolkit;

public class MenuView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static int cont;
	AboutView frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						   UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
						} catch (Exception e) {
						    e.printStackTrace();
						}
					MenuView frame = new MenuView();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuView.class.getResource("/images/icone.png")));
		Font squareFont32 = new Font ("SquareFont", Font.PLAIN, 32);
		
		Font squareFont18 = new Font ("SquareFont", Font.ITALIC, 18);
		
		Font squareFont12 = new Font ("SquareFont", Font.PLAIN, 12);
		
		setTitle("J-DNA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnl_imgDNAGif = new JPanel();
		pnl_imgDNAGif.setBackground(Color.PINK);
		pnl_imgDNAGif.setBounds(431, 56, 280, 280);
		contentPane.add(pnl_imgDNAGif);
		
		//Rosa 255,71,171
		//Azul 28,130,244
		
		JLabel btnODNA = new JLabel("O DNA...");
		btnODNA.setForeground(new Color(28,130,244));
		btnODNA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnODNA.setForeground(new Color(255,71,171));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnODNA.setForeground(new Color(28,130,244));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				DNAView.start();
				dispose();
			}
		});
		btnODNA.setHorizontalAlignment(SwingConstants.CENTER);
		btnODNA.setFont(squareFont32);
		btnODNA.setBounds(104, 159, 214, 47);
		contentPane.add(btnODNA);
		
		JLabel btnHistGen = new JLabel("Mais do DNA");
		btnHistGen.setForeground(new Color(28,130,244));
		btnHistGen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHistGen.setForeground(new Color(255,71,171));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHistGen.setForeground(new Color(28,130,244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MoreDNAView.start();
				dispose();
			}
		});
		btnHistGen.setHorizontalAlignment(SwingConstants.CENTER);
		btnHistGen.setFont(squareFont32);
		btnHistGen.setBounds(30, 234, 378, 47);
		contentPane.add(btnHistGen);
		
		JLabel btnAbout = new JLabel("SOBRE");
		btnAbout.setForeground(new Color(28,130,244));
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAbout.setForeground(new Color(255,71,171));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAbout.setForeground(new Color(28,130,244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(cont == 0) {
					cont++;
					AboutView.start();
				}if(cont == 1) {
					frame = new AboutView();
					frame.setExtendedState(MAXIMIZED_BOTH);
				}
			}
		});
		btnAbout.setHorizontalAlignment(SwingConstants.CENTER);
		btnAbout.setFont(squareFont32);
		btnAbout.setBounds(111, 301, 214, 47);
		contentPane.add(btnAbout);
		
		JLabel lblInfo = new JLabel("\"O DNA(\u00E1cido desoxirribonucl\u00E9ico) \u00E9 explorado mais afundo neste sistema.\r\n\"");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setVerticalAlignment(SwingConstants.TOP);
		lblInfo.setAlignmentY(Component.TOP_ALIGNMENT);
		lblInfo.setBounds(66, 392, 627, 18);
		lblInfo.setFont(squareFont18);
		lblInfo.setForeground(Color.WHITE);
		contentPane.add(lblInfo);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(MenuView.class.getResource("/images/JDNA.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(66, 20, 300, 127);
		contentPane.add(lblLogo);
		
		JLabel lblVersion = new JLabel("v1.0");
		lblVersion.setBounds(682, 450, 56, 18);
		lblVersion.setForeground(new Color(255,71,171));
		lblVersion.setFont(squareFont12);
		contentPane.add(lblVersion);
	}
}
