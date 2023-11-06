package Task11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new Main("Age must be 18 or above.");
            }
            System.out.println("Access granted!");
        } catch (Main e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Main extends Exception {
    public Main(String message) {
        super(message);
    }
}

