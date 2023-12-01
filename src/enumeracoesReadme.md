/*
enumeracoes:
é um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas.. por exemplo estados de um pedido.
podemos chamar tb de tipo enumerado. 
palavra chave é emun.
ele dá uma melhor semantica, e um codigo mais legivel, e ainda auxiliado pelo compilador.
ver documentacao site oracle docs enum.
*exemplo: os pedidos tem um ciclo de vida: 
PENDINGPAYMENT
PROCESSING
SHIPPED
DELIVERED
**para representar os estados do pedido acima, podemos usar o tipo enumerado.
segue:
public enum OrderStatus {
PENDING_PAYMENT,
PROCESSING,
SHIPPED,
DELIVERED;
}
obs. entao posso declarar uma outra classe chamada Pedido, e dentro dela um atributo chamado status do tipo OrderStatus.
fica assim:
public class Order {
private Integer id;
private Date moment;
private OrderStatus status;
}


obs. como converter de String para enum:
basta usar o metodo valueOf()
OrderStatus os1 = OrderStatus.DELIVERED;
OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
*/

