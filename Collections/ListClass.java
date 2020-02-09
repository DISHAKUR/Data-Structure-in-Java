package CollectionsPractice;

// java.util has all the lists
import java.util.*; 
public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					ListClass lc = new ListClass();
					lc.listImplementation();
					lc.arrayImplementation();
					
					System.out.println("***************************************************");
					System.out.println("***************************************************");
					System.out.println("***************palindrome*****************");
					// take input from user
					Scanner getInput = new Scanner(System.in);
					    System.out.println("Please enter new string");
						String str =  getInput.nextLine();
							
						boolean bln = lc.palindrome(str);
						if(bln) {
							System.out.println(str + " is pallidirome");
							}
					else {
								System.out.println(str+ "is not pallidirome");
						}
								
					//LinkedList 
					LLPractice lp = new LLPractice();
					
					System.out.println("***************************************************");
					System.out.println("***************************************************");
					System.out.println("***************singly Linked List*****************");
					// Add values to singly linked list
					SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
					sll.addFirst(12);
					sll.addFirst(10);
					sll.addLast(18);
					sll.addLast(19);
					sll.addLast(14);
					//System.out.println(sll.;
					//remove element
					int sizeTest = sll.size() -1;
					while(sll.size() !=  sizeTest) {
						sll.removeFirst();
					}	
					
					// found and remove the element
					sll.removeElement(12);
					sll.reverseList();
					
					System.out.println("***************************************************");
					System.out.println("***************************************************");
					System.out.println("***************Doubly Linked List*****************");
					//Doubly Linked List
					DoublyLinkedList dll = new DoublyLinkedList();
				  //insert the node at first
					dll.insertFirst(20);
					dll.insertFirst(40);
					dll.insertFirst(90);
					dll.insertFirst(60);
					
					dll.displayForward();
					dll.printEle();
					
					System.out.println("***************************************************");
					System.out.println("***************************************************");
					System.out.println("***************************************************");
					System.out.println("*************Stacks Using Arrays********************");
					// stacks using arrays
					StackUsingArray stck = new StackUsingArray();
					stck.push(12);
				   stck.push(19);
				   
				   //latest element added
				   System.out.println("Latest element added is " + stck.peek());
				   stck.push(4);
				   stck.push(11);
				   stck.push(13);
				   
				   //pop th elememnt
				   stck.pop();
				   
	}
	
	public void listImplementation() {
		
		// create a list
		
		List<Integer> listOne = new ArrayList<Integer>();
		
		//add elements to the list
		
		// add random numbers to the list
		Random ran = new Random();
		for (int i =0 ; i < 20;i++) {
			listOne.add(ran.nextInt());
		}
		//System.out.println(listOne);
		
		// remove the item from index position 2
		listOne.remove(2);
		//System.out.println(listOne);
		
		
	}
	
	public void arrayImplementation() {
		
		//create an array
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(21);
		arr.add(1);
		arr.add(321);
		arr.add(201);
		arr.add(221);
		//System.out.println(arr);
		
		//System.out.println(arr.indexOf(1));
		
		// iteration on array
		for(int a:arr) {
			//System.out.println(a);
		}
	}
	
	public boolean  palindrome(String str) {
		int i = 0;
		int j = str.length() -1;
		
			if(i <j ) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
			}
			i++;
			j++;
		}

 	return true;
	}

}
