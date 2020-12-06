package exercicios1;

public class TesteDecimalNumber {
	public static void main(String[] args) {
		DecimalNumber decimalNumber = new DecimalNumber();
		
		decimalNumber.number = 23.60;
		System.out.println(decimalNumber.exibeParteInteira());
		System.out.println(decimalNumber.exibeParteDecimal());
	}
}
