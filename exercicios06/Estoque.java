package exercicios06;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void inserir(Produto produto) {
		
		if (produtos.size() == 0) {
			this.produtos.add(produto);
			System.out.println("Produto adicionado com sucesso!");
		} else {
			for (int i = 0; i < produtos.size(); i++) {
				
				if (produtos.get(i).getId() == produto.getId() || produtos.get(i).getDescricao() == produto.getDescricao()) {
					System.out.println("ID ou Nome do produto já existe. Não pode haver produtos com ID's ou nomes iguais.");
				} else {
					this.produtos.add(produto);
					System.out.println("Produto adicionado com sucesso!");
					return;
				}
			}
		}
		
	}
	
	public void consultar(int id) {
		Produto produtoEncontrado = null;
		int opcao, quantidade;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				produtoEncontrado = produtos.get(i);
			}
		}
		
		if (produtoEncontrado != null) {
			
			System.out.println("\nID do produto: " + produtoEncontrado.getId());
			System.out.println("Nome do produto: " + produtoEncontrado.getDescricao());
			System.out.printf("Preço do produto: R$ %.2f\n", produtoEncontrado.getValor());
			System.out.println("Quantidade do produto: " + produtoEncontrado.getQuantidade());
			
			do {
				
				System.out.println("Dejeja realizar repor ou dar baixa na quantidade do produto? (1 - Sim | 0 - Não)");
				opcao = sc.nextInt();
				
				if (opcao == 1) {
					System.out.println("1 - Repor | 2 - Dar baixa");
					opcao = sc.nextInt();
					
					if (opcao == 1) {
						System.out.println("Quantidade: ");
						quantidade = sc.nextInt();
						produtoEncontrado.repor(quantidade);
					}
					
					if (opcao == 2) {
						System.out.println("Quantidade: ");
						quantidade = sc.nextInt();
						produtoEncontrado.darBaixa(quantidade);
					}
				}
				
			} while (opcao != 0);
		} else {
			System.out.printf("\nProduto de ID %d não encontrado.\n", id);
		}
	}
	
	public void excluir(int id) {
		int posProdutoAExcluir = -1;
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				posProdutoAExcluir = i;
			}
		}
		
		if (posProdutoAExcluir != -1) {
			produtos.remove(posProdutoAExcluir);
			System.out.println("\nProduto excluído com sucesso!");
		} else {
			System.out.printf("\nProduto de ID %d não encontrado.\n", id);
		}
	}
	
	
}
