package com.br.inovaabramelin.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;

import com.br.inovaabramelin.util.Resumos;

import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

public class DNAView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JToggleButton tglbtnCadeiaDeFosfato;
	private JToggleButton tglbtnGuanina;
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DNAView frame = new DNAView();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DNAView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuView.class.getResource("/images/icone.png")));
		//Font squareFont32 = new Font ("SquareFont", Font.PLAIN, 32);
		
		//Font squareFont18 = new Font ("SquareFont", Font.ITALIC, 18);
		
		//Font squareFont12 = new Font ("SquareFont", Font.PLAIN, 12);
		
		setTitle("J-DNA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
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
		lblVoltar.setForeground(new Color(28, 130, 244));
		lblVoltar.setFont(new Font("SquareFont", Font.PLAIN, 32));
		lblVoltar.setBounds(23, 18, 151, 31);
		contentPane.add(lblVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 310, 381, 208);
		contentPane.add(scrollPane);
		
		JTextArea txtrTexto = new JTextArea();
		txtrTexto.setWrapStyleWord(true);
		txtrTexto.setLineWrap(true);
		txtrTexto.setTabSize(1);
		txtrTexto.setFont(new Font("SquareFont", Font.PLAIN, 16));
		txtrTexto.setText("Clique nas partes da estrutura do DNA para poder ler sobre eles");
		scrollPane.setViewportView(txtrTexto);
		
		JLabel lblResumo = new JLabel("Resumo");
		lblResumo.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumo.setForeground(Color.WHITE);
		lblResumo.setFont(new Font("SquareFont", Font.PLAIN, 32));
		lblResumo.setBounds(238, 480, 157, 38);
		contentPane.add(lblResumo);
		
		JToggleButton tglbtnAdenina = new JToggleButton("Adenina");
		tglbtnAdenina.setIcon(new ImageIcon(DNAView.class.getResource("/images/adenina.png")));
		tglbtnAdenina.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(tglbtnAdenina.isSelected()) {
					lblResumo.setText(Resumos.tituloAdenina);
					txtrTexto.setText(Resumos.adenina);
				}else {
					lblResumo.setText(Resumos.titulo_deafult);
					txtrTexto.setText(Resumos._deafult);
				}
			}
		});
		tglbtnAdenina.setBounds(23, 85, 180, 91);
		contentPane.add(tglbtnAdenina);
		
		JToggleButton tglbtnTimina = new JToggleButton("Timina");
		tglbtnTimina.setIcon(new ImageIcon(DNAView.class.getResource("/images/timina.png")));
		tglbtnTimina.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(tglbtnTimina.isSelected()) {
					lblResumo.setText(Resumos.tituloTimina);
					txtrTexto.setText(Resumos.timina);
				}else {
					lblResumo.setText(Resumos.titulo_deafult);
					txtrTexto.setText(Resumos._deafult);
				}
			}
		});
		tglbtnTimina.setBounds(225, 69, 197, 116);
		contentPane.add(tglbtnTimina);
		
		JToggleButton tglbtnCitomina = new JToggleButton("Citosina");
		tglbtnCitomina.setContentAreaFilled(false);
		tglbtnCitomina.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnCitomina.setIcon(new ImageIcon(DNAView.class.getResource("/images/citosina.png")));
		tglbtnCitomina.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(tglbtnCitomina.isSelected()) {
					lblResumo.setText(Resumos.tituloCitosina);
					txtrTexto.setText(Resumos.citosina);
				}else {
					lblResumo.setText(Resumos.titulo_deafult);
					txtrTexto.setText(Resumos._deafult);
				}
			}
		});
		tglbtnCitomina.setBounds(6, 204, 197, 91);
		contentPane.add(tglbtnCitomina);
		
		tglbtnGuanina = new JToggleButton("Guanina");
		tglbtnGuanina.setIcon(new ImageIcon(DNAView.class.getResource("/images/guanina.png")));
		tglbtnGuanina.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(tglbtnGuanina.isSelected()) {
					lblResumo.setText(Resumos.tituloGuanina);
					txtrTexto.setText(Resumos.guanina);
				}else {
					lblResumo.setText(Resumos.titulo_deafult);
					txtrTexto.setText(Resumos._deafult);
				}
			}
		});
		tglbtnGuanina.setBounds(238, 197, 184, 91);
		contentPane.add(tglbtnGuanina);
		
		tglbtnCadeiaDeFosfato = new JToggleButton("Cadeia de Fosfato");
		tglbtnCadeiaDeFosfato.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(tglbtnCadeiaDeFosfato.isSelected()) {
					lblResumo.setText(Resumos.tituloChainOfFosfate);
					txtrTexto.setText(Resumos.chainOfFostate);
				}else {
					lblResumo.setText(Resumos.titulo_deafult);
					txtrTexto.setText(Resumos._deafult);
				}
			}
		});
		tglbtnCadeiaDeFosfato.setBounds(122, 316, 120, 100);
		contentPane.add(tglbtnCadeiaDeFosfato);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DNAView.class.getResource("/images/char.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(445, -21, 283, 362);
		contentPane.add(label);
	
	}
}
