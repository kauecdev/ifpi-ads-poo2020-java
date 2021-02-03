package exercicios09.funcionarios;

public class Gerente extends Funcionario {
	private double porcentagemParticipacao = 0.10;
	private double lucrosEmpresa = 10000;
	
	Gerente() {
		
	}
	
	Gerente(double salario) {
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
