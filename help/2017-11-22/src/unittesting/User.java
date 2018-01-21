package unittesting;

/**
 * Created by keith on 22/11/2017.
 */
public interface User {
    public String getName();
    public int getLibraryID();
    public int setLibraryID(Library lib);
    public int register(Library lib);
}
