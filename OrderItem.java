public class OrderItem {
    private Item item;
    private int quantity;


    public Item getItem(){
        return this.item;
    }
    public void setItem(Item item){
        this.item=item;
    }


    public int  getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
