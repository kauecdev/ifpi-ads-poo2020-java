package exercicios3;

public class TestaMicroblog {
	public static void main(String args[]) {
		Microblog microblog = new Microblog(3);
		
		Postagem post1 = new Postagem();
		Postagem post2 = new Postagem();
		Postagem post3 = new Postagem();
		
		post1.id = 1;
		post1.texto = "Blá blá blá";
		
		post2.id = 2;
		post2.texto = "Blé blé blé";
		
		post3.id = 3;
		post3.texto = "Blí blí blí";
		
		microblog.adicionarPostagem(post1);
		microblog.adicionarPostagem(post2);
		microblog.adicionarPostagem(post3);
		
		microblog.curtir(2);
		microblog.curtir(2);
		microblog.curtir(2);
		microblog.curtir(3);
		microblog.curtir(1);
		microblog.curtir(1);
		
		
		System.out.println(microblog.postagemMaisCurtida());
	}
}
