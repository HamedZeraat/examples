/**
 * Created by keith on 13/11/2017.
 * @author KLM
 */

/**
 * Blah, blah, blah
 *
 * Javadoc
 */
public class Student {
    private String firstName; // reference to an object NULL
    private String nickName;
    private int age; // primitive

    public Student(int age, String name){
        setAge(age);
        setName(name);
    }

    public Student(int age){
        this(age,"No name");
        //setAge(age);
    }

    public Student(String name){
        this(0, name);
        //setName(name);
    }

    public Student(){
        this(0);
    }

    private String getFirstName(){
        return firstName;
    }

    private void setFirstName(String name){
        firstName = name;
    }

    private String getNickName(){
        return (nickName == null) ? "" : nickName;

/*
        String result;
        if (nickName == null){
            result = "";
        } else {
            result = nickName;
        }
        return result;
*/
    }

    private void setNickName(String name){
        nickName = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return getFirstName() + " " + getNickName();
    }

    public void setName(String name){
        setFirstName(name);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + age;
    }
}

// accessor & mutators
// getXXX() & setXXX(YYY)
