package exercicios09.geometria;

public class Retangulo extends FiguraGeometrica {
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
}
