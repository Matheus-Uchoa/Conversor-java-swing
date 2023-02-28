package br.alura.desafio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class ConversorMoedas extends JFrame {

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
					ConversorMoedas frame = new ConversorMoedas();
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
	public ConversorMoedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(44, 44, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor de Moedas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel
				.setFont(new Font("Monocraft", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 4));
		lblNewLabel.setBounds(146, 11, 227, 32);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(37, 170, 119, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione um tipo de conversão:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Monocraft", lblNewLabel_1.getFont().getStyle(), lblNewLabel_1.getFont().getSize() + 1));
		lblNewLabel_1.setBounds(37, 145, 293, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor da Conversão: ");
		lblNewLabel_2.setFont(new Font("Monocraft", lblNewLabel_2.getFont().getStyle(), lblNewLabel_2.getFont().getSize()));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(146, 228, 162, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(309, 225, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Informe o valor: ");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Monocraft", lblNewLabel_3.getFont().getStyle(), lblNewLabel_3.getFont().getSize() + 1));
		lblNewLabel_3.setBounds(37, 75, 242, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 100, 119, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
