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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.alura.desafio.service.ConversorMoedas;

public class ConversorMoedasView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		JLabel lblNewLabel = new JLabel("Conversor de Moedas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel
				.setFont(new Font("Monocraft", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 4));
		lblNewLabel.setBounds(146, 11, 227, 32);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(37, 170, 162, 22);
		contentPane.add(comboBox);

		for (String string : conversor.getOpcoesConversao()) {
			comboBox.addItem(string);
		}

		JLabel lblNewLabel_1 = new JLabel("Selecione um tipo de conversão:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1
				.setFont(new Font("Monocraft", lblNewLabel_1.getFont().getStyle(), lblNewLabel_1.getFont().getSize()));
		lblNewLabel_1.setBounds(37, 145, 293, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Valor da Conversão: ");
		lblNewLabel_2
				.setFont(new Font("Monocraft", lblNewLabel_2.getFont().getStyle(), lblNewLabel_2.getFont().getSize()));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(149, 300, 162, 14);
		contentPane.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(297, 297, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Informe o valor: ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3
				.setFont(new Font("Monocraft", lblNewLabel_3.getFont().getStyle(), lblNewLabel_3.getFont().getSize()));
		lblNewLabel_3.setBounds(37, 75, 242, 14);
		contentPane.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(37, 100, 119, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Monocraft", btnNewButton.getFont().getStyle(), 10));
		btnNewButton.setBounds(284, 170, 125, 23);
		contentPane.add(btnNewButton);
	}
}
