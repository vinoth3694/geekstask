
public class Factorial {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//input for the program
			int factorialNumber=5;
			
			long factResult=1;
			
			for(int i=1; i<=factorialNumber;i++)
			{
				factResult= factResult*i;
				
		
			}
			System.out.println("The factorial value for the given number is "+factResult);
			

		}
}


