package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraSalario {

	public void verificarValor(BigDecimal salarioBruto) {
		if (salarioBruto == null || salarioBruto.compareTo(new BigDecimal(0)) == 0)
			throw new IllegalArgumentException("Digite um valor válido");
	}

	public void verificarIdade(Integer idade) {
		if (idade == null || idade<0)
			throw new IllegalArgumentException("Digite um valor válido");
	}

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		verificarValor(salarioBruto);
		BigDecimal salarioLiquido = new BigDecimal(0);
		BigDecimal desconto = new BigDecimal(0);

		desconto = salarioBruto.multiply(percentualImpostoINSS.divide(new BigDecimal(100)));
		salarioLiquido = salarioBruto.subtract(desconto);

		return salarioLiquido.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		verificarValor(salarioBruto);
		BigDecimal percentualImpostoINSS = new BigDecimal(0);

		if (salarioBruto.compareTo(new BigDecimal(1693.72)) == -1) {
			percentualImpostoINSS = salarioBruto.multiply(new BigDecimal(0.08));
		} else if (salarioBruto.compareTo(new BigDecimal(2822.90)) == -1) {
			percentualImpostoINSS = salarioBruto.multiply(new BigDecimal(0.09));
		} else if (salarioBruto.compareTo(new BigDecimal(2822.90)) == 1) {
			percentualImpostoINSS = salarioBruto.multiply(new BigDecimal(0.11));
		}
		return percentualImpostoINSS = percentualImpostoINSS.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		verificarIdade(idade);

		BigDecimal valor = new BigDecimal(0);
		BigDecimal ValorPlanoDeSaude = new BigDecimal(0);

		if ((idade >= 0) && (idade <= 9))
			ValorPlanoDeSaude = valor.add(new BigDecimal(75));
		else if (idade <= 19)
			ValorPlanoDeSaude = valor.add(new BigDecimal(112.50));
		else if (idade <= 29)
			ValorPlanoDeSaude = valor.add(new BigDecimal(168.75));
		else if (idade <= 39)
			ValorPlanoDeSaude = valor.add(new BigDecimal(253.13));
		else if (idade <= 49)
			ValorPlanoDeSaude = valor = valor.add(new BigDecimal(379.69));
		else if (idade <= 59)
			ValorPlanoDeSaude = valor = valor.add(new BigDecimal(569.54));
		else if (idade >= 60)
			ValorPlanoDeSaude = valor = valor.add(new BigDecimal(854.30));

		return ValorPlanoDeSaude.setScale(2, RoundingMode.HALF_UP);
	}
}