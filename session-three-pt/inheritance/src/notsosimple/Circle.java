package notsosimple;

/**
 * Class definition for object circle
 */
public class Circle extends Shape {

    private static final double pi = 3.1416;
    private double radius = 0;

    /**
     * Constructor
     */
    public Circle(double r) {
        setRadius(r);
    }

    /**
     * returns area
     */
    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    /**
     * returns shape name
     */
    @Override
    public String getName() {
        return "circle";
    }

    /**
     * returns radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius
     */
    public void setRadius(double r) {
        radius = r;
    }
}