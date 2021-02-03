package exercicios09.contas;

public class TesteContas {
	public static void main(String args[]) {
		AuditoriaInterna a = new AuditoriaInterna();
		
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
		ContaCorrente c4 = new ContaCorrente();
		
		SeguroDeVida s1 = new SeguroDeVida();
		SeguroDeVida s2 = new SeguroDeVida();
		SeguroDeVida s3 = new SeguroDeVida();
		SeguroDeVida s4 = new SeguroDeVida();
		
		c1.setNome("Antonio");
		c1.setSaldo(100);
		
		c2.setNome("Kauê");
		c2.setSaldo(300);
		
		c3.setNome("Cavalcante");
		c3.setSaldo(200);
		
		c4.setNome("Ferreira");
		c4.setSaldo(400);
		
		a.adicionar(c1);
		a.adicionar(c2);
		a.adicionar(c3);
		a.adicionar(c4);
		a.adicionar(s1);
		a.adicionar(s2);
		a.adicionar(s3);
		a.adicionar(s4);
		
		System.out.println("Total de tributos: R$ " + a.calcularTributos());
		
	}
}
