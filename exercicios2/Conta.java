package exercicios2;

public class Conta {
	String numero;
	private double saldo;
	
	Conta(String numero, double valor) {
		this.numero = numero;
		this.saldo = valor;
	}

	boolean sacar(double valor) {
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	boolean transferir(Conta destino, double valor) {
		
		if (this.sacar(valor)) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		
		return false;
	}		

}