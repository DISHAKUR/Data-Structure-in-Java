package CollectionLibrary;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackUsingArrays {

	// basic Stack operations 
	// add - elements - push into stack
	
	// create an array
	 
    int intArray[] = new int[10]; 
	byte byteArray[] = new byte[2];
	short shortsArray[] = new short[4];
	boolean booleanArray[] = new boolean[4];
	long longArray[] = new long[6];
	float floatArray[] = new float[10];
	double doubleArray[] = new double[12];
	char charArray[] = new char[10];
	
	// set the index 
	int index = -1;
	int size = 0;
	public void push(int ele) {
		if(size == intArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			index ++;
			intArray[index] = ele;	
			this.size = this.size + 1;
			//System.out.println("current stack after push" + Arrays.toString(intArray));
		}
	
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is Empty!!");
			//System.out.println("Stack is Empty!!");
		}else {
			intArray[index] = 0;
			this.size = this.size -1;
			//System.out.println("current stack after pop" + Arrays.toString(intArray));
		}
		
	}
	
	public int peek() {
		System.out.println("latest item added in the stack " + intArray[index]);
		return  intArray[index];
		
	}
	
	public void displayStack() {
		for(int i =0; i < size ; i++) {
			System.out.println("Element at position " +  i + " " +  intArray[i]);
		}
	}
}
