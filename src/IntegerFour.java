import java.util.Scanner;
public class IntegerFour {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();
        
        int sum1= a+b;
        int sum2 = c+d;
        
        if(sum1>sum2)
        {
            System.out.println("sum of a & b is greater than sum of c & d");
        }
        else if(sum1 == sum2){
            System.out.println("sum of a & b is equal to sum of c & d");
        }
        else{
            System.out.println("sum of c & d is equal to sum of a & b");
		}
	}
}


