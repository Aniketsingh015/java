class Customer{
    private int customerId;
    private String Name;

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