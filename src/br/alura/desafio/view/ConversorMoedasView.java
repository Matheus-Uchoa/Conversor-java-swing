package br.alura.desafio.view;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.alura.desafio.service.ConversorMoedas;

public class ConversorMoedasView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorMoedasView frame = new ConversorMoedasView();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorMoedasView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 378);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(44, 44, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ConversorMoedas conversor = new ConversorMoedas();
		JLabel lblPageTitle = new JLabel("Conversor de Moedas");
		lblPageTitle.setForeground(new Color(255, 255, 255));
		lblPageTitle.setFont(
				new Font("Monocraft", lblPageTitle.getFont().getStyle(), lblPageTitle.getFont().getSize() + 4));
		lblPageTitle.setBounds(146, 11, 227, 32);
		contentPane.add(lblPageTitle);

		JComboBox<String> OpcoesConversao = new JComboBox<String>();
		OpcoesConversao.setBounds(37, 170, 162, 22);
		contentPane.add(OpcoesConversao);

		for (String string : conversor.getOpcoesConversao()) {
			OpcoesConversao.addItem(string);
		}

		JLabel lblOpcoes = new JLabel("Selecione um tipo de conversão:");
		lblOpcoes.setForeground(new Color(255, 255, 255));
		lblOpcoes.setFont(new Font("Monocraft", lblOpcoes.getFont().getStyle(), lblOpcoes.getFont().getSize()));
		lblOpcoes.setBounds(37, 145, 293, 14);
		contentPane.add(lblOpcoes);

		JLabel lblResultado = new JLabel("Valor da Conversão: ");
		lblResultado
				.setFont(new Font("Monocraft", lblResultado.getFont().getStyle(), lblResultado.getFont().getSize()));
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setBounds(92, 299, 162, 14);
		contentPane.add(lblResultado);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(264, 297, 201, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JLabel lblForm = new JLabel("Informe o valor: ");
		lblForm.setForeground(new Color(255, 255, 255));
		lblForm.setFont(new Font("Monocraft", lblForm.getFont().getStyle(), lblForm.getFont().getSize()));
		lblForm.setBounds(37, 75, 242, 14);
		contentPane.add(lblForm);

		textField = new JTextField();
		textField.setBounds(37, 99, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("0.0");

		JButton converterBtn = new JButton("Converter");
		converterBtn.setBackground(Color.WHITE);
		converterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorTexto = textField.getText();
				double valor = 0.0;
				try {
					valor = Double.parseDouble(valorTexto);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(converterBtn, "Informe apenas números!");
				}

				txtResultado.setText(conversor.selecionaopcao(OpcoesConversao, valor));
			}

		});
		converterBtn.setFont(new Font("Monocraft", converterBtn.getFont().getStyle(), 10));
		converterBtn.setBounds(321, 170, 125, 23);
		contentPane.add(converterBtn);

	}
}
