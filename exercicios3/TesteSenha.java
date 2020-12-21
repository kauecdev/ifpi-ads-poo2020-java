package exercicios3;

public class TesteSenha {
	public static void main(String args[]) {
		Senha senha = new Senha();
		
		senha.valor = "abc1A2d";
		
		senha.iguais("abc1A2d");
		senha.iguaisTrim(" abc1A2d ");
		System.out.println(senha.tamanhoSeguro() ? "Verdadeiro." : "Falso.");
		System.out.println(senha.possuiMaiusculaMinuscula() ? "Verdadeiro." : "Falso.");
		System.out.println(senha.possuiNumero() ? "Verdadeiro." : "Falso.");
		System.out.println(senha.ehValida() ? "Verdadeiro." : "Falso.");
		
	}
}
