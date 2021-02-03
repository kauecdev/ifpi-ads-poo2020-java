package exercicios09.contas;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public double calculaTributos() {
		return 0.1 * super.getSaldo();
	}

}
