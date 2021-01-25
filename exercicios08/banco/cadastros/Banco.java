package exercicios08.banco.cadastros;

import exercicios08.banco.entidade.AplicacaoException;
import exercicios08.banco.entidade.Conta;
import exercicios08.banco.entidade.Poupanca;

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
		if (indice > contas.length) {
			throw new AplicacaoException("Número máximo de contas atingido.");
		}
		contas[indice] = c;
		indice++;
	}

	public Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				break;
			}
		}
		
		if (c == null) {
			throw new AplicacaoException("Conta não encontrada");
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
		
		if (pos == -1) {
			throw new AplicacaoException("Conta não encontrada");
		}
		
		return pos;
	}

	public void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c == null) {
			throw new AplicacaoException("Conta inexistente.");
		}
		
		c.sacar(valor);
	}

	public void creditar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c == null) {
			throw new AplicacaoException("Conta inexistente.");
		}
		
		c.depositar(valor);
	}
	
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);
		
		if (contaCredito == null || contaDebito == null) {
			throw new AplicacaoException("As duas contas devem existir.");
		}
		
		contaCredito.transferir(contaDebito, valor);
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		
		if (indice == -1) {
			throw new AplicacaoException("Conta inexistente.");
		}

		contas[indice] = c;
	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao == -1) {
			throw new AplicacaoException("Conta inexistente.");
		}
		
		for (int i = posicao; i < indice; i++) {
			contas[i] = contas[i + 1];
		}
		
		indice--;
	}
	
	public void renderJuros(String numero) {
		Conta c = consultar(numero);
		if (c != null && c instanceof Poupanca) {
			((Poupanca) c).renderJuros();
		}
		
		throw new AplicacaoException("Poupança não encontrada.");
		
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