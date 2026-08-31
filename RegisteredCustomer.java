
public class RegisteredCustomer extends Customer{

public RegisteredCustomer(String Name) {
        super(Name);
        //TODO Auto-generated constructor stub
    }
private double discount;
private double fees;
private String membershipType;

public double getDiscount(){
        return this.discount;
    }
 public void setDiscount(double discount){
        this.discount=discount;
    }

    public double getFees(){
        return this.fees;
    }
 public void setFees(double fees){
        this.fees=fees;
    }


    public String getmembershipType(){
        return this.membershipType;
    }
 public void setmembershipType(String membershipType){
        this.membershipType=membershipType;
    }


    // functional method
    @Override
    public double getTotalOrderValue(){
        // here logic with discount
        double totalOrderValue =0.0;
        
            for(Order order:this.getOrders()){//then go to the order of that customer
                
                    
                        double discount=this.getDiscount();//here we are getting the discount of the registered customer
                        totalOrderValue+=order.getTotalOrderValue()*((1-discount)/100);
                    }
            
            
        

        return totalOrderValue;
    }
}
        




