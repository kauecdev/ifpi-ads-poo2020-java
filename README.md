# Exercícios da disciplina de Programação Orientada a Objetos
## Professor: Ely Miranda | IFPI

### Atividade 1
	
	Questão 1 - `javac` é o comando usado para compilar um arquivo .java, já o comando para executar o 
	bytecode (arquivo .class) criado a partir do comando `javac`, é simplesmente `java`.
	
	Questão 2 - A saída será um erro, pois como a variável `contador` não foi inicializada, não podemos
	printar um valor que não existe, muito menos incrementá-lo.
	
	Questão 3 - São iniciadas duas variáveis, `a` e `b`, sendo `a = 9` e `b = 0`. Na expressão condicional,
	será testada uma condição que depende que suas duas partes sejam verdadeiras. A primeira de cara, já
	resultará em um `false`, que irá fazer com que o compilador ignore a outra parte da condicional, fazendo
	cair direto na expressão `else`, que irá printar o resultado de `a - b`, que será 9. No entanto, caso
	ambas as partes resultassem em `true`, fazendo com que a instrução do if inicial fosse executada, o
	resultado também seria 9, pois a variável `b` já teria sido incrementada no momento de sua verificação,
	o que acarretaria em `a * b == 9 * 1`, cujo resultado seria 9.
	
	Questão 4 - A saída será o valor de `op` printado 3 vezes. Isso ocorre porque está faltando o comando
	`break` ao final de cada teste `case`. Sendo assim, todos os comandos `case` serão executados, já
	que não há algo o dizendo para parar (comando `break`).
	
	Questão 9 - Para as três perguntas, a resposta é a abordagem das questões 7 e 8.