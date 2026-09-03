public class Membership {

private  Membership membership;
private double discount;
private double fees;
private String membershipType;

public Membership getMembership(){
        return this.membership;
    }
 public void setmembership(Membership membership){
        this.membership=membership;
    }

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

}