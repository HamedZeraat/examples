import java.util.Random;

/**
 * Created by keith on 13/11/2017.
 */
public class Launcher {
    public static void main(String[] args) {

        Student r;
        Student s;
        Student t;
        Student z;

        r = new Student(23);
        s = new Student(14,"Kugs");
        t = new Student("James");
        z = new Student();

        s.setAge(14);
        s.setName("Kugs");

        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(z);
    }
}