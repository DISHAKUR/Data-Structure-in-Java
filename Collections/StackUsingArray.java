package CollectionsPractice;

import java.util.Arrays;

// Last In First Out
// First In LAst Out

// 3 main operations
//Push - add element to stack
//Pop - remove the elment from the array(the last one/ recently added)
//Peek - get the last value added


// stacks Implemented Using arrays

public class StackUsingArray {

	       // create a stack array
	      int[] stack = new  int[5];
	      // create a counter for the array -
	      // initialise with 0 - as the first element added at 0 index
	      int top = 0;
	      
			// add elements to array
	      public int[]  push(int el) {
	    	  // push/add the element at zero index
	    	  stack[top] = el;
	    	  // increment the counter of top , as if next element is added it will be added at top + 1 index
	    	  System.out.println("Element added at " + top + " index position");
	    	  top++;
	    	  
	    	  System.out.println(Arrays.toString(stack));
	    	  return stack;
	      }
	      
	      // remove the element
	      // element removed from the top - so need to pass the value 
	      public void pop() {
	    	  			// as the array without value is displayed as 0
	    	          // so to remove the value - we assigned it as 0
	    	       // decrement the counter
	    	         top--;
	    	        stack[top] = 0;
	    	   
	    	        System.out.println("Current array : " +  Arrays.toString(stack));
	      }
	      //peek - display the latest element added
	      public int peek() {
	    	  int el;
	    	  top--;
	    	  el = stack[top];
	    	  return el;
	      }
}
