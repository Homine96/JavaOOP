package Seminar_1;

public class Program {
     public static void main(String[] args) {
        Bread hleb = new Bread("Rus", 12, 0, "kg", 0, "wer");
        System.out.println(hleb.getInfo());

        Eggs eggs1 = new Eggs("Eggs", 135, 10, "упаковка", 12, 9);
        System.out.println(eggs1.getInfo());

        Milk milk = new Milk("Весёлый молочник", 70, 1, "поштучно", "1 литр", "2 месяца", "3.2 %");
        System.out.println(milk.getInfo());

        Limonade lime = new Limonade("Sprite", 150, 2, "бутылка", "Литр");

    }
        
    
}
