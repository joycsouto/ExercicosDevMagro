package EnumExercise.Order.service;

public enum OrderStatus {
    PENDING_PAYMENT ("Pending payment"),
    PROCESSING("Processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");
 String name;

    OrderStatus(String name) {
        this.name = name;
    }
}
