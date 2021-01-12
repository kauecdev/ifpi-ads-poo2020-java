package exercicios05;

public class TesteHora {

	public static void main(String[] args) {
		Hora hora = new Hora(23,59,59);
		
		hora.getHorario();
		
		hora.setHora(22);
		
		hora.getHorario();
		
		hora.setMinutos(30);
		
		hora.getHorario();
		
		hora.setSegundos(10);
		
		hora.getHorario();

	}

}
