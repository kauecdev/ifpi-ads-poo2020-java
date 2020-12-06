package exercicios1;

public class TesteDesconto {

	public static void main(String[] args) {
		Desconto desconto = new Desconto();
		
		desconto.valor = 120;
		desconto.desconto = 10;
		
		System.out.println(desconto.calcula());

	}

}
