package Task9;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		     int n=1234521, rev=0, rem, temp; 
		      temp = n;
		      for( ;n != 0; n /= 10 )
		      {
		         rem = n % 10; 
		         rev= rev* 10 + rem;
		       } 
		    
		    if (temp== rev) 
		        System.out.println(temp + " is a palindrome."); 
		   else
		         System.out.println(temp + " is not a palindrome."); 
		     } 
		}
	}

