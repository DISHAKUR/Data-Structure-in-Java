package CollectionLibrary;

import java.util.Scanner;

public class QueueUisngStack {


		 // create 2 stacks
		 StackUsingLinkedList stckOne = new StackUsingLinkedList();
		 StackUsingLinkedList stackTwo = new StackUsingLinkedList();
		

		  public void addIntoQueue(int ele) {
				stckOne.push(ele);
			}
	     
		  public void removeFromQueue() {
	    	if(stackTwo.isEmpty()) {
				// till stack one is not empty pop all the elements
				// to stack two : with this the first inserted element
				// will become the last ele on stack : i.e on the top
				while(!stckOne.isEmpty()) {
					stackTwo.push(stckOne.pop());
				}		
			}
			
			//remove the top element from the Queue
			// First In First Out
			if(!stackTwo.isEmpty()) {
				stackTwo.pop();
			}
	    
		}
		  
		 public void displayQ() {
			 stckOne.display();
		 } 
		
	}	
	


	
	//get commands from user to perform operations
//	Scanner scan = new Scanner(System.in);
//	int comm = scan.nextInt();
//	
//	if(comm == 1) {
//		// take input from user and push into the stack
//		Scanner scans = new Scanner(System.in);
//		int input = scans.nextInt();
//			stckOne.push(input);
//	}
//	else if(comm == 2) {
//		if(stckOne.isEmpty()) {
//			System.out.println("Nothing to pop");
//		}else {
//			//check if stack two is empty
//			if(stackTwo.isEmpty()) {
//				// till stack one is not empty pop all the elements
//				// to stack two : with this the first inserted element
//				// will become the last ele on stack : i.e on the top
//				while(!stckOne.isEmpty()) {
//					stackTwo.push(stckOne.pop());
//				}		
//			}
//			
//			//remove the top element from the Queue
//			// First In First Out
//			if(!stackTwo.isEmpty()) {
//				stackTwo.pop();
//			}
//		}
//	
//		// put the elemnts back to stack one
//		while(!stckOne.isEmpty()) {
//			stackTwo.push(stckOne.pop());
//		}
	

