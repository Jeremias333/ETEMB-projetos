package com.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

import com.classes.Veiculo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class TelaInicial {

	
	public static JDesktopPane desktopPane;
	private JFrame frame;
	Veiculo vel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaInicial() {
		try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
		
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 471);
		frame.setTitle("Fasttery Wish");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.inactiveCaption, 4, true));
		panel_1.setBackground(SystemColor.activeCaption);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblBemVindoAo = new JLabel("Bem Vindo ao Fasttery Wish - Online");
		lblBemVindoAo.setForeground(Color.DARK_GRAY);
		lblBemVindoAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoAo.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(102)
							.addComponent(lblBemVindoAo, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBemVindoAo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
					.addContainerGap())
		);
		desktopPane.setLayout(null);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usu\u00E1rio");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.removeAll();
				PainelCadastro cadastro = new PainelCadastro();
				desktopPane.add(cadastro);
			}
		});
		mnNewMenu.add(mntmCadastrar);
		
		JMenuItem mntmAcessar = new JMenuItem("Acessar");
		mntmAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.removeAll();
				PainelLogin login = new PainelLogin();
				desktopPane.add(login);
			}
		});
		mnNewMenu.add(mntmAcessar);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		menuBar.add(mnAdministrador);
		
		JMenuItem mntmAcessarAdm = new JMenuItem("Acessar");
		mnAdministrador.add(mntmAcessarAdm);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		
		JMenuItem mntmComoUsar = new JMenuItem("Como usar");
		mnAjuda.add(mntmComoUsar);
		
		JMenuItem mntmEquipe = new JMenuItem("Equipe");
		mnAjuda.add(mntmEquipe);
		
		PainelLogin painel = new PainelLogin();
		
		desktopPane.add(painel);
		
	}
	
	public static void chamarCadastro() {
		desktopPane.removeAll();
		PainelCadastro painel = new PainelCadastro();
		desktopPane.add(painel);
	}
	
	public static void chamarLoginCliente() {
		desktopPane.removeAll();
		PainelLogin painel = new PainelLogin();
		desktopPane.add(painel);
	}
	
	public static void chamarProduto() {
		desktopPane.removeAll();
		PainelProduto painel = new PainelProduto();
		desktopPane.add(painel);
	}
	
	public static void chamarPainelPrincipal() {
		desktopPane.removeAll();
		PainelPrincipal painel = new PainelPrincipal();
		desktopPane.add(painel);
	}
	
	public static void chamarPainelPerfil() {
		desktopPane.removeAll();
		PainelPerfil painel = new PainelPerfil();
		desktopPane.add(painel);
	}
}
