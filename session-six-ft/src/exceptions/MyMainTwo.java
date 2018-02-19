package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by keith on 27/11/2017.
 */
public class MyMainTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) { // try with resources
            try {
                System.out.print("Value (int): ");
                int value = sc.nextInt();
                System.out.println("The value is " + value);
            } catch (InputMismatchException ex) {
                System.err.println(ex);
            } catch (NoSuchElementException ex) {
                System.err.println(ex);
            } finally {
                System.out.println("Got here");
            }
        }
    }
}
