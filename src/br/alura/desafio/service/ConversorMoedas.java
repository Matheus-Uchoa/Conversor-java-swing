package br.alura.desafio.service;

import javax.swing.JComboBox;

public class ConversorMoedas {

	private String[] opcoesConversao = new String[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
			"De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
			"De Yenes a Reais", "De Won Coreano a Reais"

	};

	public String[] getOpcoesConversao() {
		return opcoesConversao;
	}

	public String selecionaopcao(JComboBox<String> caixa, Double valor) {
		switch (caixa.getSelectedItem().toString()) {
		case "De Reais a Dólares":
			valor *= 0.19;

			return "$" + valor.toString();

		case "De Reais a Euros":
			valor *= 0.18;
			return "€" + valor.toString();

		case "De Reais a Libras":
			valor *= 0.16;
			return "£" + valor.toString();

		case "De Reais a Yenes":
			valor *= 26.64;
			return "¥" + valor.toString();

		case "De Reais a Won Coreano":
			valor *= 256.22;
			return "₩" + valor.toString();

		case "De Dólares a Reais":
			valor *= 5.15;
			return "R$" + valor.toString();

		case "De Euros a Reais":
			valor *= 5.46;
			return "R$" + valor.toString();

		case "De Libras a Reais":
			valor *= 6.09;
			return "R$" + valor.toString();

		case "De Yenes a Reais":
			valor *= 0.038;
			return "R$" + valor.toString();

		case "De Won Coreano a Reais":
			valor *= 0.0039;
			return "R$" + valor.toString();

		default:
			return "ERROR";

		}
	}

}
