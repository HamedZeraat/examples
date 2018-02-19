package simple;

/**
 * Class definition for object square
 */
public class Square extends Shape {
    private double side = 0;

    /**
     * Constructor
     */
    public Square(double s) {
        setSide(s);
    }

    /**
     * returns area
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * returns shape name
     */
    @Override
    public String getName() {
        return "square";
    }

    /**
     * returns length of one side
     */
    public double getSide() {
        return side;
    }

    /**
     * set length of side
     */
    public void setSide(double s) {
        side = s;
    }
}