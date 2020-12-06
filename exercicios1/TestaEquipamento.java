package exercicios1;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento primeiroEquipamento = new Equipamento();
		Equipamento segundoEquipamento = new Equipamento();
		
		primeiroEquipamento.liga();
		segundoEquipamento.desliga();
		
		primeiroEquipamento.inverte();
		segundoEquipamento.inverte();
		
		if (primeiroEquipamento.estaLigado()) {
			System.out.println("Ligado.");
		} else {
			System.out.println("Desligado.");
		}
		
		if (segundoEquipamento.estaLigado()) {
			System.out.println("Ligado.");
		} else {
			System.out.println("Desligado.");
		}

	}

}
