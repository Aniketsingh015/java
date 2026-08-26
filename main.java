// we have to get the report for the total order value


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
            System.out.println(item.getTitle()+"-"+item.getrate());
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



        


        System.out.println(company.getTotalOrderValue()+"this is the total order value of the company");
    }
}
