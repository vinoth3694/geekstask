package Task11;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class FileNotFound {
	    public static void main(String[] args) {
	        String filePath = "Task11.txt";

	        try {
	            File file = new File(filePath);
	            Scanner scanner = new Scanner(file);
	            // Perform file reading operations here
	            System.out.println("File reading successful!");
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found. " +e.getMessage());
	            //e.printStackTrace();
	            
	        }
	    }
	}

