package CollectionLibrary;

public class QueueUsingLinkedList {
			
	     // a create a node 
			public class Node{
					int data;
					Node next;
					
//					public  Node(int ele) {
//						this.data = ele;
//						this.next = null;
//					}
			}
			// create 2 variables for head and tail
			public Node front = null;
			public Node rear = null;
			
			// insert in the queue
			public void enqueue(int ele) {
					// create a node
				Node temp = new Node();
						temp.data = ele;
						temp.next = null;
								
								// if queue is empty
								if(front == null && rear == null) {
									front = rear = temp;
									return;
								}
								
								// now my rear will temp address
								// and my temp will become rear
								rear.next = temp;
								rear = temp;
			}
			
			// remove from the front or from the top
			public void dequeue() {
				// create a temp queue and make it as front
				Node temp = front;
				// if queue is null
				if(front == null) return;
				if(rear == front) {
					front = rear = null;
				}
				// else point front next as front node now
				front = front.next;
				
				
		 }
			
	
	
}
