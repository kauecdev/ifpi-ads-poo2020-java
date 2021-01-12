package exercicios05;

public class TesteContaImposto {
	public static void main(String args[]) {
		ContaImposto contaImposto = new ContaImposto("1", 500);
		
		contaImposto.creditar(300);
		
		System.out.printf("\nSaldo atual: R$ %.2f", contaImposto.getSaldo());
		
		contaImposto.debitar(250);
		
		System.out.printf("\nSaldo atual: R$ %.2f", contaImposto.getSaldo());
	}
}
