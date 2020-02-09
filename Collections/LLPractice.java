package CollectionsPractice;
import java.util.*;

public class LLPractice {

		public LLPractice() {
		// create a linkedlist object
			LinkedList<Integer> lll = new LinkedList<Integer>();
	
			// add elements to LL
	       lll.add(21);
	       lll.add(1);
	       lll.add(291);
	       lll.add(251);
	       lll.add(213);
	
	       //add at first
	       lll.addFirst(29);
	       
	       System.out.println(lll);
	       
	       //access the element
	       System.out.println("Get the first element of the list : " + lll.getFirst());   
	       
	       //adding the element at the specific position

		}
}