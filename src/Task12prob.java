import java.util.ArrayList;
				
public class Task12prob {
	public static void main(String[] args) {
			
        ArrayList<String> stringList = new ArrayList<>();

		
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Mango");

        System.out.println("ArrayList before removing elements: " + stringList);

				
        stringList.clear();

        System.out.println("ArrayList after removing elements: " + stringList);
    }
}


