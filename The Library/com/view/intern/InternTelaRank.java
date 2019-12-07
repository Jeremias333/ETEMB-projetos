package com.view.intern;

import com.dao.DaoRank;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class InternTelaRank extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	DaoRank rank = new DaoRank();
	
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
					InternTelaRank frame = new InternTelaRank();
					frame.setBorder(null);//retirar bordas
					frame.setTitle("Rank de pontos");
					
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InternTelaRank() {
		setFrameIcon(new ImageIcon(InternTelaRank.class.getResource("/images/kamui.png.png")));
		setClosable(true);
		getContentPane().setBackground(new Color(206, 14, 89));
		setTitle("Rank");
		setBorder(null);//retirar bordas
		setBounds(100, 100, 836, 433);
		getContentPane().setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(InternTelaRank.class.getResource("/images/firework_blue.gif")));
		label_3.setBounds(24, 244, 236, 138);
		getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(InternTelaRank.class.getResource("/images/firework_red.gif")));
		label_1.setBounds(249, -20, 236, 138);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(InternTelaRank.class.getResource("/images/firework_purple.gif")));
		label_2.setBounds(561, 244, 236, 138);
		getContentPane().add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 22));
		scrollPane.setSize(816, 180);
		scrollPane.setBackground(new Color(206, 14, 89));
		scrollPane.setForeground(new Color(206, 14, 89));
		scrollPane.setLocation(new Point(10, 70));
		getContentPane().add(scrollPane);
		table = new JTable();
		table.setRowHeight(30);
		table.setSelectionForeground(new Color(206, 14, 89));
		table.setFont(new Font("Microsoft Yi Baiti", Font.BOLD | Font.ITALIC, 19));
		
		popularTabelaBD();
		
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null},
//			},
//			new String[] {
//				"Pontua\u00E7\u00E3o", "Nome", "Lugar"
//			}
//		));
		
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("The Library");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 82));
		label.setBounds(24, -34, 812, 117);
		getContentPane().add(label);
		
		JLabel lblPrimeiroLugar = new JLabel(rank.rank1.getNome());
		lblPrimeiroLugar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimeiroLugar.setForeground(new Color(192, 192, 192));
		lblPrimeiroLugar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 50));
		lblPrimeiroLugar.setBounds(264, 236, 329, 85);
		getContentPane().add(lblPrimeiroLugar);
		
		JLabel lblSegundoLugar = new JLabel(rank.rank2.getNome());
		lblSegundoLugar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSegundoLugar.setForeground(Color.LIGHT_GRAY);
		lblSegundoLugar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 50));
		lblSegundoLugar.setBounds(110, 274, 236, 78);
		getContentPane().add(lblSegundoLugar);
		
		JLabel lblTerceiroLugar = new JLabel(rank.rank3.getNome());
		lblTerceiroLugar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTerceiroLugar.setForeground(Color.LIGHT_GRAY);
		lblTerceiroLugar.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 50));
		lblTerceiroLugar.setBounds(499, 271, 236, 85);
		getContentPane().add(lblTerceiroLugar);
		
		JLabel lblPlacar = new JLabel("");
		lblPlacar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPlacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacar.setIcon(new ImageIcon(InternTelaRank.class.getResource("/images/placar.png")));
		lblPlacar.setBounds(194, 271, 460, 136);
		getContentPane().add(lblPlacar);

	}
	
	public void popularTabelaBD() {
		
//		System.out.println(""+rank.rank1.getLugar()+ rank.rank1.getNome()+rank.rank1.getPontuacao()
//		+""+rank.rank2.getLugar()+ rank.rank2.getNome()+rank.rank2.getPontuacao()
//		+""+rank.rank3.getLugar()+ rank.rank3.getNome() +rank.rank3.getPontuacao()
//		+""+rank.rank4.getLugar()+ rank.rank4.getNome() +rank.rank4.getPontuacao()
//		+""+rank.rank5.getLugar()+ rank.rank5.getNome() +rank.rank5.getPontuacao());
		
//		{""+rank.rank1.getLugar()+"º", rank.rank1.getNome(), rank.rank1.getPontuacao()},
//		{""+rank.rank2.getLugar()+"º", rank.rank2.getNome(), rank.rank2.getPontuacao()},
//		{""+rank.rank3.getLugar()+"º", rank.rank3.getNome(), rank.rank3.getPontuacao()},
//		{""+rank.rank4.getLugar()+"º", rank.rank4.getNome(), rank.rank4.getPontuacao()},
//		{""+rank.rank5.getLugar()+"º", rank.rank5.getNome(), rank.rank5.getPontuacao()},
		
		try {
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{""+rank.rank1.getLugar()+"º", rank.rank1.getNome(), rank.rank1.getPontuacao()},
					{""+rank.rank2.getLugar()+"º", rank.rank2.getNome(), rank.rank2.getPontuacao()},
					{""+rank.rank3.getLugar()+"º", rank.rank3.getNome(), rank.rank3.getPontuacao()},
					{""+rank.rank4.getLugar()+"º", rank.rank4.getNome(), rank.rank4.getPontuacao()},
					{""+rank.rank5.getLugar()+"º", rank.rank5.getNome(), rank.rank5.getPontuacao()},
				},
				new String[] {
					"Lugar", "Usu\u00E1rio", "Pontua\u00E7\u00E3o"
				}
			));
			
			table.setRowSorter(new TableRowSorter<>(table.getModel()));
			table.getColumnModel().getColumn(0).setResizable(false);
			table.getColumnModel().getColumn(0).setPreferredWidth(51);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(1).setPreferredWidth(141);
			table.getColumnModel().getColumn(2).setPreferredWidth(111);
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
	
	

}
