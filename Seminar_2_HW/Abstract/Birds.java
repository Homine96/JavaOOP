package Seminar_2_HW.Abstract;

public abstract class Birds extends Animal {

    protected int h;

    public Birds(int height, int weight, String eyeColor, int h) {
        super(height, weight, eyeColor);
        this.h = h;
        
    }

    public String getInfo() {
        return String.format("%s Высота полета: %d  ",
                super.getInfo(), this.h);
    }

    public abstract void fly();
    
}
