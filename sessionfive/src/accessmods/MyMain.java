package accessmods;

public class MyMain {
    public static void main(String[] args) {
        Person frankie = new Person("Frankie",34);
        Person jonny = new Person("Jonny",12);
        Person frankieClone = new Person("Frankie",45);

        System.out.println(frankie);
        System.out.println(frankieClone);
        System.out.println(jonny);
    }
}
