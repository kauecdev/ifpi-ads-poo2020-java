package exercicios3;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco(6);
		Conta c1 = new Conta("1", 500);
		Conta c2 = new Conta("2", 500);
		Conta c3 = new Conta("3", 500);
		Conta c4 = new Conta("4", 500);
		
		banco.inserir(c1);
		banco.inserir(c2);
		banco.inserir(c3);
		banco.inserir(c4);
		
//		banco.creditar("4", 23);
		banco.transferir("1", "2", 50);
		
		System.out.println(banco.quantidadeContasCadastradas());
		System.out.println(banco.totalValorDepositado());
		System.out.println(banco.mediaSaldo());
		
//		System.out.println(banco[0].consultar());
//		banco.inserir(c1);
//		if (banco.consultar("2") == null) {
//			banco.inserir(new Conta("2",1000));
//		}
//		
//		if (banco.consultar("2") != null) {
//			System.out.println("A conta 2 j� est� cadastrada.");
//		}
//		
//		System.out.println(banco.consultarIndice("2"));
//		System.out.println(banco.consultarIndice("3"));
//		
// 		Conta c2x = new Conta("2", 1000000);
//		banco.alterar(c2x);
/*		
		Conta c3 = new Conta("3", 1000000);
		banco.alterar(c3);
	*/	
//		banco.excluir("1");
//  		Conta c3 = new Conta("3", 1000000);
//		banco.inserir(c3);
//		banco.debitar("2", 20);
//		banco.debitar("4", 20);
	}
}
