package exercicios2;

public class TesteProduto {

	public static void main(String[] args) {
		Produto carne = new Produto(1, "Carne de gado", 20, 40);
		Produto frango = new Produto(2, "Frango assado", 18, 30);
		Produto linguica = new Produto(1, "Linguiça Sadia", 30, 15);
		
		carne.quantidadeMinima = 10;
		frango.quantidadeMinima = 10;
		linguica.quantidadeMinima = 10;
		
		System.out.println(carne.toString());
		System.out.println(frango.toString());
		System.out.println(linguica.toString());
		
		frango.reajusta(10);
		// Valor reajustado = R$ 19.80
		
		System.out.println("R$ " + frango.mostrarValor());
		
		System.out.println(carne.equals(linguica));
		// Retornará true
		
		linguica.baixar(15);
		// Retira mais do que a quantidade mínima permite, logo, o print abaixo será a quantidade passada incialmente
		System.out.println(linguica.quantidade);
		
		linguica.baixar(4);
		// Retira uma quantidade aceitável, o print será 11.
		System.out.println(linguica.quantidade);


	}

}
