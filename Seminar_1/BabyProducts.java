package Seminar_1;

public class BabyProducts extends Product {
    protected int minage;
    protected String gipoallerg;
    public BabyProducts(String name, int price, int quantity, String units, int minage, String gipoallerg) {
        super(name, price, quantity, units);
        this.minage=minage;
        this.gipoallerg=gipoallerg;
    }
    
}

class Diapers extends BabyProducts{

    private int size;
    private int minheight;
    private int maxheight;
    private String type;

    
    
    public Diapers(String name, int price, int quantity, String units, int minage, String gipoallerg,int size, int minheight, int maxheight, String type) {
        super(name, price, quantity, units, minage, gipoallerg);
        this.size=size;
        this.minheight=minheight;
        this.maxheight=maxheight;
        this.type=type;
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s MinAge: %d GipoAllerg: %s Size: %d MinHeight: %d MaxHeight: %d Type: %s",
                this.name, this.price, this.quantity, this.units, this.minage,this.gipoallerg,this.size, this.minheight, this.maxheight, this.type);
    }
    
}

class Soother extends BabyProducts{

    public Soother(String name, int price, int quantity, String units, int minage, String gipoallerg) {
        super(name, price, quantity, units, minage, gipoallerg);
    }

    public String getInfo() {
        return String.format("Name: %s  Price: %d  Quantity: %d Units: %s MinAge: %d GipoAllerg: %s",
                this.name, this.price, this.quantity, this.units, this.minage,this.gipoallerg);
    }
    
}
