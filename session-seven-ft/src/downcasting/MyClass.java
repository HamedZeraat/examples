package downcasting;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Animal> al = new ArrayList<>();

        al.add(new Dog());al.add(new Dog());al.add(new Dog());

        for (Animal d: al){
            System.out.println(((Dog)d).bark());
        }

    }
}
