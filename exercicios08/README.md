# Exercícios da disciplina de Programação Orientada a Objetos
## Professor: Ely Miranda | IFPI

### Atividade 08

Questão 06 - Sim, também está validado. O método `transferir` faz a chamado dos métodos `sacar` e `depositar` que acabamos de fazer a refatoração para deixá-los mais robustos, consequentemente, o próprio método `trasnferir`, também ganhou essa robustez.

Questão 10 - O código não funciona. Apresentará uma mensagem de erro: "Unreachable catch block for InputMismatchException. It is already handled by the catch block for Exception". Isso acontece pois caso o TipoExcecao1 seja uma classe mais genérica, ou seja, uma superclasse de TipoExcecao2, ela já irá tratar o erro de TipoExcecao2.

Questão 11 - Dentro do primeiro bloco `try`, é lançado uma exceção do tipo `RuntimeException`, que é justamente o tipo de exceção capturada na parte `catch` que complementa esse primeiro bloco `try`. Em seguida, como instruções do bloco `catch`, um novo `try` é iniciado, onde ocorrerá o mesmo processo de antes: uma exceção do tipo `Runtime Exception` é lançada, e capturada pelo seu complementar `catch`. Porém, nesse segundo bloco `catch`, é feito um print da string `A`, e retorna às instruções do primeiro bloco `catch`, onde após a sentença `try catch`, é feito um segundo print, desta vez da string `B`. Por fim, fora da primeira sentença `try catch`, é executado um último print, desta vez da string `C`, finalizando o código.

Questão 12 - <br>
a) A <strong>primeira alternativa</strong> nos fala para desconsiderar a operação usando `if`, mas o problema é que não teremos certeza do resultado ter sido bem sucedido ou não. Na <strong>segunda alternativa</strong>, temos a opção de exibir uma mensagem de erro, porém ao fazer a mudança de cenário de execução de código (interface gráfica ou linha de comando), teríamos problemas com a exibição dessa mensagem. Por fim, temos a <strong>terceira alternativa</strong> que nos sugere retornar um código de erro, que também apresenta falhas como por exemplo: sempre teríamos que testar o retorno para saber o que houve na execução dos métodos, além de acabar tendo que separar valores para identificar os tipos de erros, que é considerado uma má prática e também não é nenhum pouco intuitivo, o que provavelmente nos custaria tempo para poder gerar uma documentação sobre isso para facilitar o entendimento.<br><br>
b) O uso de exceções melhora a forma como erros são tratados e também lida com comportamentos que fariam a aplicação falhar por completo, tornando a aplicação mais robusta. Além disso, faz com que blocos de erros não fiquem visíveis para o usuário, dificultando sua compreensão de o que pode ter acontecido.<br><br>
c) Sim. Porque caso utilizemos uma exceção para ser lançado no caso de um comportamento indevido nos nosso métodos, ela é lançada e o resto das instruções do método não serão executadas, tirando assim a necessidade de um `else`. Um exemplo é facilmente ilustrado à seguir:<br>
<code>
if (contaCredito == null || contaDebito == null) {<br>
			throw new AplicacaoException("As duas contas devem existir.");<br>
		}<br>
</code>
Aqui, caso uma das contas buscadas não seja encontrada, o código lançará uma exceção, fazendo com que o restante do método não seja executado. Mas caso ambas sejam encontradas, ele não cairá no if e seguirá o fluxo normalmente.
