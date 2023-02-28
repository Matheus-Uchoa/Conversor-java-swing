package br.alura.desafio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ConversorMoedas extends JFrame {

	private JPanel contentPane;

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
		lblNewLabel.setBounds(145, 30, 227, 32);
		contentPane.add(lblNewLabel);
	}
}
