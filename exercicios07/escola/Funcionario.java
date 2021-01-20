package exercicios07.escola;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (!(salario < 0)) {
			this.salario = salario;			
		} else {
			System.out.println("O salário não pode ter valor negativo.");
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		return 0.6 * this.getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0.4 * this.getSalario();
	}

}
