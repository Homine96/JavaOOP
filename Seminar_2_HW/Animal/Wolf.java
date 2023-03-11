package Seminar_2_HW.Animal;

import Seminar_2_HW.Abstract.WildAnimal;

public class Wolf extends WildAnimal {

    private String leader;

    public Wolf(int height, int weight, String eyeColor, String habitat, String dateoflocation, String leader) {
        super(height, weight, eyeColor, habitat, dateoflocation);
        this.leader = leader;
    }

    @Override
    public void makeSound() {
        System.out.println("Auuuuuuu");;
    }

    public String getInfo() {
        return String.format("%s Leader: %s  ",
                super.getInfo(), this.leader);
    }
    
}
