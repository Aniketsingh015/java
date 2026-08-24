import java.util.*;
// here we have added customer has a relation of one ,and order item has a relationship of many

public class Order {
    private int orderId;
    private Customer customer;

    private List<OrderItem>orderItems;

    public int getOrderId(){
        return this.orderId=orderId;
    }

    public void setorderId(int orderId){
        this.orderId=orderId;
    }

    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }

    public List<OrderItem> getorderItems(){
        return this.orderItems;
    }

    public void addOrderItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    public Order(){
        this.orderItems=new ArrayList<OrderItem>();
    }
}
