package staticexamples;

public class MyClass {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++){
            new Example();
            System.out.println(Example.getCount());
        }
    }
}
