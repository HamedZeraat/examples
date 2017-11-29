package box;

public class MyClass {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        GenericBox<String> stringGenericBox = new GenericBox<>();

        integerGenericBox.add(new Integer(10));
        stringGenericBox.add(new String("Hello World"));
//        integerGenericBox.add(4.5); // doesn't like this

        System.out.println("Integer Value: " + integerGenericBox.get());
        System.out.println("String Value: " + stringGenericBox.get());
    }
}
