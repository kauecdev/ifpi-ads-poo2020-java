package exercicios09.geometria;

public class Quadrado extends FiguraGeometrica {
	private double tamanhoLado;
	
	Quadrado() {
		
	}
	
	Quadrado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public double getTamanhoLado() {
		return tamanhoLado;
	}
	
	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	@Override
	public double calculaArea() {
		return Math.pow(tamanhoLado, 2);
	}
	
	@Override
	public double calculaPerimetro() {
		return tamanhoLado * 4;
	}
}
