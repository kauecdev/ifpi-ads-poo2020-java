package exercicios07.escola;

public class Professor extends Funcionario {
	private String titulacao;

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public double getSalarioPrimeiraParcela() {
		return super.getSalario();
	}
	
	@Override
	public double getSalarioSegundaParcela() {
		return 0;
	}

}
