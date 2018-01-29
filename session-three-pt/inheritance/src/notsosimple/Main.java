package notsosimple;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        Square sq = new Square(2.0);

        Shape s = new Circle(3.5);
        Shape s2 = new Square(1.5);

        s.getArea();
    }
}
