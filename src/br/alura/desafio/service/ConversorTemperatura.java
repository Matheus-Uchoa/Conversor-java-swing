package br.alura.desafio.service;

import javax.swing.JComboBox;

public class ConversorTemperatura {
	private String opcoesConversao[] = new String[] { "De Celsius a Fahrenheit", "De Celsius a Kelvin",
			"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" };

	public String[] getOpcoesConversao() {
		return opcoesConversao;
	}

	public String selecionaopcao(JComboBox<String> caixa, Double valor) {
		switch (caixa.getSelectedItem().toString()) {
		case "De Celsius a Fahrenheit":
			valor = (valor * 1.8) + 32; //

			return valor.toString() + "ºF";

		case "De Celsius a Kelvin":
			valor += 273.15;
			return valor.toString() + "K";

		case "De Fahrenheit a Celsius":
			valor = (valor - 32d) * 5 / 9;
			return valor.toString() + "°C";

		case "De Fahrenheit a Kelvin":
			valor = (valor - 32) * 5 / 9 + 273.15;
			return valor.toString() + "K";

		case "De Kelvin a Celsius":
			valor -= 273.15;
			return valor.toString() + "°C";

		case "De Kelvin a Fahrenheit":
			valor = (valor - 273.15) * 9 / 5 + 32;
			return valor.toString() + "ºF";

		default:
			return "ERROR";

		}
	}

}
