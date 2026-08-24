
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
    public void setCustomer(Customer customer){
        this.customers.add(customer);
    }


    public Company(String Name){
        this.name=name;

        //item initialize
        this.items=new ArrayList<Item>();

        //customer initialize
        this.customers=new ArrayList<Customer>();
    }
}