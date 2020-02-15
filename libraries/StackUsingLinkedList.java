package CollectionLibrary;

public class StackUsingLinkedList {
			 // A linked list node 
			 private class Node { 
			
			     int data; // integer data 
			     Node next; // reference variable Node type 
			 } 

			 // top : as this is stack
			 Node top = null; 
			 
			
			 // Utility function to add an element x in the stack 
			 public void push(int x) // insert at the beginning 
			 { 
			     // create new node temp and allocate memory 
			     Node temp = new Node(); 
			
			     // check if stack (heap) is full. Then inserting an 
			     //  element would lead to stack overflow 
			     if (temp == null) { 
			         throw new StackOverflowError();
			     } 	
			     // initialize data into temp data field 
			     temp.data = x; 		
			     // put top reference into temp next 
			     temp.next = top; 		
			     // update top reference 
			     top = temp; 
			 } 
			
			 // stack is empty or not 
			 public boolean isEmpty(){ 
			     return top == null; 
			 } 
			
			 // Utility function to return top element in a stack 
			 public int peek() 
			 { 
			     // check for empty stack 
			     if (!isEmpty()) { 
			         return top.data; 
			     } 
			     else { 
			         System.out.println("Stack is empty"); 
			         return -1; 
			     } 
			 } 
			
			 // Utility function to pop top element from the stack 
			 public int pop() // remove at the beginning 
			 { 
			     // check for stack underflow 
			     if (top == null) { 
			         System.out.print("\nStack Underflow"); 
			         return (Integer) null;
			     } 	else {
			    	 // update the top pointer to point to the next node 
				     top = top.next; 
				     return top.data;
			     }
			    
			 } 
			
			 public void display() 
			 { 
			     // stack is empty
			     if (top == null) { 
			        System.out.println("Nothing to Print !! Stack is empty!!");
			     } 
			     else { 
			         Node temp = top; 
			         while (temp != null) { 
			        	 	System.out.print(temp.data + " ");
			             // assign temp next to temp 
			             temp = temp.next; 
			         } 
			     } 
			     System.out.println();
			 } 
} 