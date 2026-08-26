
//here we have added item has a relation uni, customer has a uni

import java.util.ArrayList;
import java.util.List;

class Company{
    private String name;

    // early initialization
    // private List<Item> items=new ArrayList<Item>();

    private List<Item> items;

    // customer collection has a relation

    private List<Customer>customers;


//setters and getters for name
    public void setName(String Name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }


    // gtter and setters for item
    public List<Item> getItems(){
        return this.items;
    }
    public void addItem(Item item){
        this.items.add(item);
    }


    // getter setter for customer
    public List<Customer> getCustomer(){
        return this.customers;
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }


    public Company(String Name){
        this.name=name;

        //item initialize
        this.items=new ArrayList<Item>();

        //customer initialize
        this.customers=new ArrayList<Customer>();
    }


    // functional Mthods

    public double getTotalOrderValue(){
        double totalOrderValue =0.0;
        
        for(Customer customer:this.customers){//first go inside single customer
            for(Order order:customer.getOrders()){//then go to the order of that customer
                for(OrderItem orderItem:order.getorderItems()){//then go to the order item for that customer
                    if(customer instanceof RegisteredCustomer){//here we are checking if the customer is registered or not
                        RegisteredCustomer rc=(RegisteredCustomer)customer;//here we are type casting customer to registered customer so that we can access the discount method of registered customer
                        double discount=rc.getDiscount();//here we are getting the discount of the registered customer
                        totalOrderValue+=orderItem.getQuantity() * orderItem.getItem().getrate()*((1-discount)/100);
                    }else{
                    totalOrderValue+=orderItem.getQuantity() * orderItem.getItem().getrate();//this is the formula so acccording to 
                    // getting inside think of formula then get inside and think every function is there or no
                }
            }
            }
        }
        return totalOrderValue;
        
    }
    
}