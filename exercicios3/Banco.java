package exercicios3;

public class Banco {
	Conta[] contas;
	int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	void inserir(Conta c) {
		if (indice > contas.length - 1) {
			System.out.println("Limite de contas atingido. Não é possível adicionar mais contas.");
		} else {
			contas[indice] = c;
			indice++;			
		}
	}

	Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Conta inexistente.");
	}

	void alterar(Conta c) {
		int indice = consultarIndice(c.numero);
		if (indice != -1) {
			contas[indice] = c;
		}

	}
	
	void creditar(String numero, double valor) {
		Conta conta = consultar(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.printf("Conta de número %s não encontrada. Operação não realizada.", numero);
		}
	}
	
	void transferir(String numCredito, String numDebito, double valor) {
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

	void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
		}
	}
	
	int quantidadeContasCadastradas() {
		int qtdContas = 0;
		
		for (int i = 0, len = contas.length; i < len; i++) {
			if (contas[i] != null) {
				qtdContas++;
			}
		}
		
		return qtdContas;
	}
	
	double totalValorDepositado() {
		double valorTotal = 0;
		
		for (int i = 0, len = contas.length; i < len; i++) {
			if (contas[i] != null) {
				valorTotal += contas[i].consultarSaldo();
			}
		}
		
		return valorTotal;
	}
	
	double mediaSaldo() {
		int qtdContas = quantidadeContasCadastradas();
		double valorTotal = totalValorDepositado();
		
		double media = valorTotal / qtdContas;
		
		return media;
	}
}