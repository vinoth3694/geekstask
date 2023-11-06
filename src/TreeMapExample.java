
	import java.util.Map;
	import java.util.TreeMap;
			
	public class TreeMapExample{

		public static void main(String[] args) {
			
		
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	       
	        employeeMap.put(103, "SHAKTHI");
	        employeeMap.put(102, "VINODH");
	        employeeMap.put(101, "KUMAR");
	        employeeMap.put(104, "ABCD");

	        System.out.println("Names of employees in alphabetical order:");
	        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
	            System.out.println(entry.getValue());
	        }
		}
	}

