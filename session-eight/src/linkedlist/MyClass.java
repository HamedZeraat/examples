package linkedlist;

public class MyClass {
    public static void main(String[] args) {
        LinkedList<String> ls;

        ls = new LinkedList<>();

        System.out.println(ls);
        System.out.println(ls.size());

        ls.add("Simon");
        System.out.println(ls);
        System.out.println(ls.size());

        ls.add("Betty");
        System.out.println(ls);
        System.out.println(ls.size());

        for (int i=0; i < 5; i++){
            ls.add("Person" + i);
        }
        System.out.println(ls);
        System.out.println(ls.size());

    }
}
