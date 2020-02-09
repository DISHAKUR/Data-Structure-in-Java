package CollectionsPractice;
// solving palindrome using a stack
//import java util packages
// LIFO stack of objects
import java.util.Stack;
// to text scanner for parsing strings and primitive types
import java.util.Scanner;
// DLL implementation of list and deque(Deck/double ended queue)
import java.util.LinkedList;
// system input out
import java.io.File;
//specific region, geogrphical
import java.util.Locale;
// attempts to open a file has failed
import java.io.FileNotFoundException;


public class PalindromeStack {

	public static void main(String[] args) throws FileNotFoundException{
		  
		// get the user current directory
		    String currdir = System.getProperty("user.dir");
		    System.out.println(currdir);
		    
		 // scan the file
		    // if file is not foun d throw - file not found excption
			Scanner in_file = new Scanner(new File("english_words.txt"));
			System.out.println(in_file);
			
			
			// initailise the counter 0
			int palindrom_word = 0;
			
			// time taken to perform this operation
			long start = System.currentTimeMillis();
			
			//loop through all the lines of the file
			while(in_file.hasNextLine()) {
				 // get the next string and save in the input string
				
						String input_string = in_file.nextLine();
						//System.out.println(input_string);
						// save into the stack - create  a new stack
					     Stack stck = new Stack();
					   //  System.out.println(input_string.length());
						// sav eall the input string into a stack
						for(int i =0; i < input_string.length() ; i++) {
							// save the input_string of every index
							stck.push(input_string.charAt(i));
						}
						
						String reverseString = "";
						//System.out.println(stck.pop());
						// loop through the stack until it is not empty
						while(!stck.isEmpty()) {
							// get the first ele
							reverseString =  reverseString + stck.pop();
							//System.out.println(reverseString);
						}
						// compare the 2 strings
						if(input_string.equals(reverseString)) {
							palindrom_word =  palindrom_word + 1;
							
						}
			}
						// time taken at end of the while loop
			long end = System.currentTimeMillis();
			
			System.out.println("Time take taken to cal the num of palindrome: " + ( end - start));
						
			System.out.println("no of palindrom"   + palindrom_word);
			
			// close the file
			in_file.close();
			
		    
		    
	}
	
	
}
