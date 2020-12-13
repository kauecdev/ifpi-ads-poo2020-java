package exercicios2;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("1",100);
		Conta c2 = new Conta("2",100);
		
		c1.sacar(20);
		// Resultado esperado:  c1 = 80;
		
		System.out.println(c1.consultarSaldo());
		
		c1.transferir(c2, 80);
		
		// Resultado esperado:  c1 = 0;
		// Resultado esperado:  c2 = 180;
		
		System.out.println(c1.consultarSaldo());
		System.out.println(c2.consultarSaldo());
	}

}
