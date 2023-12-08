package application;

import entities.entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        //declarar um novo objeto do tipo order. e vou chamar o metodo construtor. obs o atributo enum OrderStatus vou chamar com ponto e depois vou escolher o estado do pedido.
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //instanciar um objeto do tipo OrderStatus os1 com o valor nesse caso de Delivered. .
        OrderStatus os1 = OrderStatus.DELIVERED;
        //ou entao posso instanciar um outro objeto do tipo OrderStatus os2, e uso pra isso o medoto valueOf e passo a string com nome do status, nesse caso é o Delivered.
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }

}
