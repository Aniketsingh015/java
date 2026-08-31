// we have to get the report for the total order value

/* requirement 2 
now the platinume customer has to pay fees of 20,000 one time and will get 20% discount on each order
now the gold customer has to pay fees of 10,000 one time and will get 10% discount on each order
now the silver customer has to pay fees of 5,000 one time and will get 5% discount on each order
*/
public class main {
    public static void main(String[] args) {
        var company=new Company("Shopper Stop");
        company.setName("Shhopper Stop");
        System.out.println(company.getName());

        // company decides to purchase items for store
        // shirt,pant and shoes

        var shirt=new Item(1,"AllenSolly",2000);
        var pant=new Item(2,"Levis",3000);
        var shoes=new Item(2,"nike",5000);

        // company purchased and added items it will go with company and item relationship
        company.addItem(shirt);
        company.addItem(pant);
        company.addItem(shoes);

        //check the items that have been added
        for(Item item:company.getItems()){
            System.out.println(item.getTitle()+"-"+item.getRate());
        }

        // regular customer walked in for buying things from shop

        var regularCustomer=new Customer("Saksham");

        // Regular customer wants to buy 2 pants and 4 shirts from stores
        var orderItem1=new OrderItem();
        orderItem1.setItem(shirt);
        orderItem1.setQuantity(4);
        var orderItem2=new OrderItem();
        orderItem2.setItem(pant);
        orderItem2.setQuantity(2);


        // regular customer walks to the billing counter to place order
        var regularOrder=new Order();
        regularOrder.setorderId(1);
        // who is buying saksham
        regularOrder.setCustomer(regularCustomer);

        regularOrder.addOrderItem(orderItem1);
        regularOrder.addOrderItem(orderItem2);

        // the regular customer made the payment and order was handed over
        regularCustomer.addOrders(regularOrder);

        // transaction is complete now i add customer to company

        company.addCustomer(regularCustomer);
         System.out.println(company.getTotalOrderValue()+"this is the total order value of the company");


// --------------------------------------

// register customer walks into the store to buy some items from the store.thy are entitled for dicount
        var registeredCustomer=new RegisteredCustomer("Siddhant");
        registeredCustomer.setName("Siddhant");
        registeredCustomer.setDiscount(10);// here we are setting the discount for the registered customer
    //registered customer wants to buy two pants and 2 shirt
    registeredCustomer.setFees(10000.0);
    registeredCustomer.setmembershipType("gold");
       var orderItem3=new OrderItem();
         orderItem3.setItem(shirt);
            orderItem3.setQuantity(2);
        var orderItem4=new OrderItem();
        orderItem4.setItem(pant);
        orderItem4.setQuantity(2);


        // registered customer walks towards the billing counter
        var registerOrder=new Order();
        registerOrder.setorderId(2);
        registerOrder.setCustomer(registeredCustomer);

        registerOrder.addOrderItem(orderItem3);
        registerOrder.addOrderItem(orderItem4);
// now payment is done and order is handed over to the registered customer
        registeredCustomer.addOrders(registerOrder);
        company.addCustomer(registeredCustomer);




        System.out.println(company.getTotalOrderValue()+"this is the total order value of the company");
    }
}
