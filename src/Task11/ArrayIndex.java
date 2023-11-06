package Task11;
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Accessing an index that is out of bounds
            int value = numbers[3];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
    }
}
//StringIndexOutOfBoundsException
import java.util.Scanner;
public class StringIndex{

public static void main(String[] args) {
        String str = "Hello, World!";
        
            System.out.println(str.charAt(15));

        try {
            // Accessing an index that is out of bounds
            char ch = str.charAt(15);
            System.out.println("Character: " + ch); // This line will not execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds.");
        }
    }
}

