package exercicios08.banco.testes;

import exercicios08.banco.entidade.Conta;

public class Teste {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[5];
	
			for (int i = 0; i < 10; i++) {
				numeros[i] = i;
			}
			System.out.println("Nunca chegar� aqui");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O array ultrapassou o �ndice 4");
		} finally {
			System.out.println("mesmo caindo na exce��o, passa por aqui");
		}
		
		try {
			Conta c = null;
			System.out.println("Erro:" +  c.getNumero());
		} catch (Exception e) {
			System.out.println("Classe n�o instanciada");
		}

	}

}
