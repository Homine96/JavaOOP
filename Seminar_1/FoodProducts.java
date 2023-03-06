package Seminar_1;



public class FoodProducts extends Product {

    public FoodProducts(String name, int price, int quantity, String units, int shelflife) {
        super(name, price, quantity, units);
        this.shelflife=shelflife;
    }
    protected int shelflife;



}

class Bread extends FoodProducts {
    public Bread(String name, int price, int quantity, String units, int shelflife, String typem) {
        super(name, price, quantity, units, shelflife);
        this.typem=typem;
        //TODO Auto-generated constructor stub
    }

    protected String typem;

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s Shelflife: %d Typem: %s",
                this.name, this.price, this.quantity, this.units, this.shelflife,this.typem);
    }
}


class Eggs extends FoodProducts{

    private int quantity2;

    public Eggs(String name, int price, int quantity, String units, int shelflife, int quantity2) {
        super(name, price, quantity, units, shelflife);
        this.quantity2=quantity2;
        //TODO Auto-generated constructor stub
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s Shelflife: %d Quantity2: %s",
                this.name, this.price, this.quantity, this.units, this.shelflife,this.quantity2);
    }

    

}
