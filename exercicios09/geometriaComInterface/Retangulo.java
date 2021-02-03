package exercicios09.geometriaComInterface;

public class Retangulo implements FiguraGeometrica, Comparavel {
	private double tamanhoBase;
	private double tamanhoAltura;
	
	Retangulo() {
		
	}
	
	Retangulo(double tamanhoBase, double tamanhoAltura) {
		this.tamanhoBase = tamanhoBase;
		this.tamanhoAltura = tamanhoAltura;
	}

	public double getTamanhoBase() {
		return tamanhoBase;
	}

	public void setTamanhoBase(double tamanhoBase) {
		this.tamanhoBase = tamanhoBase;
	}

	public double getTamanhoAltura() {
		return tamanhoAltura;
	}

	public void setTamanhoAltura(double tamanhoAltura) {
		this.tamanhoAltura = tamanhoAltura;
	}

	@Override
	public double calculaArea() {
		return tamanhoBase * tamanhoAltura;
	}

	@Override
	public double calculaPerimetro() {
		return (tamanhoBase * 2) + (tamanhoAltura * 2);
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
