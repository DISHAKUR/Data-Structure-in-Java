package CollectionLibrary;

public class StacksUsingQueues {

	 QueueUsingArray q1, q2;

	// Constructor
	public StacksUsingQueues() {
		q1 = new QueueUsingArray();
		q2 = new QueueUsingArray();
	}

	// Insert an item into the stack
	void add(int data)
	{
		// Move all elements from the first queue to the second queue
		while (!q1.isEmpty()) {
			//q2.enqueue(q1.dequeue());
//			q2.add(q1.peek());
//			q1.poll();
			q2.enqueue(q1.front());
			q1.dequeue();
		}

		// Push item into the first queue
		q1.enqueue(data);
		
		// Move all elements back to the first queue from the second queue
		while (!q2.isEmpty()) {
			q1.enqueue(q2.dequeue());
		}
	}

	// Remove the top item from the stack
	public int poll()
	{
		// if first queue is isEmpty
		if (q1.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(0);
		}

		
		// return the front item from the first queue
				int front = q1.front();
				q1.dequeue();

				return front;

	}
	
	// traversing the stacks
		public void  displayQueue() {
					q1.displayQueue();
					q2.displayQueue();
		}	

}