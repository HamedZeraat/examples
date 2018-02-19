public class MyPersonMain {
    public static void main(String[] args) {
        Person p = new Person("Betty");
        Person p1 = new Person("Betty");
//        p.name = "Fred";
        System.out.println(p);
        System.out.println(p1);
   //     p.equals(3); // int -> Integer
        System.out.println(p.equals(p1));
    }
}
