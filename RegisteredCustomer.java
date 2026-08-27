
public class RegisteredCustomer extends Customer{

public RegisteredCustomer(String Name) {
        super(Name);
        //TODO Auto-generated constructor stub
    }
private double discount;

public double getDiscount(){
        return this.discount;
    }
 public void setDiscount(double discount){
        this.discount=discount;
    }


    // functional method
    @Override
    public double getTotalOrderValue(){
        // here logic with discount
        double totalOrderValue =0.0;

        return 0.0;
    }
        


}

