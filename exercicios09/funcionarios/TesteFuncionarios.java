package exercicios09.funcionarios;

public class TesteFuncionarios {
	public static void main(String args[]) {
		Gerente gerente = new Gerente(2000);
		Diretor diretor = new Diretor(4500);
		
		System.out.println("Bonificação do gerente: R$ " + gerente.getBonificacao());
		System.out.println("Bonificação do diretor: R$ " + diretor.getBonificacao());
	}
}
