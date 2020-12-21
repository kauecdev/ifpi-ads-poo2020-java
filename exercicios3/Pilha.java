package exercicios3;

public class Pilha {
	int[] arr = new int[5];
	int index = 0;
	
	public void empilhar(int numero) {
		if (index > 4) {
			System.out.println("A pilha está cheia, não é possível adicionar mais valores.");
		} else {
			this.arr[index] = numero;
			index++;			
		}
	}
	
	public void desempilhar() {
		index--;
		this.arr[index] = 0;
	}
	
	public boolean estaCheia() {
		if (index >= 5) {
			return true;
		}
		
		return false;
	}
	
	public int retornarTopo() {
		return this.arr[4];
	}
	
	public void exibir() {
		String elementosPilha = "";
		
		for (int i = 0; i < this.arr.length - 1; i++) {
			elementosPilha += arr[i] + ", ";
		}
		
		elementosPilha += arr[4];
		
		System.out.println(elementosPilha);
	}
}
