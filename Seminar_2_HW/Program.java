package Seminar_2_HW;

import Seminar_2_HW.Abstract.Animal;
import Seminar_2_HW.Abstract.HomeAnimal;
import Seminar_2_HW.Abstract.WildAnimal;
import Seminar_2_HW.Animal.*;
import Seminar_2_HW.Birds.Aist;
import Seminar_2_HW.Birds.Hen;

public class Program {
    public static void main(String[] args) {
        
        Dog grusha = new Dog();
        System.out.println(grusha.getInfo()); 
        grusha.makeSound();
        grusha.showAffection();
        grusha.train();

        WildAnimal volk = new Wolf();
        System.out.println(volk.getInfo());
        volk.makeSound();

        WildAnimal tigr = new Tiger();
        System.out.println(tigr.getInfo());
        tigr.makeSound();
        
        Hen kura = new Hen();
        System.out.println(kura.getInfo());
        kura.fly();
        kura.makeSound();

        Aist ad = new Aist();
        ad.fly();
    }
}
