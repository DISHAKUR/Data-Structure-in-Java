package CollectionLibrary;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LibClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

			     //	**********************ARRAY*******************
				// *************************************************
				// *************************************************
				// *************************************************
					// get the input from the user
//					ScannerLib sl  = new ScannerLib();
//				    //int num = sl.takeInput();
//				    // add integers to the arrays
//						
					ArrayClass arc = new ArrayClass();
					// take input and add in array
					Scanner sc = new Scanner(System.in);
					int num;
					boolean add = true;
						while(add) {
							if((num = sc.nextInt())> 0) {
								System.out.println("Add number");
								arc.addvalues(num);
							}else {
								add = false;
								sc.close();
							}

						}

							
					// remove an element from array		
				     int[] ouput=  arc.removeElement(2);
		            System.out.println(Arrays.toString(ouput));
				
		         // traverse through the array elements
		            arc.traverse();
		            
		           
		   	      //**********************LinkedList***************************
		    	 // ************************************************************
		    	 // ************************************************************
		     	 // **********************Singly LL***************************
		            
		            System.out.println();
		            System.out.println("*Singular Linked List**");
		            System.out.println("**************************");
		            LinkedListLib ll = new LinkedListLib();
		            ll.insert(12);
		            ll.insert(18);
		            ll.insert(10);
		            ll.insert(13);
		            ll.insert(17);
		            ll.insert(14);
		            ll.lastEle();
		            
		       	 // **********************Circular LL**************************
		            System.out.println();
		            System.out.println("*Circular Linked List**");
		            System.out.println("**************************");
		            
		            CircularLinkedList cl = new CircularLinkedList();
	                cl.insertAtbegining(31);
		            cl.insertAtbegining(1339);
		            cl.insertAtbegining(1331);
		            cl.insertAtbegining(1653);
		            cl.insertAtTail(222);
		            cl.insertAtbegining(1779);
		            cl.insertAtbegining(3231);
		            cl.insertAtbegining(13459);
		            System.out.println("After insertion: ");
		            cl.traverseData();
		            
		            cl.deleteFromBeginning();
		            System.out.println("After deletion from begining: ");
		            cl.traverseData();
		            
		            cl.deleteFromPosition(3);
		            System.out.println("After deletion from 3: ");
		            cl.traverseData();
//		           
		       	 //**********************Doubly LL***************************
		           DoublyLinkedList dll = new DoublyLinkedList();
		           
		           dll.insertFromBegining(10);
		           dll.insertFromBegining(20);
		           dll.insertFromBegining(30); 
		           dll.insertFromBegining(40);
		           dll.printlist();
		           
		           dll.deleteNode(dll.head,dll.head);
		           System.out.println("After deletion");
		           dll.printlist();
				// ************************************************************
				// *************************STACKS***************************
				// ******************Using arrays***************************
		        
		            System.out.println();
		            System.out.println("*Stacks using Arrays**");
		            System.out.println("**************************");
		            System.out.println("**************************");
		            StackUsingArrays stck = new StackUsingArrays();
		            
		            stck.push(21);
		            stck.push(11);
		            stck.push(31);
		            
		            
		            
		            stck.push(1);
		            stck.push(91);
		            stck.push(11);
		            stck.push(21);
		            stck.push(11);
		            stck.displayStack();
		            stck.peek();
		            stck.pop();
		            System.out.println("after pop");
		            stck.displayStack();
		            
		            
		         // ************************************************************
				// ************************************************************
				// **********************using linkedlist***************************
					   
		         // ************************************************************
				// ************************************************************
				// ************************************************************
		
		            System.out.println();
		            System.out.println("*Stacks using Linked List**");
		            System.out.println("**************************");
		            System.out.println("**************************");
		            
		            StackUsingLinkedList stackLL =  new StackUsingLinkedList();
		            stackLL.push(11);
		            stackLL.push(12);
		            stackLL.push(13);
		            stackLL.push(19);
		            System.out.println("Stack :");
		            stackLL.display();
		            
		            stackLL.pop();
		            System.out.println("Stack :");
		            stackLL.display();
	            
		            System.out.println();
		            System.out.println("*Stacks using queues**");
		            System.out.println("**************************");
		            System.out.println("**************************");
		            
		            StacksUsingQueues sq = new StacksUsingQueues();
		            sq.add(11);
		            sq.add(12);
		            sq.add(13);
		            sq.add(19);
		            sq.displayQueue();
		            
		            
		            // ************************************************************
					// ************************************************************
					// **********************Queues using arrays******************
						   
			         // ************************************************************
					// ************************************************************
					// ************************************************************
		            System.out.println();
		            System.out.println("*Queus using arrays**");
		            System.out.println("**************************");
		            System.out.println("**************************");		 
		            QueueUsingArray qa = new QueueUsingArray();
		            qa.enqueue(10);
		            qa.enqueue(19);
		            qa.enqueue(17);
		            qa.enqueue(10);
		            qa.enqueue(19);
		          //  qa.enqueue(17);
		            qa.dequeue();
		            qa.enqueue(89);
		            qa.enqueue(89);
		
		
					// Queues using Stacks
					QueueUisngStack qs = new QueueUisngStack();
			
					qs.addIntoQueue(12);
					qs.addIntoQueue(16);
					
					qs.addIntoQueue(10);
					qs.displayQ();
					
					 // ************************************************************
					// ************************************************************
					// **********************Priority Queues using arrays***********
				        System.out.println();
			            System.out.println("*Priority Queues using arrays**");
			            System.out.println("**************************");
			            System.out.println("**************************");	
					PriorityQueueUsingArrays pq = new PriorityQueueUsingArrays();
					
					pq.insert(20);
					pq.insert(3);
					
					pq.insert(23);
					pq.insert(10);
					pq.displayPQ();
					
					pq.removeData();
					pq.displayPQ();
					
					 // ************************************************************
					// ************************************************************
					// ********************** DeQueues using arrays***********	   
					System.out.println();
		            System.out.println("* deQueues using arrays**");
		            System.out.println("**************************");
		            System.out.println("**************************");	
		            DequeueUsingArrays dq = new DequeueUsingArrays(10);
		            dq.insertfront(30);
		            dq.insertfront(2);
		            dq.insertrear(1);
		            dq.insertfront(300);
		            dq.insertfront(20);
		            dq.insertrear(111);
		            dq.display();
		            dq.deletefront();
		            
		            // ************************************************************
					// ************************************************************
					// ********************** DeQueues using Linkedlist***********	   
					System.out.println();
		            System.out.println("* deQueues using linkedlist**");
		            System.out.println("**************************");
		            System.out.println("**************************");	
		            DeQueueUsingLinkedList dqll = new DeQueueUsingLinkedList();
		            dqll.insertFirst(21);
		            dqll.insertFirst(51);
		            dqll.insertFirst(93);
		            dqll.insertFirst(11);
		            dqll.displayBackward();
		            
		            
		            
		}
	
	
	

}
