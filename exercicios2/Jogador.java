package exercicios2;

public class Jogador {
	int forca, nivel;
	private int pontosAtuais;
	
	Jogador(int forca, int nivel, int pontosAtuais) {
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
	}
	
	int pontosAtaque() {
		return this.forca * this.nivel;
	}
	
	void atacar(Jogador jogador) {
		jogador.pontosAtuais -= pontosAtaque();
	}
	
	int verPontosJogador() {
		return pontosAtuais;
	}
	
}
