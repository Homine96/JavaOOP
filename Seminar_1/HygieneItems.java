package Seminar_1;

public class HygieneItems extends Product {

    protected int quantinpack;
    public HygieneItems(String name, int price, int quantity, String units, int quantinpack) {
        super(name, price, quantity, units);
        this.quantinpack=quantinpack;
    }
    
}

class ToiletPaper extends HygieneItems{
    private int quantlayer;
    public ToiletPaper(String name, int price, int quantity, String units, int quantinpack, int quantlayer) {
        super(name, price, quantity, units, quantinpack);
        this.quantlayer=quantlayer;
    }
    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s QuantInPack: %d QuantLayer: %d",
                this.name, this.price, this.quantity, this.units, this.quantinpack,this.quantlayer);
    } 
}

class Masks extends HygieneItems{

    public Masks(String name, int price, int quantity, String units, int quantinpack) {
        super(name, price, quantity, units, quantinpack);
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s QuantInPack: %d ",
                this.name, this.price, this.quantity, this.units, this.quantinpack);
    }
}