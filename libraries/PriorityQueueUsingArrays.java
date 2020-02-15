package CollectionLibrary;

public class PriorityQueueUsingArrays {

	 // create a front and rear
	// initially -1 index
	public int front = -1;
	public int rear = -1;
	public int max = 10;
	 int arrayPQ[] = new int[max]; 
	
	// insertion in priorityQueue
	// the numbers itself are the priorties
	// like 12 has high priority and 2 has lower as compaer to 12
	
	public int itemCount = 0;

	public int peek(){
	   return arrayPQ[itemCount - 1];
	}

	public boolean isEmpty(){
	   return itemCount == 0;
	}

	 // check if queue is full
	public boolean isFull(){
	   return itemCount == max;
	}

	 // size of the queue
	int size(){
	   return itemCount;
	}  

	 // insertion
	public void insert(int data){
	   int i = 0;

	   if(!isFull()){
	      // if queue is empty, insert the data 
	      if(itemCount == 0){
	         arrayPQ[itemCount++] = data;        
	      }else{
	         // start from the right end of the queue 
				
	         for(i = itemCount - 1; i >= 0; i-- ){
	            // if data is larger, shift existing item to right end 
	            if(data > arrayPQ[i]){
	               arrayPQ[i+1] = arrayPQ[i];
	            }else{
	               break;
	            }            
	         }  
				
	         // insert the data 
	         arrayPQ[i+1] = data;
	         itemCount++;
	      }
	   }
	}

	 // removal
	int removeData(){
	   return arrayPQ[--itemCount]; 
	}
	
	// display
	public void displayPQ() {
		for (int i =0;i< this.itemCount ; i++) {
			System.out.print(arrayPQ[i] + " |");
		}
		System.out.println();
	}
	
}
