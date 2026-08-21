public class item {
    private int itemNo;
    private String title;
    private double rate;


    public int getitemNo(){
        return this.itemNo;
    }

    public void setitemNo(int itemNo){
        this.itemNo=itemNo;
    }

    public String title(){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public double getrate(){
        return this.rate;
    }

    public void setrate(double rate){
        this.rate=rate;
    }


    // constructor
    public item(int itemNo,String title,double rate){
        this.itemNo=itemNo;
        this.title=title;
        this.rate=rate;

    }
}
