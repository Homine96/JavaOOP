package Seminar_2_HW.Abstract;

public abstract class HomeAnimal extends Animal {

    private String name;
    private String breed; // порода собак
    private String vaccine;
    private String colorwool;
    private String date;

    public HomeAnimal(int height, int weight, String eyeColor, String name, String breed, String vaccine, String colorwool, String date ) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccine = vaccine;
        this.colorwool = colorwool;
        this.date = date;
    }

    public abstract void showAffection();

    public String getInfo() {
        return String.format("%s Name: %s  Breed: %s  Vaccine: %s ColorWool: %s Date: %s ",
                super.getInfo(), this.name, this.breed, this.vaccine, this.colorwool, this.date );
    }
    
}
