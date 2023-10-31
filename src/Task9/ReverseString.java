package Task9;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringinput = "Guvi";
       
        char[] resultarray = stringinput.toCharArray();
      
        for (int i = resultarray.length - 1; i >= 0; i--)
      
            System.out.print(resultarray[i]);

	}

}
