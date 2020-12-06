package exercicios1;

public class Desconto {
	int valor, desconto;
	
	int calcula() {
		return (valor * (1 - desconto / 100));
	}
}
