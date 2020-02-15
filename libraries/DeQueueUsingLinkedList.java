package CollectionLibrary;

public class DeQueueUsingLinkedList {

	 private Node head;
	 private Node tail;
	 
	 static class Node{
	  //data
	  int data;
	  // set next node in the list
	  Node next;
	  //set  previous node in the list
	  Node prev;
	  Node(int data){
	   this.data = data;
	  }
	  public void displayDQ(){
	   System.out.print(data + " | ");
	  }
	 }
	 // constructor
	 public DeQueueUsingLinkedList(){
	  this.head = null;
	  this.tail = null;
	 }
	 
	 public boolean isEmpty(){
	  return head == null;
	 }
	 
	 public void insertFirst(int i){
			  //Create a new node
			  Node newNode = new Node(i);
			  // if first insertion tail should
			  // also point to this node
			  if(isEmpty()){
			   tail = newNode;
			  }else{
			   head.prev = newNode;
			  }
			  newNode.next = head;
			  head = newNode;
	 }
	 

	 public void insertLast(int i){
			  Node newNode = new Node(i);
			  // if first insertion head should
			  // also point to this node
			  if(isEmpty()){
			   head = newNode;
			  }else{
			   tail.next = newNode;
			   newNode.prev = tail;
			  }
			  tail = newNode;
	 }
	 
	 public Node removeFirst(){
		 // if its empty
			  if(head == null){
			   throw new RuntimeException("Deque is empty");
			  }
			  Node first = head;
			  if(head.next == null){
			   tail = null;
			  }else{
			   // previous of next node (new first) becomes null
			   head.next.prev = null;
			  }
			  head = head.next;
			  return first;
	 }
	 
	 public Node removeLast(){
	  if(tail == null){
	   throw new RuntimeException("Deque is empty");
	  }
	  Node last = tail;
	  if(head.next == null){
	   head = null;
	  }else{
	   // next of previous node (new last) becomes null
	   tail.prev.next = null;
	  }
	  tail = tail.prev;
	  return last;
	 }
	 
	 public int getFirst(){
			  if(isEmpty()){
			   throw new RuntimeException("Deque is empty");
			  }
			  return head.data;
	 }
	 
	 public int getLast(){
			  if(isEmpty()){
			   throw new RuntimeException(" empty");
			  }
			  return tail.data;
	 }
	 
	 // Method for forward traversal
	 public void displayForward(){
			  Node current = head;
			  while(current != null){
			   current.displayDQ();
			   current = current.next;
			  }
			  System.out.println("");
	 }
	 
	 // Method to traverse and display all nodes
	 public void displayBackward(){
			  Node current = tail;
			  while(current != null){
				  current.displayDQ();
			   current = current.prev;
			  }
			  System.out.println("");
	 }

	 
	}