package exercicios09.geometria;

public class TesteGeometria {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(2);
		Retangulo retangulo = new Retangulo(2, 4);
		Triangulo triangulo = new Triangulo(3, 3, 4);
		
		triangulo.setTamanhoBase(3);
		triangulo.setTamanhoAltura(5);
		
		System.out.println("Área do quadrado: " + quadrado.calculaArea() + " - Perímetro do quadrado: " + quadrado.calculaPerimetro());
		System.out.println("Área do retângulo: " + retangulo.calculaArea() + " - Perímetro do retângulo: " + retangulo.calculaPerimetro());
		System.out.println("Área do triângulo: " + triangulo.calculaArea() + " - Perímetro do triângulo: " + triangulo.calculaPerimetro());
		
	}

}
