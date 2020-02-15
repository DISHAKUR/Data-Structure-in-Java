package CollectionLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerLib {

	public int takeInput() throws FileNotFoundException 
	{
			
		// take the input file
		// get the curr directory
		//String currdir = System.getProperty("user.dir");
		
		//Scanner scantext = new Scanner(new File("sourcename"));
		
		// now read the file of currdir 
		//while(!scantext.hasNextLine()) {...}
		
		
		 // use scanner to take input
		// keep taking input from user
			Scanner scan = new Scanner(System.in);
			//System.out.println("Please eneter a value");
			int num;
		  System.out.println("Feed me with numbers!");

	        while((num = scan.nextInt()) > 0) {
	            System.out.println("Keep adding!");
	        }

	        {
	            System.out.println("Number is negative! System Shutdown!");
	            //System.exit(1);
	        }
		
		
		return num;
	
	}
	
}
