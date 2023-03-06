package Seminar_1;

public class Drinks extends Product{

    protected String volume;
    public Drinks(String name, int price, int quantity, String units, String volume) {
        super(name, price, quantity, units);
        this.volume=volume;
    }
    
}

class Milk extends Drinks{

    private String shelflife;
    private String percefat;
    public Milk(String name, int price, int quantity, String units, String volume, String shelflife, String percefat) {
        super(name, price, quantity, units, volume);
        this.shelflife=shelflife;
        this.percefat=percefat;

    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d  Units: %s  Volume: %s  Shelflife: %s  Percefat: %s",
                this.name, this.price, this.quantity, this.units, this.volume, this.shelflife, this.percefat);
    }

}

class Limonade extends Drinks{

    public Limonade(String name, int price, int quantity, String units, String volume) {
        super(name, price, quantity, units, volume);
        
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s  Volume: %s ",
                this.name, this.price, this.quantity, this.units, this.volume);
    }
    
}