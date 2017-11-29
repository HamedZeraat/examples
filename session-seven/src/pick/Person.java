package pick;

public class Person {

    public void doMuch(Person[] p){
        for (Person person: p){
            if (person != this)
                System.out.println(person);
        }
    }
}
