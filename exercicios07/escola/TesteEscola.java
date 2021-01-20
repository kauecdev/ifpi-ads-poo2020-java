package exercicios07.escola;

public class TesteEscola {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		Professor professor = new Professor();
		
		pessoa.setNome("Kauê");
		pessoa.setSobrenome("Cavalcante");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getNomeCompleto());
		
		funcionario.setNome("Johny");
		funcionario.setSobrenome("Den");
		funcionario.setMatricula(1);
		funcionario.setSalario(1200);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSobrenome());
		System.out.println(funcionario.getNomeCompleto());
		System.out.println(funcionario.getMatricula());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getSalarioPrimeiraParcela());
		System.out.println(funcionario.getSalarioSegundaParcela());
		
		professor.setNome("Svalak");
		professor.setSobrenome("Tendrosnov");
		professor.setMatricula(2);
		professor.setSalario(18000);
		professor.setTitulacao("Doutor");
		
		System.out.println(professor.getNome());
		System.out.println(professor.getSobrenome());
		System.out.println(professor.getNomeCompleto());
		System.out.println(professor.getMatricula());
		System.out.println(professor.getSalario());
		System.out.println(professor.getTitulacao());
		System.out.println(professor.getSalarioPrimeiraParcela());
		System.out.println(professor.getSalarioSegundaParcela());
	}

}
