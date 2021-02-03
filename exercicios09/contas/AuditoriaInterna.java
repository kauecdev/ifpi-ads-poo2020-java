package exercicios09.contas;

import java.util.ArrayList;

public class AuditoriaInterna {
	ArrayList<Tributavel> listTributaveis = new ArrayList<Tributavel>();
	
	public void adicionar(Tributavel tributavel) {
		this.listTributaveis.add(tributavel);
	}
	
	public double calcularTributos() {
		double totalTributos = 0;
			
		for (int i = 0; i < listTributaveis.size(); i++) {
			totalTributos += listTributaveis.get(i).calculaTributos();
		}
		
		return totalTributos;
	}
}
