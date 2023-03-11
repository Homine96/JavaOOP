package Seminar_2_HW.Abstract;

public abstract class  WildAnimal extends Animal {

    private String habitat;
    private String dateoflocation;

    public WildAnimal(int height, int weight, String eyeColor, String habitat, String dateoflocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateoflocation = dateoflocation;
    }
    
    public String getInfo() {
        return String.format("%s Habitat: %s  DateOfLocation: %s  ",
                super.getInfo(), this.habitat, this.dateoflocation);
    }
}