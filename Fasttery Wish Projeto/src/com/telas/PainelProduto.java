package com.telas;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.text.ParseException;

import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import com.bancodedados.DaoLavagem;
import com.bancodedados.DaoUsuario;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PainelProduto extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	JLabel lblUsuario;
	
	
	private JComboBox<String> cbMarca;
	private JComboBox<String> cbTipoLavagem;
	private JFormattedTextField frmtdtxtfldData;
	private JFormattedTextField frmtdtxtfldHora;
	private JLabel lblPrecofinal;
	private JButton btnMarcarLavagem;
	private JTextArea textArea;
	private JRadioButton rdbtnMoto;
	private JRadioButton rdbtnCarro;
	
	public PainelProduto() {
		setBounds(new Rectangle(0, 0, 733, 309));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				verificarCampos();
			}
		});
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel lblInformaesSobreLavagem = new JLabel("Informa\u00E7\u00F5es sobre lavagem que deseja");
		lblInformaesSobreLavagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaesSobreLavagem.setForeground(Color.DARK_GRAY);
		lblInformaesSobreLavagem.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblInformaesSobreLavagem.setBounds(111, 11, 513, 44);
		panel.add(lblInformaesSobreLavagem);
		
		rdbtnCarro = new JRadioButton("Carro");
		rdbtnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Fiat", "Volkswagen", "Ford", "Toyota", "Sedã"}));
			}
		});
		buttonGroup.add(rdbtnCarro);
		rdbtnCarro.setBounds(103, 101, 61, 23);
		panel.add(rdbtnCarro);

		
		rdbtnMoto = new JRadioButton("Moto");
		rdbtnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Shineray", "Suzuki", "Dafra", "Yamaha", "Honda"}));
			}
		});
		buttonGroup.add(rdbtnMoto);
		rdbtnMoto.setBounds(166, 101, 61, 23);
		panel.add(rdbtnMoto);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCliente.setBounds(55, 66, 46, 23);
		panel.add(lblCliente);
		
		lblUsuario = new JLabel("");
		lblUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUsuario.setBounds(103, 60, 479, 34);
		panel.add(lblUsuario);
		
		JLabel lblVeiculo = new JLabel("Veiculo:");
		lblVeiculo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblVeiculo.setBounds(55, 101, 46, 23);
		panel.add(lblVeiculo);
		
		JLabel lblTipoDeLavagem = new JLabel("Tipo de Lavagem:");
		lblTipoDeLavagem.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTipoDeLavagem.setBounds(0, 135, 101, 28);
		panel.add(lblTipoDeLavagem);
		
		cbTipoLavagem = new JComboBox<>();
		cbTipoLavagem.setModel(new DefaultComboBoxModel<String>(new String[] {"Simples", "Completa"}));
		cbTipoLavagem.setBounds(103, 140, 127, 24);
		panel.add(cbTipoLavagem);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMarca.setBounds(55, 175, 46, 23);
		panel.add(lblMarca);
		
		cbMarca = new JComboBox<>();
		cbMarca.setBounds(103, 175, 127, 24);
		panel.add(cbMarca);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblObservaes.setBounds(10, 209, 91, 23);
		panel.add(lblObservaes);
		
		textArea = new JTextArea();
		textArea.setBounds(103, 209, 352, 87);
		panel.add(textArea);
		
		btnMarcarLavagem = new JButton("Marcar Lavagem");
		btnMarcarLavagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*(String nick, String veiculo, String tipoLavagem, String marca,
									String dia, String hora, String observacao, float preco) {*/
				DaoLavagem.adicionarLavagem(PainelLogin.persistirNome, verificarBotao(), cbTipoLavagem.getSelectedItem().toString(), 
											cbMarca.getSelectedItem().toString(), frmtdtxtfldData.getText(), frmtdtxtfldHora.getText(), textArea.getText(),
											Float.parseFloat(lblPrecofinal.getText()));
			}
		});
		btnMarcarLavagem.setEnabled(false);
		btnMarcarLavagem.setBounds(598, 273, 123, 23);
		panel.add(btnMarcarLavagem);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.TRAILING);
		lblData.setBounds(257, 101, 101, 28);
		panel.add(lblData);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHora.setBounds(257, 155, 101, 28);
		panel.add(lblHora);
		
		frmtdtxtfldData = new JFormattedTextField();
		frmtdtxtfldData.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				frmtdtxtfldData.selectAll();
			}
		});
		
		frmtdtxtfldData.setBounds(359, 105, 101, 22);
		panel.add(frmtdtxtfldData);
		
		frmtdtxtfldHora = new JFormattedTextField();
		frmtdtxtfldHora.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				frmtdtxtfldHora.selectAll();
			}
		});
		
		frmtdtxtfldHora.setBounds(359, 159, 101, 22);
		panel.add(frmtdtxtfldHora);
		
		try {
			MaskFormatter mskData = new MaskFormatter("##/##/####");
			MaskFormatter mskHora = new MaskFormatter("##:##");
			mskData.install(frmtdtxtfldData);
			mskHora.install(frmtdtxtfldHora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		frmtdtxtfldHora.setText("00:00");
		frmtdtxtfldData.setText("00/00/0000");
		
		JLabel lblPreoFinal = new JLabel("Pre\u00E7o Final:");
		lblPreoFinal.setBounds(467, 276, 56, 19);
		panel.add(lblPreoFinal);
		
		lblPrecofinal = new JLabel("00.00");
		lblPrecofinal.setForeground(Color.RED);
		lblPrecofinal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrecofinal.setBounds(527, 270, 63, 26);
		panel.add(lblPrecofinal);
		
		JLabel lblR = new JLabel("R$");
		lblR.setBounds(577, 275, 19, 19);
		panel.add(lblR);
		
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 19));
		label.setBounds(51, 101, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel(" *");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_1.setBounds(0, 129, 68, 34);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_2.setBounds(55, 175, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_3.setBounds(312, 105, 61, 24);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_4.setBounds(312, 162, 46, 14);
		panel.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(493, 113, 228, 149);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblavisos = new JLabel("---------------------AVISOS-------------------");
		lblavisos.setHorizontalAlignment(SwingConstants.CENTER);
		lblavisos.setForeground(Color.RED);
		lblavisos.setBounds(10, 11, 208, 14);
		panel_1.add(lblavisos);
		
		JTextPane txtAvisos = new JTextPane();
		txtAvisos.setEditable(false);
		txtAvisos.setBorder(new LineBorder(Color.RED, 2));
		txtAvisos.setBounds(10, 26, 208, 112);
		panel_1.add(txtAvisos);
		
		aplicarNome();
	}
	public void verificarCampos() {
		
		if(!frmtdtxtfldData.getText().equals("00/00/0000") || !frmtdtxtfldData.getText().isEmpty()) {
			if(!frmtdtxtfldHora.getText().equals("00:00") || !frmtdtxtfldHora.getText().isEmpty()) {
				if(rdbtnMoto.isSelected() || rdbtnCarro.isSelected()) {
					if(cbMarca.getItemCount() != 0) {
						btnMarcarLavagem.setEnabled(true);
					}
				}
			}
		}
		
	}
	
	public void aplicarNome() {
		lblUsuario.setText(DaoUsuario.getNomeCompleto(PainelLogin.persistirNome));
	}
	
	public String verificarBotao() {
		
		if(rdbtnCarro.isSelected()) {
			return "Carro";
		}else if(rdbtnMoto.isSelected()) {
			return "Moto";
		}
		
		return null;
	}
	
	public String verificarTipoLavagem() {
		
		if(cbTipoLavagem.getSelectedItem().equals("Simples")) {
			return "Simples";
		}else {
			return "Completa";
		}
	}
	
//	public String verificarMarca(String veiculo) {
//		if(veiculo.equals("Carro")) {
//			if(cbMarca){
//				
//			}else if(){
//				
//			}
//		}else if(veiculo.equals("Moto")) {
//			if(cbMarca.getSelectedItem().equals(""))
//		}
//		
//		if(cbMarca.getSelectedItem().equals(""))
//	}
	
}
