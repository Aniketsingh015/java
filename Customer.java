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


    // functional methods
     
    public double getTotalOrderValue(){
        // here logic without discount
        double totalOrderValue =0.0;
            for(Order order:this.getOrders()){//then go to the order of that customer. in this we dont have to itterate over customer as we are getting about which customer we are talking about
                for(OrderItem orderItem:order.getorderItems()){//then go to the order item for that customer
                    
                    totalOrderValue+=orderItem.getQuantity() * orderItem.getItem().getrate();//this is the formula so acccording to 
                    // getting inside think of formula then get inside and think every function is there or no
                }
            }
            
        

        return totalOrderValue;
    }
        

}



