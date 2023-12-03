/*
composicao:
é um tipo de associacao que permite que um objeto contenha outro.
é uma relacao 'tem-um' ou 'tem-varios'.
vantagens:
DIVISAO DE RESPONSABILIDADES-ORGANIZACAO (divide o seu sistema em responsabilidades, cada classe tem sua responsabilidade)
COESAO (cada classe tem sua responsabilidade simples e bem definida. cada objeto tem sua responsabilidade específica)
FLEXIBILIDADE (uma coisa dividida em partes é mais facil de trabalhar )
REUSO (mesmo objeto pode ser reaproveitado em mais de um lugar)

obs na uml o simbolo da composicao é o diamante preto. onde a classe que tiver do lado do diamante é o lado do todo, e o lado
que tiver a seta é o lado das partes. ela representa uma relacao todo-parte entre objetos. exemplo Order -> OrderItem, onde o diamante
preto esta no lado do Order, e a seta esta no lado do OrderItem e aqui tem o asterisco que representa muitos. ou seja uma Order
tem 1 ou mais OrderItem. ou seja 1 pedido contem 1 ou varios itens de pedido.

obs temos outro exemplo mas aqui sem diamante. ja que é Order -> Client. ou seja é uma relacao de associacao mas 
nao é uma relacao todo-parte. mas mesmo assim chamamos de uma 'composicao de objetos' na hora que vamos implementar, 
dentro do objeto Order vai ter um atributo que é do tipo Client. entao falamos que isso é uma ''composicao de objetos''.

obs temos ainda mais um caso, que é o OrderItem -> Product, ou seja um item de pedido tem um produto. ou seja o item de pedido
esta associado com o produto. 

OBS A COMPOSICAO DE OBJETOS PODE OCORRER TAMBEM COM SERVICES, E NAO SOMENTE COM ENTITIES.
ex eu tenho um OrderService -> EmailService. ou seja eu tenho um servico de pedido que esta associado com um servico de email.
ex eu tenho um AuthService -> EmailService. ou seja eu tenho um servico de autenticacao que tambem esta associado com um
servico de email.
ex esse OrderService -> OrderRepository. ou seja esse servico de pedido esta associado com um repository de pedidos. 
obs o Repository é o objeto responsável por acessar o banco de dados.
obs ou seja, vemos nos exemplos acima, que temos SERVICES que estao associados entre si. que tambem é uma forma de composicao.

*/