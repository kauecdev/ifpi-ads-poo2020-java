package exercicios09.funcionarios;

public class Diretor extends Gerente {
	private double porcentagemParticipacao = 0.40;
	private double lucrosEmpresa = 10000;
	
	Diretor() {
		
	}
	
	Diretor(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getBonificacao() {
		return salario + (lucrosEmpresa * porcentagemParticipacao);
	}
}
