package exercicios07.calculadora;

public class Calculadora {

	public double soma(double op1, double op2) {
		return op1 + op2;
	}
	
    public int soma(int op1, int op2) {
        return (int) (soma(Double.valueOf(op1), Double.valueOf(op2)));
    }

	public String soma(String op1, String op2) {
	    int op1Int = Integer.parseInt(op1);
	    int op2Int = Integer.parseInt(op2);
	    return String.valueOf(soma(op1Int, op2Int));
	}
	
	public double divisao(double op1, double op2) {
		return op1 / op2;
	}


}
