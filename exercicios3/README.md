# Exercícios da disciplina de Programação Orientada a Objetos
## Professor: Ely Miranda | IFPI

### Atividade 3

Questão 1 - Inicialmente, é declarado um array de inteiros chamado `a` com 5 posições. Depois é feita uma iteração com uma variável `i` com valor inicial `0`, que a cada volta incrementa seu valor mais `1` enquanto seu valor for menor ou igual ao valor de `a.length`. Até aqui, não vemos nada incorreto. O problema, é o bloco de código que será executado a cada volta do loop. Nesse bloco, pegamos a posição `[i]` do array `a` e atribuímos o valor de `i`, e aí é onde está o problema. Na última volta do loop, o valor de `i` é `5`, pois `5` é o valor de `a.length`, porém, a última posição do array é `4`, já que os arrays iniciam seu index em `0`. Então, ao tentar atribuir um valor em `a[5]`, o programa irá retornar "Index 5 out of bounds for length 5", já que tentará acessar um endereço de memória inexistente.

Questão 2 - O código representa um erro de execução, mais especificamente um Null Pointer Exception. Isso ocorre pois estamos tentando atribuir um saldo para o item de posição 0 no nosso array de contas. Porém, não há nada na posição 0 (aliás, em posição nenhuma), pois apenas declaramos o array de contas, e nesse momento, eles está com todas suas posições em `null`, logo, não há como atribuir um saldo para `null`. O correto seria primeiro instanciar um novo objeto `Conta`, atribuí-lo a uma variável e atribuir essa variável à posição 0 do array de contas.

