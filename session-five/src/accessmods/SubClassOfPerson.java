package accessmods;

/**
 * Created by keith on 22/11/2017.
 */
public class SubClassOfPerson extends Person{
    public SubClassOfPerson(String name, int id){
        super(name,id);
    }

    public void aMethod(){
        System.out.println(str);
        // System.out.println(name);
    }
}
