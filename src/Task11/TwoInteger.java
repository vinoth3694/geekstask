package Task11;
import java.util.Scanner;
public class TwoInteger {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
                System.out.println(a/b);
      }
}



To handle this exception we use try- catch exception handling 

import java.util.Scanner;
public class TwoInteger {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator cannot be zero");
        }
    }
}


