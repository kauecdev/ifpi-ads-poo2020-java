package exercicios06;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
	
	private LocalDate dataAtual = LocalDate.now();
	private LocalDate dataVencimento;
	
	public void setDataVencimento(int ano, int mes, int dia) {
		this.dataVencimento = LocalDate.of(ano, mes, dia);
	}
	
	public boolean isValid() {
		return dataAtual.isBefore(dataVencimento);
	}
	
}
