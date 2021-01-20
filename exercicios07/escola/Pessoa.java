package exercicios07.escola;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

}
