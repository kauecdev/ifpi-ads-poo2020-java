package exercicios05.banco;

public class Conta {
	private String numero;
	private double saldo;
	
	Conta() {
		
	}
	
	Conta(String numero, double valor) {
		this.numero = numero;
		this.saldo = valor;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}	
	
	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}		

}
