package com.view.popup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class PopUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
					
					PopUp frame = new PopUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PopUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
