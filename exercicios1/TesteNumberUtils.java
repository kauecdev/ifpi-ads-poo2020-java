package exercicios1;

public class TesteNumberUtils {

	public static void main(String[] args) {
		
		NumberUtils numberUtils = new NumberUtils();
		
		int numero;
		boolean ehPar, ehPrimo;
		String ordemCrescente, ordemDecrescente; 
		
		numero = numberUtils.n = 23;
		ehPar = numberUtils.isPair();
		ehPrimo = numberUtils.isPrime();
		ordemCrescente = numberUtils.printCount();
		ordemDecrescente = numberUtils.printReverseCount();
			
		System.out.println("O número " + numero + " é par? " + ehPar);
		System.out.println("O número " + numero + " é primo? " + ehPrimo);
		System.out.println("Números crescentes até o número " + numero + ": " + ordemCrescente);
		System.out.println("Números decrescentes a partir do número " + numero + ": " + ordemDecrescente);

	}

}
