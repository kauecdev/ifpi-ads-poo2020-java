package exercicios09.geometriaComInterface;

public class Quadrado implements FiguraGeometrica, Comparavel {
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

	@Override
	public int comparar(FiguraGeometrica f) {
		if (f.calculaArea() > this.calculaArea()) {
			return -1;
		} else if (f.calculaArea() == this.calculaArea()) {
			return 0;
		} else {
			return 1;
		}
	}
}
