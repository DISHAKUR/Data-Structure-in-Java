package CollectionsPractice;

import java.awt.List;
import java.util.ArrayList;

public class SinglyLinkedList<T> {
	
//	 Node -  an object - will have element and reference to next element

	  // create a node Class
	// node - generics <T>
	private static class Node<T>{
		
		// Node
//       ##################
//       #																#
//       #		    Element | Next          #
//       #																#
//       ##################
    		
		
		// a node will have an element
		private T element;
		// next node for reference
		private Node<T> next;
		
		//global variable to save a node
	 	//initiallly head node
		
		Node <T> currentNode;
		//constructor of the node: // pass elements and the next node reference
		// create a node with given element and node
		public Node(T el , Node<T> n) {
					element = el;
					next = n;
		}
		
		//retrive the element from the node i.e getelement
		public T getElement() {
			return element;
		}
		
		//allow us to retrieve the pointers - 
		public Node<T> getNext(){
				return next;
		}
		
		//we can change what node is pointing to 
		//setting the next
		public void setNext(Node<T> n) {
			next = n;
		}
		
	}
		// implement the list
		
		//head and tail Pointers to the first and last element 
		// of the list
		private Node<T> head = null; // initialisation
		private Node<T> tail = null; 
		
		//size of the list - to keep the track of the size of the list
		private int size =0; // initialize with 0
		
		//empty initialiser
		public SinglyLinkedList() {};
	
		//get the size of the list
		public int size() {
			return size;
		}
		
		//check if the list is empty
		public boolean isEmpty() {
			// return true if the size is empty
			return size == 0;
		}
		
		// get element of the first node
		public T first() {
			//if list is empty then return null
				if(isEmpty()) {
					return null;
					}else {
						// otherwise returns the first element
						return head.getElement();
				}
		}
		
		//get element of the last node
		public T last() {
				if(isEmpty()) {
						return null;
					} else {
						// returns the last element
						return tail.getElement();
					}
		}
		
		//add element at the first 
		// new element at the head node
		
		public void addFirst(T e) {
			// create a new node pointing to the head	
			head = new Node<>(e,head);
			// new node - take element and point towards to head
			// now adding at first
			// your this new node will point to the head - as 
			// this new node will have reference to the head
			
			//if size is empty
			if(size == 0) {
				tail = head;
				
			}
			//increase the size
			size++;
			System.out.println("Added the element at the first position : " + head.getElement());
		}
		
		//adding the element at the last
		
		public void addLast(T e) {
			//create node
			
			// it will poit to null
			Node<T> newNode = new Node<>(e,null);
			if(isEmpty()) {
				// head will point to new node
				//if there no elemnet new element will be the head
				head = newNode;
			}
			else{
				//if not empty
				//tail will point to this new node
				tail.setNext(newNode);
			}
			// and now tail will be new node
			tail = newNode;
			//increase the size
			size++;
			System.out.println("Added the element at the last position : " + tail.getElement());
		}
		
		//removing the element
		public T removeFirst() {
			//if list is already empty
			if(isEmpty()) {
				return null;
			}
		// if list is not empty
			//get the head element
			T answerNode = head.getElement();
			//points the next element to head
			head = head.getNext();
			size--; // decrease the size
			
			//
			if(size == 0) {
				tail = null;
			}
//			System.out.println(head.getNext());
//			System.out.println(head.getElement());
			System.out.println(" Removed head node" + "  " +  answerNode+"  " +"element");
			return answerNode;
			
		}
		
	// Traversing / Reversing
		
		public void reverseList()	{
			//print the elements: 
//			System.out.println("List before reversing");
//			System.out.println("First poistion: " + "  " + head.getElement());
//			System.out.println("Last position : "+"   "+  tail.getElement());
			
			//currentNode
			Node <T> currentNode = null;
		    boolean alreadyVal = false;
		    System.out.println("size of ll" + size);
			//check the size if it has only one element
			if(size <= 1) {
				
			}
			// if there only 2 elements
			else  if(size ==2){
				// swap the pointers
				// remove the reference
				
				// value of next of tail
				System.out.println("Tail next before swapping: " + " " + tail.getNext());
				//set the tail next node as head
				// now from null it will point to head
	            tail.setNext(head);
	            
	            //after changing,it will now point to head
	            System.out.println("Tail next after assigning it to head: " + " " + tail.getNext());
	                  
	            //assign tail to head
				head = tail;
				
				if(head == tail)System.out.println("true");
				//get the value of next of head
				 tail = head.getNext();
				
				 // now assign the next as null 
				 // as now tail is swapped to head
				 tail.setNext(null);
				 System.out.println("Value of tail next after swapping"+ " " + tail.getNext() );
			}
			else {
				  // go to multiple pointers
				
				// 3 elements at the begining:
				Node<T> current = head; // first element
				Node<T> currentNext = head.getNext(); // second ele
				Node<T> currentNextNext = currentNext.getNext(); // third ele
				// tail will be now head
				tail = head;		
				// now start assigning the next
				while(currentNext != null) {
					//now reverse the next - now middle was pointing to next node
					// we will set it to point to the previous node
						currentNext.setNext(current);
						
						//assign the next in previous order
						current = currentNext;
						currentNext = currentNextNext;
						
						if(currentNextNext != null) {
							currentNextNext = currentNextNext.getNext();
						}		
						tail.setNext(null);
						head = current;				
				}
			}
			
			//print the elements:
			int i = 0;
			while(i < size) {
				if(i == 0) {
					//print the first element
						System.out.println("FirstPosition element: " + " "  + head.getElement());
				}
				//print the last element
				else  if( (i+1) == size){
					System.out.println("Last Position element: " + " "  + tail.getElement());
				}
				else{
				    if(!alreadyVal) {
				    	currentNode = head.getNext();
				    	alreadyVal = true;
				    	
				    }else {
				    	currentNode = currentNode.getNext();
				    }
					System.out.println(i+1 + " Position element: " + " "  + currentNode.getElement());
				}
			
				i++;
			}
		
		}
		
		// How to find the element and remove  the position
		public T removeElement(T e) {
			Node<T> current = head; // 2 references pointing to head
			Node<T> previous = head;
			
			int position = 0;
			//not at the last of the list and not found the ele
			//keep travesring a
			while(current != null && current.getElement() != e) {
					previous = current;
					current = current.getNext();
					position++;
					
			}
			if(current == null) {
				return null;
			}else {
//				/ / if element we found is at head or tail
				if(head == current) {
						head = current.getNext();
				} else if(tail == current) {
					tail = previous;
					tail.setNext(null);
				}else {
					previous.setNext(current.getNext());
				}
			}
			System.out.println("Found and remove at position"   + "" + position);
			size --;
			
			return current.getElement();
			
		}
}
