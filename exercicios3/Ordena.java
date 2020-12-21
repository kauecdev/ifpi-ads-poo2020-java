package exercicios3;

public class Ordena {
	public static void main(String args[]) {
		int qtdElementos = args.length;
		int[] inteiros = new int[qtdElementos];
		
		for (int i = 0; i < qtdElementos; i++) {
			inteiros[i] = Integer.parseInt(args[i]);
		}
		
		boolean continua = true;
		int tmp;
		while (continua) {
			continua = false;
			for (int i = 0; i < qtdElementos - 1; i++) {
				if (inteiros[i] > inteiros[i + 1]) {
					tmp = inteiros[i];
					inteiros[i] = inteiros[i + 1];
					inteiros[i + 1] = tmp;
					continua = true;
				}
			}
		}
		
		for (int i = 0; i < qtdElementos; i++) {
			System.out.println(inteiros[i]);
		}
	}
}
