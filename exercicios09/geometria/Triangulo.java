package exercicios09.geometria;

public class Triangulo extends FiguraGeometrica {
	private double tamanhoBase;
	private double tamanhoAltura;
	private double tamanhoLadoA, tamanhoLadoB, tamanhoLadoC;
	
	Triangulo() {
		
	}
	
	Triangulo(double tamanhoBase, double tamanhoAltura) {
		this.tamanhoBase = tamanhoBase;
		this.tamanhoAltura = tamanhoAltura;
	}
	
	Triangulo(double tamanhoLadoA, double tamanhoLadoB, double tamanhoLadoC) {
		this.tamanhoLadoA = tamanhoLadoA;
		this.tamanhoLadoB = tamanhoLadoB;
		this.tamanhoLadoC = tamanhoLadoC;
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
	
	public double getTamanhoLadoA() {
		return tamanhoLadoA;
	}
	
	public void setTamanhoLadoA(double tamanhoLadoA) {
		this.tamanhoLadoA = tamanhoLadoA;
	}
	
	public double getTamanhoLadoB() {
		return tamanhoLadoB;
	}
	
	public void setTamanhoLadoB(double tamanhoLadoB) {
		this.tamanhoLadoB = tamanhoLadoB;
	}
	
	public double getTamanhoLadoC() {
		return tamanhoLadoC;
	}
	
	public void setTamanhoLadoC(double tamanhoLadoC) {
		this.tamanhoLadoC = tamanhoLadoC;
	}

	@Override
	public double calculaArea() {
		return (tamanhoBase * tamanhoAltura) / 2; 
	}

	@Override
	public double calculaPerimetro() {
		return tamanhoLadoA + tamanhoLadoB + tamanhoLadoC;
	}
	
}
