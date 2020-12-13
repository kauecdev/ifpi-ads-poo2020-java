# Exercícios da disciplina de Programação Orientada a Objetos
## Professor: Ely Miranda | IFPI

### Atividade 2

Questão 1 - Não. A inicialização está correta, pois podemos inicializar variáveis sem atrbiuição de valores. No entanto, e neste caso em especial, a variável é na realidade, um atributo. Em Java, atributos que não são inicializados com valores são automaticamente iniciados com um valor ao serem instanciados em outra classe. Nesse caso, se instanciarmos a classe Hotel sem atribuir um valor para `quantReservas`, a própria classe se encaminha de atribuir o valor 0 à `quantReservas`. Logo, se chamarmos o método `adicionarReserva()`, o atributo passará a valer 1.

Questão 2 - Resultará em um erro de compilação, pois a classe `Hotel` não tem um método construtor que recebe um valor inteiro como parâmetro definido previamente.

Questão 3 - O programa o valor 0, pois na instrução de `System.out.println()`, estamos usando o `this` para referenciar ao atributo `a` da classe, que por não ter sido inciada, é automaticamente atribuído valor 0 à ela, diferente da variável local do método construtor que recebe `a + b` e retornaria 3.

Questão 4 - O problema está na ambiguidade que pode ocorrer. O compilador ficará confuso na hora de tentar atribuir, pois atributo e parâmetro tem o mesmo nome (`valor`). Nesse caso, o certo seria usar o `this`, para referenciar corretamente o atributo e diferenciá-lo do parâmetro. O código ficaria assim:

~~~java
void x(double valor) {
	this.valor += valor;
}
~~~

Questão 5 - O erro acontece por termos declarado explicitamente somente um método construtor, da qual necessita de um parâmetro inteiro que não passamos na instanciação do objeto Radio. Uma solução seria declar outro método construtor na classe Radio que não recebe parâmetro algum.

Questão 6 - <br/>
	a) Os dois prints irão mostrar 90.0. Isso ocorre, pois c1 e c2 estão apontando para o mesmo objeto.<br/>
	b) O garbage collector irá percorrer a memória e notará que o objeto a qual o c1 apontava, não tem mais referência e então o excluirá.