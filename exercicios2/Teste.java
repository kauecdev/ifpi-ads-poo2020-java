package exercicios2;

public class Teste {
//	int b = 1;
//	int a;
//	
//	Teste(int a) {
//		a = b + a;
//		System.out.println(this.a);
//	}
	
	double valor;
	
	void x(double valor) {
		this.valor += valor;
	}
	
	public static void main(String[] args) {
		Teste t = new Teste();
		
		t.valor = 1;
		
		t.x(1);
		
		System.out.println(t.valor);
	}
}
