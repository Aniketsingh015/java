import java.util.*;

class Customer{
    private int customerId;
    private String Name;

    private List<Order>orders;

    public int getCustomerId(){
        return this.customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

 // getter and setter for list of orders
    public List<Order> getOrders(){
        return this.orders;
    }

    public void setOrders(Order order){
        this.orders.add(order);
    }

    // consturctor
    public Customer(){
        // initializing the list
        this .orders=new ArrayList<>();
    }

}


class registeredCustomer extends Customer{
private double discount;

public double getDiscount(){
        return this.discount;
    }
 public void setDiscount(double discount){
        this.discount=discount;
    }


}