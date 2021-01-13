package exercicios06;

public class TesteVeiculos {
	public static void main() {
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		CarroEletrico carroEletrico = new CarroEletrico();
		
		veiculo.placa = "ERA3D21";
		veiculo.ano = 2012;
		
		carro.placa = "DRA3E12";
		carro.ano = 2014;
		carro.modelo = "Voyage";
		
		carroEletrico.placa = "XST4G56";
		carroEletrico.ano = 2020;
		carroEletrico.modelo = "Renault Zoe";
		carroEletrico.autonomiaBateria = 300;
	}
}
