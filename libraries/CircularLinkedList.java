package CollectionLibrary;

public class CircularLinkedList {

	   
	     // create a node
		static class Node { 
			int data; 
			Node next; 
			
			Node(int ele){
				data = ele;
				next = null;
			}
		}
		// size of linkedlist
		public int size = 0;
		
		// create a head node
		public Node head;
		public Node tail;
		
		// adding elements at begining
		public void insertAtbegining(int ele) {
			// cretae a temp node
			Node temp = new Node(ele);
			
			//if ll is empty
			if(head == null) {
				head = temp;
			  	tail = temp;
				temp.next = head;
			}else {
				// create a new temp node
				Node temp1 = head;
				// now new node next will point to the head
				temp.next = temp1;
				head = temp;
				tail.next = head;
			}
			this.size = this.size + 1;
			
		}
		
		// insertion at the end
		public void insertAtTail(int ele) {
			// create a node
			Node node = new Node(ele);
			// if ll is empty
			if(head == null) {
				//head = node;
				this.insertAtbegining(ele);
			}else {
//				 // create a temp node
//				Node temp = head;
//				// go to tail node - by travesing
//				// in circular linked list
//				// the last node will point to the head
//				while(temp.next !=  head) {
//						temp = temp.next;
//				}
//				temp.next = node;
		        // set the tail next to new node
				tail.next = node;
				// now set the tail as new node
				tail = node;
				// this new node becomes tail
				// now point this tail.next to head
				tail.next = head;
			}
			
			//node.next = head;
			this.size = this.size + 1;
			
			//this.traverseData();
			}
			
	 // insertion at any point
	 public void insertAtPos(int ele, int pos) {
		 
		 if(pos < 0 || size < pos) {
			 throw new IllegalArgumentException();
		 }
		 // create a node
		 Node newNode = new Node(ele);
		 
		 Node tempNode = head;
		 Node prevNode = null;
		 for(int i =0; i < pos ; i++) {
			 	if(tempNode.next == head) {
			 		break; // means only one node is present
			 	}
			 	prevNode= tempNode;
			 	tempNode = tempNode.next;
		 	}
			prevNode.next = newNode;
			newNode.next = tempNode;
           this.size = this.size +1 ;
           //this.traverseData();
	 }
	 
	  // delete from begnining
		public void deleteFromBeginning() {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = head.next;
			head = head.next;
			this.size = this.size -1;
			//this.traverseData();
		}
	
	   // Delete the node from pos
		public void deleteFromPosition(int pos) {
			if (pos < 0 || pos >= size) {
				throw new IllegalArgumentException();
			}
			Node current = head, previous = head;
			for (int i = 0; i < pos; i++) {
				if (current.next == head) {
					break;
				}
				previous = current;
				current = current.next;
			}
			if (pos == 0) {
				this.deleteFromBeginning();
			} else {
				previous.next = current.next;
			}
			this.size = this.size -1;
			//this.traverseData();
		}
			
	//*************SEARCHING ************	
		
	  // find element at particular index
		public Node searchByIndex(int pos) {
			if (pos < 0 || pos >= size) {
				throw new IndexOutOfBoundsException("Index is Invalid");
			}
			Node temp = head;
			for (int i = 0; i < pos; i++) {
				temp = temp.next;
			}
			return temp;
		}

	// find element with the value
		public Node searchByValue(int value) {
			Node temp = head;
			while (null != temp && temp.data != value) {
				temp = temp.next;
			}
			if (temp.data == value) {
				return temp;
			}
			return null;
		}
		
	
		//*************TRAVERSING ************	
		public void traverseData() {
			// linkedlist is empty
			if(head == null) {System.out.println("LinkedList is empty!!"); }
			else {
				// create a temp node
				Node tempNode = head;
//				System.out.println("Current Linked List");
//				System.out.println(tempNode.next != head);
				//tempNode = tempNode.next;
				while(tempNode.next != head) {
					System.out.print(tempNode.data + "-->");
					tempNode = tempNode.next;
				}
				System.out.print(tempNode.data);
				System.out.println();
			}
			
		}
}