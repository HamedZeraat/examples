package unittesting;

/**
 * Created by keith on 22/11/2017.
 */
public class UserImpl implements User {
    private String name;
    private int id;

    public UserImpl(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLibraryID() {
        return 13;
    }

    @Override
    public int setLibraryID(Library lib) {
        return 0;
    }

    @Override
    public int register(Library lib) {
        return 0;
    }
}
