package statics;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("The constant from MyClass " + MyClass.VALUE);
        System.out.println("The doubleIt method from MyClass " + MyClass.doubleIt(12L));
        MyClass my = new MyClass(2);
        System.out.println("Add two from MyClass: " + my.addTo(2));
        my = new MyClass(6);
        System.out.println("Add two from MyClass: " + my.addTo(2));
    }

}
