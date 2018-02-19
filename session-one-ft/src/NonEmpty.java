import java.util.Scanner;

/**
 * Q7 - A program that reads a string and prints all of its nonempty sub-strings.
 */
public class NonEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s = sc.nextLine();

        for (String str: s.split(" ")) {
            System.out.println(str);
        }
    }
}
