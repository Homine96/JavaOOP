package Seminar_1;

public class Program {
     public static void main(String[] args) {
        Bread hleb = new Bread("Rus", 12, 0, "kg", 0, "wer");
        Eggs eggs1 = new Eggs("Eggs", 135, 10, "упаковка", 12, 9);
        Milk milk = new Milk("Весёлый молочник", 70, 1, "поштучно", "1 литр", "2 месяца", "3.2 %");
        Limonade lime = new Limonade("Sprite", 150, 2, "бутылка", "Литр");
        ToiletPaper bumaga = new ToiletPaper("Zewa", 167, 4, "Упаковка", 10, 2);
        Masks maski = new Masks("Аллоэ", 98, 1, "упаковка", 10);
        Diapers pumpers = new Diapers("Huggies", 840, 1, "упаковка", 0, "yes", 3, 1, 4, "shorts");
        Soother soska = new Soother("Губастик", 300, 1, "поштучно", 0, "yes");

        System.out.println(hleb.getInfo());
        System.out.println(eggs1.getInfo());
        System.out.println(milk.getInfo());
        System.out.println(lime.getInfo());
        System.out.println(bumaga.getInfo());
        System.out.println(maski.getInfo());
        System.out.println(pumpers.getInfo());
        System.out.println(soska.getInfo());
    }
        
}
