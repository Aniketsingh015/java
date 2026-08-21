import java.util.ArrayList;
import java.util.List;

class Company{
    private String name;

    // early initialization
    // private List<Item> items=new ArrayList<Item>();

    private List<Item> items;

    public void setName(String Name){//setters
        this.name=name;
    }

    public String getName(){//getters
        return this.name;
    }

    public List<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public Company(String Name){
        this.name=name;
        this.items=new ArrayList<Item>();
    }
}