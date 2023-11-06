
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class ListToArrayEx {

		public static void main(String[] args) {
			
	        List<Integer> numberList = new ArrayList<>();
	        numberList.add(10);
	        numberList.add(20);
	        numberList.add(30);
	        numberList.add(40);
	        numberList.add(50);

	        
	        Integer[] numberArray = numberList.toArray(new Integer[0]);

	        
	        System.out.println("Array: " + Arrays.toString(numberArray));
	    }
	}


