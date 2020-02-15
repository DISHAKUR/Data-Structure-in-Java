package CollectionLibrary;
import java.lang.*;
import java.util.Arrays;

public class ArrayClass {
			
		// array declaration
	    //type name[] = new type[size]
	 
	        int intArray[] = new int[10]; 
			byte byteArray[] = new byte[2];
			short shortsArray[] = new short[4];
			boolean booleanArray[] = new boolean[4];
			long longArray[] = new long[6];
			float floatArray[] = new float[10];
			double doubleArray[] = new double[12];
			char charArray[] = new char[10];
			
			
			
			// array basic oprations:
			// add elements to array
			// remove elements from an index
			// traverse  an array
			// set the index
			int i = -1;
			public void addvalues(int ele) {
				try {
					i++;
					intArray[i] = ele;
					
					System.out.println(Arrays.toString(intArray));
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e.getMessage());
					System.out.println("Array out of Index");
				}
			}
			
			// remove elemnet
			public int[] removeElement(int el) {
				if(el > intArray.length) {
					System.out.println("Enetered wrong Index");
					return intArray;
				}
				// if array is empty
				else if(i < 0) {
					System.out.println("array is empty");
					return intArray;
				}
				else {
					// assign it zero -  to show number removed
					intArray[el] =  0;
					System.out.println("Element removed from index" + el);
					return intArray;
				}
			}
			
			// traverse
			
			public void traverse() {
				for (int i = 0; i< intArray.length ; i++) {
					System.out.println("Element at " + i + " is "  +  intArray[i]);
				} 
			}
			
}
