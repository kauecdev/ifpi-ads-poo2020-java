package exercicios07.empregados;

public class TesteEmpregados {
	public static void main(String args[]) {
		Empregado empregado = new Empregado();
		Diarista diarista = new Diarista();
		Horista horista = new Horista();
		
		System.out.println(empregado.calcularSalario());
		
		System.out.println(diarista.calcularSalario());
		
		System.out.println(horista.calcularSalario());
	}
}
