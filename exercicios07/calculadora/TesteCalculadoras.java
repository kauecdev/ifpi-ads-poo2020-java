package exercicios07.calculadora;

public class TesteCalculadoras {
	public static void main(String args[]) {
		CalculadoraCientifica cf = new CalculadoraCientifica();
		
		System.out.println(cf.exponenciar(8, 2));
		
		System.out.println(cf.divisao(14, 3));
		System.out.println(cf.divisao(14, 3, true));
	}
}
