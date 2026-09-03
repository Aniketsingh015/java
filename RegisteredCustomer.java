
public class RegisteredCustomer extends Customer{

    // registered customer has a relationship-one registered cust has 1 membership.unidirectional
    private Membership membership;


public RegisteredCustomer(String Name) {
        super(Name);
    }

//     private  Membership membership;
// private double discount;
// private double fees;
// private String membershipType;

public Membership getMembership(){
        return this.membership;
    }
 public void setmembership(Membership membership){
        this.membership=membership;
    }

// public double getDiscount(){
//         return this.discount;
//     }
//  public void setDiscount(double discount){
//         this.discount=discount;
//     }

//     public double getFees(){
//         return this.fees;
//     }
//  public void setFees(double fees){
//         this.fees=fees;
//     }


//     public String getmembershipType(){
//         return this.membershipType;
//     }
//  public void setmembershipType(String membershipType){
//         this.membershipType=membershipType;
//     }


    // functional method
    @Override
    public double getTotalOrderValue(){
        // here logic with discount
        double totalOrderValue =0.0;
        
            for(Order order:this.getOrders()){//then go to the order of that customer
                
                    
                        double discount=this.membership.getDiscount();//here we are getting the discount of the registered customer
                        totalOrderValue+=order.getTotalOrderValue()*((1-discount)/100);
                    }
            
            
        

        return totalOrderValue;
    }
}
        




