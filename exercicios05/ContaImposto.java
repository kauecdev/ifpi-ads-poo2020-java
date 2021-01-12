package exercicios05;

public class ContaImposto {
	private String numero;
	private double saldo;
	
	ContaImposto(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
		
		retemImposto(valor);
	}
	
	private void retemImposto(double valorDebito) {
		this.saldo -= 0.0038 * valorDebito;
	}
}
