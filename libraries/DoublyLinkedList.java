package CollectionLibrary;

public class DoublyLinkedList { 
	Node head; // head of list 

	/* Doubly Linked list Node*/
	class Node { 
		int data; 
		Node prev; 
		Node next; 

		// Constructor to create a new node 
		// next and previous is by default initialized as null 
		Node(int d) { data = d; } 
	} 

	// Adding a node at the front of the list 
	public void insertFromBegining(int element) 
	{ 
		/* 1. allocate node 
		* 2. put in the data */
		Node newNode = new Node(element); 

		/* 3. Make next of new node as head and previous as NULL */
		newNode.next = head; 
		newNode.prev = null; 

		/* 4. change prev of head node to new node */
		if (head != null) 
			head.prev = newNode; 

		/* 5. move the head to point to the new node */
		head = newNode; 
	} 

	/* Given a node as prev_node, insert a new node after the given node */
	public void InsertAfter(Node prev_Node, int element) 
	{ 

		/*1. check if the given prev_node is NULL */
		if (prev_Node == null) { 
			System.out.println("Previous Node cannot be Null "); 
			return; 
		} 

		/* 2. allocate node 
		* 3. put in the data */
		Node newNode = new Node(element); 

		/* 4. Make next of new node as next of prev_node */
		newNode.next = prev_Node.next; 

		/* 5. Make the next of prev_node as new_node */
		prev_Node.next = newNode; 

		/* 6. Make prev_node as previous of new_node */
		newNode.prev = prev_Node; 

		/* 7. Change previous of new_node's next node */
		if (newNode.next != null) 
			newNode.next.prev = newNode; 
	} 

	// Add a node at the end of the list 
	void insertFromEnd(int element) 
	{ 
		/* 1. allocate node 
		* 2. put in the data */
		Node newNode = new Node(element); 

		Node last = head; /* used in step 5*/

		/* 3. This new node is going to be the last node, so 
		* make next of it as NULL*/
		newNode.next = null; 

		/* 4. If the Linked List is empty, then make the new 
		* node as head */
		if (head == null) { 
			newNode.prev = null; 
			head = newNode; 
			return; 
		} 

		/* 5. Else traverse till the last node */
		while (last.next != null) 
			last = last.next; 

		/* 6. Change the next of last node */
		last.next = newNode; 

		/* 7. Make last node as previous of new node */
		newNode.prev = last; 
	} 
	
	// Function to delete a node in a Doubly Linked List. 
    // head_ref --> pointer to head node pointer. 
    // del --> data of node to be deleted. 
    void deleteNode(Node head_ref, Node del) 
    { 
  
        // Base case 
        if (head == null || del == null) { 
            return; 
        } 
  
        // If node to be deleted is head node 
        if (head == del) { 
            head = del.next; 
        } 
  
        // Change next only if node to be deleted 
        // is NOT the last node 
        if (del.next != null) { 
            del.next.prev = del.prev; 
        } 
  
        // Change prev only if node to be deleted 
        // is NOT the first node 
        if (del.prev != null) { 
            del.prev.next = del.next; 
        } 
  
        // Finally, free the memory occupied by del 
        return; 
    }

	//prints contents of linked list 
	public void printlist() 
	{   
		Node node = head;
		Node last = null; 
		System.out.println("forward Direction"); 
		while (node != null) { 
			System.out.print(node.data + "--> "); 
			last = node; 
			node = node.next; 
		} 
		System.out.println(); 
		System.out.println(" reverse direction"); 
		while (last != null) { 
			System.out.print(last.data + "--> "); 
			last = last.prev; 
		} 
	} 

} 

