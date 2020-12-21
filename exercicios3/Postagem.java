package exercicios3;

public class Postagem {
	int id;
	String texto;
	int qtdCurtidas = 0;
	
	void curtir() {
		qtdCurtidas++;
	}
	
	public String toString() {
		return texto + " Total de curtidas: " + qtdCurtidas;
	}
}
