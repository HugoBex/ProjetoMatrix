package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AvaliadorAluno {

	/*
	 * Uma mensagem de exceção serve para informar a causa do erro
	 * e não para interação com o usuário
	 */
	public void verificarNota(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		BigDecimal notaMinima = new BigDecimal(0);
		BigDecimal notaMaxima = new BigDecimal(10);

		if (nota1 == null || nota1.compareTo(notaMinima) == -1 || nota1.compareTo(notaMaxima) == 1 || nota2 == null
				|| nota2.compareTo(notaMinima) == -1 || nota2.compareTo(notaMaxima) == 1 || nota3 == null
				|| nota3.compareTo(notaMinima) == -1 || nota3.compareTo(notaMaxima) == 1)
			throw new IllegalArgumentException("Digite um valor válido");
	}

	/*
	 * Uma mensagem de exceção serve para informar a causa do erro
	 * e não para interação com o usuário
	 */
	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		if (notas == null)
			throw new IllegalArgumentException("Digite um valor válido");
		BigDecimal maiorNota = new BigDecimal(0);
		for (int i = 0; i < notas.length; i++) {
			if (notas[i].compareTo(maiorNota) == 1)
				maiorNota = notas[i];
		}
		return maiorNota;
	}

	/*
	 * Retornar o valor direto sem a necessidade das variáveis soma, qtdNotas, scale 
	 */
	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		verificarNota(nota1, nota2, nota3);
		BigDecimal soma = new BigDecimal(0);
		BigDecimal qtdNotas = new BigDecimal(3);
		int scale = 2;

		soma = nota1.add(nota2).add(nota3);

		return soma.divide(qtdNotas, scale, RoundingMode.HALF_UP);
	}


	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		verificarNota(nota1, nota2, nota3);
		BigDecimal media = new BigDecimal(0);
		media = getMedia(nota1, nota2, nota3);
		BigDecimal notaCorte1 = new BigDecimal(6);
		BigDecimal notaCorte2 = new BigDecimal(4);
		String status = "";

		if (media.compareTo(notaCorte1) == 0 || media.compareTo(notaCorte1) == 1)
			status = "APROVADO";
		else if ((media.compareTo(notaCorte2) == 0 || media.compareTo(notaCorte2) == 1)
				&& media.compareTo(notaCorte1) == -1)
			status = "PROVA_FINAL";
		else
			status = "REPROVADO";

		return status;
	}
}
