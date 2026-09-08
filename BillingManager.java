// breaking down the methods into smaller units of method
// unit testable programming
// unit test-testing the smallest piece/unit of code
// test case-postive ,negative,and edge case
// every test method-aming convention





public class BillingManager {
    // method to generate bill from the order information that is recieved
    public void generateBill(Order order){
        // write logic here

        // get the order total
        var orderTotal=getOrderTotal(order);

        // check if there is any discount
        double discount=getOrderDiscount(order);

        double finalOrderTotal=calculateOrderTotal(orderTotal,discount);

        // get gst amount-logic to calculate gst
        double gstAmount=calculateGST(orderTotal);

        // get the cess
        double cessAmount=calculateCess(orderTotal);

        // calculate final bill amount
        double finalBillAmount=calculateFinalBillAmount(orderTotal,discount,gstAmount,cessAmount);

        // display the final bill
        displayFinalBill(order,discount,gstAmount,cessAmount,finalBillAmount);
    }


    // method is implementing the logic to get order total from order class

    protected  double getOrderTotal(Order order){
        double orderTotal=0.0;
        orderTotal=order.getTotalOrderValue();

        return orderTotal;
    }

     protected double getOrderDiscount(Order order){
        double discount=0.0;
        if(order.getCustomer() instanceof  RegisteredCustomer){
            var registeredCustomer=(RegisteredCustomer)order.getCustomer();
            discount=registeredCustomer.getMembership().getDiscount();
        }
        return discount;
    }


    protected  double calculateOrderTotal(double orderTotal,double  discount){
        double finalOrderTotal=0.0;
        finalOrderTotal=orderTotal-(orderTotal*discount/100);

        return finalOrderTotal;
    }


    protected double calculateGST(double finalOrderTotal){
        double gstAmount=0.0;
        // ideally we will have different slab

        if(finalOrderTotal>0 && finalOrderTotal<=1000){
            gstAmount=finalOrderTotal*5/100;
        }else if(finalOrderTotal>1000 && finalOrderTotal<=2500){
            gstAmount=finalOrderTotal*12/100;
        }else{
            gstAmount=finalOrderTotal*18/100;
        }
        return gstAmount;
    }

    protected double calculateCess(double finalOrderTotal){
        double cessAmount=0.0;
        // flat 2% 
        cessAmount=finalOrderTotal*2/100;
        return cessAmount;
    }

   

    protected double calculateFinalBillAmount(double finalOrderTotal,double discount,double gstAmount,double cessAmount){
        double finalBillAmount=0.0;
        finalBillAmount=finalOrderTotal-discount+gstAmount+cessAmount;
        return finalBillAmount;
    }

    protected void displayFinalBill(Order order, double discount, double gstAmount, double cessAmount, double finalBillAmount){
        System.out.println("Order ID:"+ order.getOrderId());
        System.out.println("CustomerName:"+ order.getCustomer().getName());
        System.out.println("Items-----------");
        for(OrderItem oi:order.getorderItems()){
            System.out.println("ItemNo: "+oi.getItem().getitemNo());
            System.out.println("ItemName: "+oi.getItem().getTitle());
            System.out.println("Rate: "+oi.getItem().getRate());
        }



        System.out.println("OrderTotal:"+ order.getTotalOrderValue());
        System.out.println("GSTAmount:"+ gstAmount);
        System.out.println("CESS:"+ cessAmount);
        System.out.println("GrandTotal:" + finalBillAmount);
    }
}
