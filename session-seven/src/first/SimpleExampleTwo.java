package first;

import java.util.ArrayList;
import java.util.List;

public class SimpleExampleTwo {
    public static void main(String[] args) {
        List<Person> l = new ArrayList<>();

        l.add(new Person("Fred",35));

//        for (Object p: l){
//            System.out.println(((Person)p).getName()); // o.toString()
//        }
//        for (Person p: l){
//            System.out.println(p.getName());
//        }
        System.out.println(l);

    }
}
