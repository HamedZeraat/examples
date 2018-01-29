package one;

public class MyMain {
    public static void main(String[] args) {
        Vehicle v = new Hybrid();
        v.getMechanism();
        v = new Diesel();
        v.getMechanism();
    }
}
