package CollectionLibrary;


// basic operations in queue:  

// enqueue - insertion at the end
// dequeue : deletion from the front
// variable : front n end

// constant time  : O(1)

public class QueueUsingArray {
	
		// create a aqueue
		int[] queue = new  int[5];
		
		// create a variable
		// initially front and rear will point to 0 as no item is added
		int capacity = queue.length;
		int front = 0;
		// pointing to the last the element
		int rear = this.capacity -1;
		int currentSize = 0 ;
		//caapcity of the queue
	
		QueueUsingArray(){
			int front = 0;
			// pointing to the last the element
			int rear = this.capacity -1;
		}
		
		// insertion at the top
		 public void enqueue(int element) {
			 // if queue is full
					 if(isFull()) {
						 	System.out.println("Queue is full");	 
					 } else {
						  //increment the rear value in the circular fashion
						 
							this.rear = (this.rear + 1) % this.capacity;
							this.queue[this.rear] = element;
					    	this.currentSize ++;
//							System.out.println("Queue:");
							//System.out.println("Front : " +  this.front +  " and Rear : " +  this.rear);
 
					
							//this.displayQueue();
					 }		
			}
		
		 //check if queue is full
		 // if capacity and size are equal
		 public boolean isFull() {
			// System.out.println(getSize());
			 //System.out.println(capacity);
			 	return getSize() == this.capacity;
		 }
		 
		 //get the currentsize of queue
		 public int getSize() {
			 	//return this.currentSize;
			 	 this.currentSize = (this.capacity + this.rear - this.front) % this.capacity;
			 return  this.currentSize ;
		 }
		 
		 //check if queue is empty
		 public boolean isEmpty() {
			 return getSize() == 0;
		 }
		 
		 // deletion from the rear
		 public int dequeue() {
			 // if queue is empy 
			 // nothing to remove
			 if(isEmpty()) {
				 System.out.println("Queue is empty");
				 return (Integer) null;
			 }else {
				 // remove item from the front
				 // increment the size of front  - > circular fashion
				    int ele = queue[this.front];
				 	this.front  = (this.front +1) % this.capacity;
				 	this.currentSize --;
				 	//System.out.println("Front : " +  this.front +  " and Rear : " +  this.rear);
					//this.displayQueue();
					return ele;
			 }
				
		 }
		 
		 
		 // traversing the queue
			public void  displayQueue() {
//						for(int i = 0 ; i < currentSize  ; i++) {
//							System.out.print(queue[(front+1)%this.capacity] + " | " );
//						}
//						System.out.println();
				int i;  
			    if(rear == -1)  
			    {  
			        System.out.println("\nEmpty queue\n");  
			    }  
			    else  
			    {  
			        for(i=front;i<=rear;i++)  
			        {  
			        	System.out.println("Printing queue");
			            System.out.println(queue[i]);  
			        }     
			    } 
			}	
			
			// get the value at the front
			public int front() {
					if(this.isEmpty()) {
							return 0;
						}else {
							return queue[front];
						}			
			}
				
			// get the value at the rear
			public int rear() {
				if(this.isEmpty()) {
						return 0;
					}else {
						return queue[rear];
					}			
		}
			
				
}
