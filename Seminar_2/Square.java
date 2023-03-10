package Seminar_2;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);

    }
    public Square(){
        this(2);
    }
    @Override
    public String toString(){
        return "Квадрат";
    }
}
