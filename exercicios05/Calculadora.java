package exercicios05;

public class Calculadora {
	private int primeiroOperando, segundoOperando;
	
	Calculadora(int primeiroOperando, int segundoOperando) {
		this.primeiroOperando = primeiroOperando;
		this.segundoOperando = segundoOperando;
	}
	
	int somar() {
		return primeiroOperando + segundoOperando;
	}
	
	int subtrair() {
		return primeiroOperando - segundoOperando;
	}
}
