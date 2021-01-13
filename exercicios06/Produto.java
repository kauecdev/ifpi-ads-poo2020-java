package exercicios06;

public class Produto {
	private int id;
	private int quantidade;
	private String descricao;
	private double valor;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void repor(int quantidade) {
		this.quantidade += quantidade;
		System.out.println("Operação realizada com sucesso!");
	}
	
	public void darBaixa(int quantidade) {
		this.quantidade -= quantidade;
		System.out.println("Operação realizada com sucesso!");
	}
}
