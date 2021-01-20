package exercicios07.empregados;

public class Diarista extends Empregado {
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() / 30;
	}
}
