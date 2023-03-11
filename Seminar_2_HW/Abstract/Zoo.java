package Seminar_2_HW.Abstract;

import java.util.ArrayList;
import java.util.Scanner;

import Seminar_2_HW.Animal.Cat;
import Seminar_2_HW.Animal.Dog;
import Seminar_2_HW.Animal.Tiger;
import Seminar_2_HW.Animal.Wolf;
import Seminar_2_HW.Birds.Aist;
import Seminar_2_HW.Birds.Hen;

public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
    allAnimal.add(new Cat());
    allAnimal.add(new Tiger());
    allAnimal.add(new Dog());
    allAnimal.add(new Wolf());
    allAnimal.add(new Hen());
    allAnimal.add(new Aist());
    }

    public int size(){
        return allAnimal.size();
    }





    public void addCat(Scanner input){
        String name;
        String breed;
        String vaccine;
        String colorwool;
        String date;
        int height;
        int weight;
        String eyeColor;
        String wool;

        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccine = input.next();
        System.out.print("Введите цвет: ");
        colorwool = input.next();
        System.out.print("Дата рождения: ");
        date = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(height, weight, colorwool, name, breed, vaccine, eyeColor, date, wool));
    }

    public void addDog(Scanner input){
        String name;
        String breed;
        String vaccine;
        String colorwool;
        String date;
        int height;
        int weight;
        String eyeColor;
        String training;

        System.out.print("Имя: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинирован?: ");
        vaccine = input.next();
        System.out.print("Введите цвет: ");
        colorwool = input.next();
        System.out.print("Дата рождения: ");
        date = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        allAnimal.add(new Dog(height, weight, colorwool, name, breed, vaccine, eyeColor, date, training));
    }

    public void addTiger(Scanner input){
        int height;
        int weight;
        String eyeColor;
        String habitat;
        String dateoflocation;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        dateoflocation = input.next();

        allAnimal.add(new Tiger(height, weight, eyeColor, habitat, dateoflocation));
    }

    public void addWolf(Scanner input){
        int height;
        int weight;
        String eyeColor;
        String habitat;
        String dateoflocation;
        String leader;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        dateoflocation = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        allAnimal.add(new Wolf(height, weight, eyeColor, habitat, dateoflocation, leader));
    }

    public void addHen(Scanner input){
        int height;
        int weight;
        String eyeColor;
        int h;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        h = input.nextInt();

        allAnimal.add(new Hen(height, weight, eyeColor, h));
    }

    public void addAist(Scanner input){
        int height;
        int weight;
        String eyeColor;
        int h;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        h = input.nextInt();

        allAnimal.add(new Aist(height, weight, eyeColor, h));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
       System.out.println(allAnimal.get(num).getInfo()); 
    }

    void animalSay(int num) {
        allAnimal.get(num).makeSound();
    }

    void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.makeSound();
        }
    }
    
}