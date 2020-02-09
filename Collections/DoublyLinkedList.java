package CollectionsPractice;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
			
		 private static final ListNode Null = null;
		// instance variable
			private ListNode head;
			private ListNode tail;
			
			// size of DLL
			private int size;
	
			// create list node class
			//create a inner class
			public class ListNode
			{
				// previous
				private int data;
				// pointer to next and previous node
				private ListNode next;
				private ListNode prev;
				
				//constructor
				public ListNode(int data) {
					this.data = data;
				}
			}
	
		//constructor of DLL
		public DoublyLinkedList() {
			// initialisation
			this.head = null;
			this.tail = null;
			this.size = 0; 
			
		}
	
		//if DLL is empty
		public boolean isEmpty(){
				return size == 0; // even if head = null : DDL is empty
		}
	
		public int size(){
				return size;
		}
		
		//insert node at the begining
		//create a new node to insert 
		public void insertFirst(int el) {
			ListNode newNode = new ListNode(el);
			if(isEmpty()) {
				//if the DLL is empty
					tail = newNode;				
			} else {
				head.prev = newNode;
			}
			newNode.next = head;
			//now head will point to new node
			head = newNode;
			//increase the size
			size++;
		}
		
		//insert at the last
		
		public void insertLast(int value) {
			//create a new node with the value passed
			ListNode newNode = new ListNode(value);
			//if DLL is empty
			if(isEmpty()) {
				head = newNode;
			} else {
				tail.next = newNode;
				
			}
			newNode.prev = tail;
			tail = newNode;
			size++;
		}
	
	// Print element in DLL
	// assign the head in temp variable
		public void printEle() {
			   ListNode temp = head;
			
		    	while(temp != Null) {
				System.out.println("Linked List Data:  " + temp.data);
				temp =  temp.next;
			}
		}
	
	
	//display the DLL in forward direction
		
		public void displayForward() {
			if(isEmpty()) {
				return;
			}
			
			ListNode temp = head;
			while(temp !=null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	
		
		//traversing the DLL in backward direction
		public void displayBackward() {
			if(tail == null) {
				return;
			}
			
			ListNode temp = tail;
			while(temp !=null) {
				System.out.print(temp.data + "<--");
				//traverse to backward
				temp = temp.prev;
			}
			System.out.println("null");
		}
		
		
		//Delete the node from DLL
		//first node in java
		public ListNode deleteFirstNode() {
			//if DLL is empty
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			// assign the value of head to temp variable
			ListNode temp = head;
			if(tail == head) {
				tail = null;
			}
				else {
					// traverse and go to the head -> next -> prev
					head.next.prev = null;
				}
			head = head.next;
			temp.next = null;
			return temp;
			
		}
		
		
		// Delete the last node in DLL
		public ListNode deleteLastNode() {
			//if DLL is empty
			if(isEmpty()) {
				// no more elemnst to delete
				throw new NoSuchElementException();
			}
			// as we want to delete the last node
			// removed using temp node
			// assign the value of tail to temp variable
			ListNode temp = tail;
			if(tail == head) {
				head = null;
			}
				else {
					// traverse and go to the tail -> previous --> next
					//remoe the link of tail's previous next node
					tail.prev.next= null;
				}
			tail = tail.prev;
			temp.prev = null;
			return temp;
			
		}
		
		
}
