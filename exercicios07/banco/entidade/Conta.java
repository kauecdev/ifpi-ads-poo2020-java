package exercicios07.banco.entidade;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero, double valor) {		
		this.numero = numero;
		this.saldo = valor;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return numero;
	}

}
