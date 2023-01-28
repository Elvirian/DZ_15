package coffee.order;

import static coffee.order.CoffeeOrderBoard.printOrder;

public class Main {
    public static void main(String[] args) {
        coffee.order.CoffeeOrderBoard orderBoard = new coffee.order.CoffeeOrderBoard();
        orderBoard.add("Coffee1");
        orderBoard.add("Coffee2");
        orderBoard.add("Coffee3");

        System.out.println("Список заказов : ");
        printOrder(orderBoard);
        System.out.println();

        System.out.println("Список заказов : ");
        System.out.println(orderBoard.deliver());

        System.out.println("Список заказов : ");
        printOrder(orderBoard);
        System.out.println();

        System.out.println("Новые заказы orderList : ");
        orderBoard.add("Coffee4");
        orderBoard.add("Coffee5");

        System.out.println("Список заказов : ");
        printOrder(orderBoard);
        System.out.println();

        System.out.println("Удаление заказов : ");
        System.out.println((orderBoard.deliver(2)));
        System.out.println((orderBoard.deliver(8)));

        System.out.println("Список заказов : ");
        printOrder(orderBoard);
        System.out.println();

        System.out.println("Оформление orderList : ");
        orderBoard.draw();

    }

}