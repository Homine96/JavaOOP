package Seminar_1;

public class Product {
    
    protected String name;
    protected int price;
    protected int quantity;
    protected String units;


    public Product( String name, int price, int quantity, String units){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.units=units;
    }
    //getters
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getUnits(){
        return this.units;
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s",
                this.name, this.price, this.quantity, this.units);
    }

    //setters

    public void setName(String name){
        this.name=name;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setUnits(String units){
        this.units=units;
    }
}
