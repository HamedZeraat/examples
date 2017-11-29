package pick;

public class MyClass {
    public static void main(String[] args) {
        final int COUNT = 4;
        Person[] people = new Person[COUNT];

        for (int i=0; i < people.length; i++){
            people[i] = new Person();
        }

        System.out.println("> " + people[0]);
        people[0].doMuch(people);
    }


}
