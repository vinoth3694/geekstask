package OopsTask10;

public class TeaClass {
public static class Tea {
	    
	    public void prepareTea() {

	            System.out.println("Preparing tea with hot water and tea leaves.");
	    	}
	    // The addMilk() and addSugar() methods check the state of the tea and add milk or sugar 
	    public void addMilk() {
	        
	            System.out.println("Adding milk to the tea.");
	     	}
	    
	    public void addSugar() {
	    	
	        System.out.println("Adding sugar to the tea.");
	       }
	    public static void main(String[] args) {
	        Tea tea = new Tea();
	        
	        tea.prepareTea(); 
	        tea.addMilk(); 
	        tea.addSugar(); 
	    }
	}
}

