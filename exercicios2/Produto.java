package exercicios2;

public class Produto {
	int quantidade, codigo, quantidadeMinima;
	String descricao;
	private double valor;
	
	Produto(int codigo, String descricao, double valor, int quantidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	void baixar(int quantidade) {
		if (this.quantidade - quantidade <= quantidadeMinima) {
			return;
		} else {
			this.quantidade -= quantidade;			
		}
	}
	
	void repor(int quantidade) {
		this.quantidade += quantidade;
	}
	
	void reajusta(double taxa) {
		this.valor += (taxa / 100) * this.valor;
	}
	
	public String toString() {
		return this.codigo + " | " + this.descricao + " | R$ " + this.valor + " | " + this.quantidade;
	}
	
	boolean equals(Produto produto) {
		if (produto.codigo == this.codigo) {
			return true;
		}
		
		return false;
	}
	
	double mostrarValor() {
		return valor;
	}
}
