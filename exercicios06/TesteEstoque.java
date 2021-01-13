package exercicios06;

public class TesteEstoque {
	public static void main(String args[]) {
		Estoque estoque = new Estoque();
		
		Produto produto = new Produto();
		
		produto.setId(1);
		produto.setDescricao("Fósforo");
		produto.setValor(4.00);
		produto.setQuantidade(5);
		
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
		
		produtoPerecivel.setId(2);
		produtoPerecivel.setDescricao("Leite");
		produtoPerecivel.setValor(5);
		produtoPerecivel.setQuantidade(10);
		produtoPerecivel.setDataVencimento(2021, 3, 4);
		
		estoque.inserir(produto);
		estoque.inserir(produtoPerecivel);
		
		estoque.consultar(2);
		estoque.excluir(2);
	
		
		
	}
}
