import java.util.*;

//here we have added order as has a bidirectional and registered customer is a relation

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

    public void addOrders(Order order){
        this.orders.add(order);
    }

    // consturctor
    public Customer(String Name){
        // initializing the list
        this .orders=new ArrayList<Order>();
    }

}



