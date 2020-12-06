package exercicios1;

public class Equipamento {
	boolean ligado;
	
	void liga() {
		if (ligado == true) {
			return;
		} else {
			ligado = true;			
		}
	}
	
	void desliga() {
		if (ligado == false) {
			return;
		} else {
			ligado = false;			
		}
	}
	
	void inverte() {
		if (ligado == true) {
			ligado = false;
		} else {
			ligado = true;
		}
	}
	
	boolean estaLigado() {
		return ligado;
	}
}
