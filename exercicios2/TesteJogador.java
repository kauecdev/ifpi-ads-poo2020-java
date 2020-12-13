package exercicios2;

public class TesteJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(10, 8, 100);
		Jogador jogador2 = new Jogador(11, 9, 100);
		
		jogador1.atacar(jogador2);
		jogador2.atacar(jogador1);
		
		System.out.println(jogador1.verPontosJogador());
		System.out.println(jogador2.verPontosJogador());
		
		if (jogador1.verPontosJogador() > jogador2.verPontosJogador()) {
			System.out.println("Jogador 1 tem mais pontos que jogador 2.");
		} else {
			System.out.println("Jogador 2 tem mais pontos que jogador 1.");
		}

	}

}
