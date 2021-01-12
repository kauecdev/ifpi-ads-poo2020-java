package exercicios05;

public class Hora {

	private int hora, minutos, segundos;
	
	Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void getHorario() {
		System.out.printf("\n%d:%d:%d", hora, minutos, segundos);
	}
	
	
}
