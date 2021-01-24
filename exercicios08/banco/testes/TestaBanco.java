package exercicios08.banco.testes;

import exercicios08.banco.entidade.*;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c = new Conta("1", 100);
		try {
			c.sacar(10);
			c.sacar(1000);
			System.out.println("Esse c�digo n�o executa.");
		} catch (AplicacaoException e) {
			System.out.println("Exce��o capturada: " + e.getMessage());
		}
		System.out.println("Programa finalizado com sucesso");
	}
}
