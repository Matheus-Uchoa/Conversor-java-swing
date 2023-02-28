package br.alura.desafio.service;

public class ConversorMoedas {
	private double valor;

	private String[] opcoesConversao = new String[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
			"De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
			"De Yenes a Reais", "De Won Coreano a Reais"

	};

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String[] getOpcoesConversao() {
		return opcoesConversao;
	}

}
