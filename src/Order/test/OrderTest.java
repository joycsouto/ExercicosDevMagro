package Order.test;

import Order.service.Order;

public class OrderTest {
    public static void main(String[] args) {
            Order order =  new Order();
            order.collectingDataClient();
            order.orderData();
    }
}
