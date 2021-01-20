# Exercícios da disciplina de Programação Orientada a Objetos
## Professor: Ely Miranda | IFPI

### Atividade 07

Questão 04 -
	a) Uma solução seria fazer o cast: `((Bovino) a).setProducaoLeite(5);`
	b) Não. A relação de herança somente ocorre de cima para baixo, ou seja, de pai para filho.
	
Questão 05 - 
	c) Porque todas as classes filhas herdam de `Animal`, consequentemente, além de terem seu próprio tipo, elas também são Animais (da classe `Animal`).
	
Questão 11 - <br>
	a) V <br>
	b) F <br>
	c) V <br>
	d) V <br>
 	e) V <br>
 	
Questão 12 - A saída será: `metodo 1, classe B`

Questão 13 - O código não executará devido a um erro, pois apesar da forma como o objeto está sendo instanciado, o método 1 só funcionou por ser uma sobrescrita do método da classe `A`.

Questão 14 - A saída será: `metodo 1, classe A`

Questão 16 - Nesse código, ele está tentando sobrescrever um método na própria classe em que ela foi criada. Isso só seria possível caso ele mudasse os parâmetros do método ou o tipo de retorno, técnica essa conhecida como sobrecarga de método.

Questão 17 - O problema ocorre porque apesar de o tipo de retorno ter sido alterado, o tipos dos parâmetros continuam iguais. O ideal seria substituir ambos por double ou ao menos um.
