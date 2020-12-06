package exercicios1;

public class DecimalNumber {
	double number;
	
	int exibeParteInteira() {
		return (int) number;
	}
	
	double exibeParteDecimal() {
		return number - (int) number;
	}

}
