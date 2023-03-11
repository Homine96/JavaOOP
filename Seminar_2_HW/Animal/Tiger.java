package Seminar_2_HW.Animal;

import Seminar_2_HW.Abstract.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(int height, int weight, String eyeColor, String habitat, String dateoflocation) {
        super(height, weight, eyeColor, habitat, dateoflocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void makeSound() {
        System.out.println("rrrrrrrrrr");;
    }
    
}
