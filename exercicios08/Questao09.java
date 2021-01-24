package exercicios08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inteiro;
		int senha = 423123;
		
		try {
			System.out.println("Digite um número do tipo inteiro: ");
			inteiro = sc.nextInt();
			
			if (!(inteiro == senha)) {
				throw new Exception("Senha inválida");
			}
			
			System.out.println("Senha correta!");
			
		} catch (InputMismatchException e) {
			System.out.println("Tipo digitado inválido. Erro: " + e.getMessage()); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Aplicação encerrada.");
		}

	}

}
