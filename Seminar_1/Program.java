package Seminar_1;

public class Program {
     public static void main(String[] args) {
        Bread hleb = new Bread("Rus", 12, 0, "kg", 0, "wer");
        System.out.println(hleb.getInfo());
        Eggs eggs1 = new Eggs("Eggs", 135, 10, "упаковка", 12, 9);
        System.out.println(eggs1.getInfo());
    }
        
    
}