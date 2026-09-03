public class MembershipFactory {
    public Membership getMembership(String membershipType){

        if(membershipType.equalsIgnoreCase("Platinum")){
            Membership platinumMembership=new Membership();
            platinumMembership.setmembershipType("Platinum");
            platinumMembership.setFees(20000);
            platinumMembership.setDiscount(20);
            return platinumMembership;
        }else if(membershipType.equalsIgnoreCase("Gold")){
            Membership goldMembership=new Membership();
            goldMembership.setmembershipType("Gold");
            goldMembership.setFees(10000);
            goldMembership.setDiscount(10);
            return goldMembership;
        }else if(membershipType.equalsIgnoreCase("Silver")){
            Membership silverMembership=new Membership();
            silverMembership.setmembershipType("Silver");
            silverMembership.setFees(5000);
            silverMembership.setDiscount(5);
            return silverMembership;
        }
        return null;
    }
}
