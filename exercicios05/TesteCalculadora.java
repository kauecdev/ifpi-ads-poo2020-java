package exercicios05;

public class TesteCalculadora {
	public static void main(String args[]) {
		
		Calculadora calculadora = new Calculadora(5,7);
		
		System.out.printf("A soma é: %d", calculadora.somar());
		System.out.printf("\nA subtração é: %d", calculadora.subtrair());
		
		// calculadora.primeiroOperando = 4;
		// A tentativa de acessar um dos operandos é inviável, uma vez que os atributos foram definidos como privados,
		// sendo assim, os atributos são acessíveis somente na classe em que foram criados.
	}
}
