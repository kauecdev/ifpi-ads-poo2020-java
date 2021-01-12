package exercicios05.banco;

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
		if (indice > contas.length - 1) {
			System.out.println("Limite de contas atingido. Não é possível adicionar mais contas.");
		} else {
			contas[indice] = c;
			System.out.println("Conta cadastrada com sucesso!");
			indice++;			
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

	public int consultarIndice(String numero) {
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
		if (c != null) {
			c.sacar(valor);
			System.out.println("Operação realizada com sucesso!");
		}
		else
			System.out.println("Conta inexistente.");
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		if (indice != -1) {
			contas[indice] = c;
			System.out.println("Conta alterada com sucesso!");
		} else {
			System.out.println("Conta não encontrada.");
		}

	}
	
	public void creditar(String numero, double valor) {
		Conta conta = consultar(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.printf("Conta de número %s não encontrada. Operação não realizada.", numero);
		}
	}
	
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta c1 = consultar(numCredito);
		Conta c2 = consultar(numDebito);
		
		if (c1 != null && c2 != null) {
			c1.transferir(c2, valor);
			System.out.println("Operação realizada com sucesso!");
		} else if (c1 == null && c2 == null){
			System.out.printf("Contas de número %s e %s não encontrada. Operação não realizada.\n", numCredito, numDebito);
		} else if (c1 == null) {
			System.out.printf("Conta de número %s não encontrada. Operação não realizada.\n", numCredito);
		} else if (c2 == null) {
			System.out.printf("Conta de número %s não encontrada. Operação não realizada.\n", numDebito);
		} 
 			
	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
			System.out.println("Operação realizada com sucesso!");
		}
		else {
			System.out.printf("Conta de número %s não encontrada. Operação não realizada.\n", numero);
		}
	}
	
	public int quantidadeContasCadastradas() {
		int qtdContas = 0;
		
		for (int i = 0, len = contas.length; i < len; i++) {
			if (contas[i] != null) {
				qtdContas++;
			}
		}
		
		return qtdContas;
	}
	
	public double totalValorDepositado() {
		double valorTotal = 0;
		
		for (int i = 0, len = contas.length; i < len; i++) {
			if (contas[i] != null) {
				valorTotal += contas[i].getSaldo();
			}
		}
		
		return valorTotal;
	}
	
	public double mediaSaldo() {
		int qtdContas = quantidadeContasCadastradas();
		double valorTotal = totalValorDepositado();
		
		double media = valorTotal / qtdContas;
		
		return media;
	}
}