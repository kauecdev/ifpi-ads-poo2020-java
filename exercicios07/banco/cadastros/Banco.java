package exercicios07.banco.cadastros;

import exercicios07.banco.entidade.Conta;
import exercicios07.banco.entidade.Poupanca;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	public void inserir(Conta c) {
		if (indice < contas.length) { 
			contas[indice] = c;
			indice++;
		} else {
			System.out.println("Número máximo de contas atingido");
		}
	}

	public Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	private int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Conta inexistente.");
	}

	public void creditar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.depositar(valor);
		else
			System.out.println("Conta inexistente.");
	}
	
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);
		
		if (contaCredito != null && contaDebito != null) {
			contaCredito.transferir(contaDebito, valor);
		} else {
			System.out.println("As duas contas devem existir.");
		}
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		if (indice != -1) {
			contas[indice] = c;
		}

	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
		}
	}
	
	public void renderJuros(String numero) {
		Conta c = consultar(numero);
		if (c instanceof Poupanca) {
			((Poupanca) c).renderJuros();
		} else {
			System.out.println("Poupança não encontrada");
		}
	}
	
	public int retornaQuantidade() {
		return indice;
	}
	
	public double retornaValorTotal() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += contas[i].getSaldo();
		}
		
		return total;
	}
	
	public double retornaMediaValores() {
		return retornaValorTotal()/retornaQuantidade();
	}
}