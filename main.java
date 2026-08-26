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


        System.out.println(company.getTotalOrderValue()+"this is the total order value of the company");
    }
}
