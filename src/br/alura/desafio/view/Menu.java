package br.alura.desafio.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

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
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(44, 44, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Monocraft", lblNewLabel.getFont().getStyle(), 20));
		lblNewLabel.setBounds(267, 22, 62, 53);
		contentPane.add(lblNewLabel);
		String[] teste = new String[] { "Conversor de Moedas", "Conversor de Temperatura" };
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(185, 228, 197, 21);
		contentPane.add(comboBox);
		for (String string : teste) {
			comboBox.addItem(string);
		}

		JLabel lblNewLabel_1 = new JLabel("Selecione uma das opções: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Monocraft", lblNewLabel_1.getFont().getStyle(), 16));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(148, 142, 317, 43);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("Conversor de Moedas")) {
					ConversorMoedasView conversorMoedasView = new ConversorMoedasView();
					dispose();
					conversorMoedasView.setVisible(true);

				} else if (comboBox.getSelectedItem().equals("Conversor de Temperatura")) {

				}
			}
		});
		btnNewButton.setBounds(244, 278, 85, 21);
		contentPane.add(btnNewButton);

	}
}
