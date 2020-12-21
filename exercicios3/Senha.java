package exercicios3;

public class Senha {
	public String valor;
	
	public void iguais(String valor) {
		if (valor.equals(this.valor)) {
			System.out.println("Iguais.");
		} else {
			System.out.println("Diferentes.");
		}
	}
	
	public void iguaisTrim(String valor) {
		String senhaSemEspacos = valor.trim();
		
		if (senhaSemEspacos.equals(this.valor)) {
			System.out.println("Iguais.");
		} else {
			System.out.println("Diferentes.");
		}
	}
	
	public boolean tamanhoSeguro() {
		if (this.valor.length() >= 6) {
			return true;
		}
		return false;
	}
	
	public boolean possuiMaiusculaMinuscula() {
		int qtdCaracteresMai = 0;
		int qtdCaracteresMin = 0;
		
		for (int i = 0, len = this.valor.length(); i < len; i++) {
			if (valor.charAt(i) >= 'A' && valor.charAt(i) <= 'Z') {
				qtdCaracteresMai++;
			}
			
			if (valor.charAt(i) >= 'a' && valor.charAt(i) <= 'z') {
				qtdCaracteresMin++;
			}
		}
		
		if (qtdCaracteresMai > 0 && qtdCaracteresMin > 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean possuiNumero() {
		int qtdCaracteresNumericos = 0;
		
		for (int i = 0, len = this.valor.length(); i < len; i++) {
			if (valor.charAt(i) >= '0' && valor.charAt(i) <= '9') {
				qtdCaracteresNumericos++;
			}
		}
		
		if (qtdCaracteresNumericos > 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean ehValida() {
		if (tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero()) {
			return true;
		}
		
		return false;
	}
}
