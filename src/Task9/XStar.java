package Task9;
import java.util.Scanner;
public class XStar {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int n1= (n+1)/2;
        for(int i=1; i<=n1; i++){
            if(i==n1){
                for(int spaces=1; spaces<=i-1;spaces++){
                System.out.print(" ");
            }
            System.out.println("*");
            }
            else{
                for(int spaces=1; spaces<=i-1;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spaces=1; spaces<=2*(n1-i)-1;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            }
        }
        for(int i=1; i<=n1-1; i++){
            for(int spaces=1; spaces<=n1-i-1;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spaces=1; spaces<=2*i-1;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
			
	





