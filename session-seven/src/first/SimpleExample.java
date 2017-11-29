package first;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(3); // auto-boxed
        l.add("String");
        l.add(new Person("Fred",35));

        for (Object o: l){
            System.out.println(o); // o.toString()
        }
    }
}
