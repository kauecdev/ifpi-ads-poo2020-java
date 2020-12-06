package exercicios1;

public class NumberUtils {
	int n;
	
	boolean isPair() {
		boolean result;
		if (n % 2 == 0) {
			return true;
		} else {
			result = isOdd();
			return result;
		}
	}
	
	private boolean isOdd() {
		return false;
	}
	
	boolean isPrime() {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	String printCount() {
		String contagemCrescente = "";
		
		for (int i = 0; i < n; i++) {
			contagemCrescente += i + ", ";
		}
		
		contagemCrescente += n;
		
		return contagemCrescente;
	}
	
	String printReverseCount() {
		String contagemDecrescente = "";
		
		for (int i = 1; n >= i; n--) {
			contagemDecrescente += n + ", ";
		}
		
		contagemDecrescente += 0;
		
		return contagemDecrescente;
	}
	
}
