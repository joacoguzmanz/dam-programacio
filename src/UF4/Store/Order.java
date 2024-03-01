package UF4.Store;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItemsList;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItemsList = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItem> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public void addOrderItem(OrderItem item) {
        orderItemsList.add(item);
        System.out.println("Order item added!");
    }

    public void removeOrderItem(OrderItem item) {
        orderItemsList.remove(item);
        System.out.println("Order item removed!");
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : orderItemsList) {
            total += item.getPrice();
        }
        return total;
    }
}
