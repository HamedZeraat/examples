package exceptions;

import java.io.IOException;

/**
 * Created by keith on 27/11/2017.
 */
public class MyClass {
    public static void main(String[] args) throws Exception { // throws IOException{
        //throw new IOException();
        //throw new RuntimeException();
        try {
            throw new Exception();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
