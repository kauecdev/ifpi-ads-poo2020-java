package exercicios3;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		pilha.desempilhar();
		pilha.empilhar(5);
		pilha.empilhar(34);

		
		System.out.println(pilha.estaCheia() ? "Verdadeiro." : "Falso.");
		System.out.println(pilha.retornarTopo());
		
		pilha.exibir();
	}

}
