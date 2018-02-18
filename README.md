
**Linguagem utilizada: Java**

Java é uma linguagem fortemente tipada e para operações lógicas e aritméticas, são indicadas esse tipo de linguagem, pois costumam ter um desempenho melhor que linguagens fracamente tipadas, como JavaScript, por exemplo.


Para resolução desse desafio foi utilizado:

 - IDE Intellij Idea
 - JDK 8
 - JUnit 4
 

**Sobre a solução**

Criei a classe `HellsTriangle` que possui o método `maximumTotal`, que por sua vez recebe o triângulo numérico e exibe na saída o total máximo 

 - Exemplo de entrada: *[[6],[3,5],[9,7,1],[4,6,8,4]]*
 - Exemplo de Saída: *6 + 5 + 7 + 8 = 26*


**Testes**

Para criação dos testes utilizei o Framewrok JUnit, um framework open-source ideal para testes unitários. Utilizei essa abordagem por ser mais apropriada para testes de unidade e por ser mais elegante.

OS códigos que executam os testes estão isolados na classe `HellsTriangleTest`.


**Execução**
 - Para executar a solução, pode ser utilizada qualquer ferramenta de compilação Java online, como o [jdoodle](https://www.jdoodle.com/online-java-compiler), por exemplo (Nesse caso basta colocar o código da classe HellsTriange na ferramenta).
 - Outra forma de executar é utilizar o eclipse, Intellij Idea ou qualquer outra IDE Java, para isso basta ter o Java instalado na máquina e importar o projeto.


**OBS**

 - O método `maximumTotal` valida se o triângulo não é nulo, caso seja, o usuário recebe a mensagem: *"Could not perform operation: Triangle is invalid or null"*
 - O primeiro elemento do triangulo é recuperado antes de iniciar as iterações, fiz dessa forma pois não há necessidade de iterar para pegar o primeiro elemento, apenas os próximos. Outra vantagem é que caso a entrada só tenha um elemento, o código não executa nenhuma iteração sobre a estrutura. 
 - Criei variáveis auxiliares `firstIndexNextLine` e `secondIndexNextLine` que indicam quais posições da próxima linha devem ser comparadas.
 - Criei a `StringBuffer str` para ir armazenado a saída que será impressa no console ao final da execução do método, essa variável é responsável por imprimir o somatório.
 - Utilizei estruturas condicionais e breaks (pontos de interrupção) para garantir que o código não fizesse iterações desnecessárias. 
 - Todas as dependências já estão no projeto.
