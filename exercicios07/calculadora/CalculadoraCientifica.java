package exercicios07.calculadora;

public class CalculadoraCientifica extends Calculadora {
	public double exponenciar(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public double divisao(double op1, double op2, boolean retornarArredondado) {
		double resultado = super.divisao(op1, op2);
		
		if (retornarArredondado == true) {
			return Math.round(resultado);
		}
		
		return resultado;
	}
}
