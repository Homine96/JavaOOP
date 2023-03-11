package Seminar_2_HW;

import Seminar_2_HW.Home.Dog;

public class Program {
    public static void main(String[] args) {
        
        Dog grusha = new Dog(60, 10, "голубые", "Груша", "Корги", "Вакцинирован", "Коричневая", "17.04.2022", "Дрессированный");
        System.out.println(grusha.getInfo()); 
        grusha.makeSound();
        grusha.showAffection();
        grusha.train();
        
    }
}
