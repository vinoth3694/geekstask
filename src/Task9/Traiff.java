package Task9;
import java.util.Scanner;
public class Traiff {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int month = obj.nextInt();
         int rent = obj.nextInt();
          int days = obj.nextInt();
          
          int totalPrice = rent*days;
          switch(month)
          {
              case 1: System.out.println(totalPrice); break;
              case 2: System.out.println(totalPrice); break;
              case 3: System.out.println(totalPrice); break;
              case 4: System.out.println(1.2*totalPrice); break;
              case 5: System.out.println(1.2*totalPrice); break;
              case 6: System.out.println(1.2*totalPrice); break;
              case 7: System.out.println(totalPrice); break;
              case 8: System.out.println(totalPrice); break;
              case 9: System.out.println(totalPrice); break;
              case 10: System.out.println(totalPrice); break;
              case 11: System.out.println(1.2*totalPrice); break;
              case 12: System.out.println(1.2*totalPrice); break;
          }
    }
}
