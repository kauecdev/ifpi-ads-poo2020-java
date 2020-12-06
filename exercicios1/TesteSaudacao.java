package exercicios1;

public class TesteSaudacao {

	public static void main(String[] args) {
		Saudacao saudacao = new Saudacao();
		
		saudacao.texto = "Boa tarde";
		saudacao.destinatario = "Kauê";
		System.out.println(saudacao.obterSaudacao());

	}

}
