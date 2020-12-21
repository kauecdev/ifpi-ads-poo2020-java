package exercicios3;

public class Microblog {
	Postagem[] postagens;
	int indice = 0;
	
	Microblog(int maxPostagens) {
		postagens = new Postagem[maxPostagens];
	}
	
	void adicionarPostagem(Postagem novaPostagem) {
		if (indice > postagens.length) {
			System.out.println("Postagem não adicionada. Limite de postagens alcançado.");
		} else {
			this.postagens[indice] = novaPostagem;
			indice++;
		}
	}
	
	int consultarIndice(int id) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (postagens[i].id == id) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	void excluirPostagem(int id) {
		int posPostagem = consultarIndice(id);
		
		if (posPostagem == -1) {
			System.out.println("Postagem não existe.");
		} else {
			for (int i = posPostagem; i < indice; i++) {
				postagens[i] = postagens[i + 1];
			}

			indice--;
		}
	}
	
	void curtir(int id) {
		int posPostagem = consultarIndice(id);
		
		if (posPostagem != -1) {
			postagens[posPostagem].curtir();
		}
	}
	
	Postagem [] postagemMaisCurtida() {
		Postagem[] postsMaisCurtidos;
		int[] posMaisCurtidas = new int[postagens.length];
		int tmp = 0;
		
		for (int i = 0; i < postagens.length; i++) {
			if (postagens[i].qtdCurtidas > tmp) {
				tmp = postagens[i].qtdCurtidas;
			}
			
			posMaisCurtidas[i] = -1;
		}
		
		for (int i = 0; i < postagens.length; i++) {
			if (postagens[i].qtdCurtidas == tmp) {
				posMaisCurtidas[i] = i;
			}
		}
		
		int contador = 0;
		
		for (int i = 0; i < postagens.length; i++) {
			if (posMaisCurtidas[i] != -1) {
				contador++;
			}
			
		}
		
		postsMaisCurtidos = new Postagem[contador];
		
		for (int i = 0; i < posMaisCurtidas.length; i++) {
			if (posMaisCurtidas[i] != -1) {
				postsMaisCurtidos[0] = postagens[posMaisCurtidas[i]];
				break;
			}

		}
		
		return postsMaisCurtidos;
	}
	
	
}
