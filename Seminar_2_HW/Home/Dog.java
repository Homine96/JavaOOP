package Seminar_2_HW.Home;

import Seminar_2_HW.Abstract.HomeAnimal;
import Seminar_2_HW.Interface.Train;

public class Dog extends HomeAnimal implements Train {

    private String training;

    public Dog(int height, int weight, String eyeColor, String name, String breed, String vaccine, String colorwool,
            String date, String training) {
        super(height, weight, eyeColor, name, breed, vaccine, colorwool, date);
        this.training = training;
    }

        
    public String getInfo() {
        return String.format(" %s Training: %s ",
                super.getInfo(), this.training );
    }

    @Override
    public void showAffection() {
        System.out.println("Проявляю ласку");;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");;
    }

    @Override
    public void train() {
        System.out.println("Начинаем дрессировку!");;
    }
    
}
