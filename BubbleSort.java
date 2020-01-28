package Sorting_Algorithms;

public final class BubbleSort {

	/*
	 * Sorting: arranging the daat in some logical order. int value: ascending or
	 * descending order string value: dic order ( a to z)
	 * 
	 * Bubble Sort comparison algorithm - compares 2 adjacent algorithms and if
	 * they are not in any particular order then swap the elements Example: Round 1:
	 * 36 19 29 12 5 1. compare 36 and 19 - swap the elements: 19 36 29 12 5 2. now
	 * compare 36 and 29 - swap the elements  19 29 36 12 5 ..
	 * 
	 * 19 29 12 5 36 // largest element at the last
	 * 
	 * and it will continue the round 2: 1. compares 19 and 29 ..don't swap as 19 is
	 * lowest 2. at the end of the round: second largest at the second last position
	 * and largest at last position ..
	 * 
	 * next round will start.. the number of operation at each round will start
	 * reducing.
	 * 
	 * (Number of Rounds = Number of total elements - 1)
	 */

	
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareInt();
		compareString();
	
	}
	
	public static void compareInt() {
		// take an array of elements - integer

		int[] a = {37,88,22,12,4};

		// lop for rounds
		for (int i =0;i<a.length;i++)
		{
			
			int flag = 0; // we need to check, if elements is already sorted then don't check
			// take a temp value to store temp value
			// loof for all the elements
			// put a.length-1-i - as after 1st round we don't need last element, as it is already at the last
			 for(int j = 0;j<a.length-1 - i;j++)
			 {
				 int temp;
				// compare the 2 adjancent elements
					if(a[j] > a[j+1]){
					// if true swap the emlements
							temp = a[j];
							a[j] =  a[j+1];
							a[j+1] = temp;
							flag = 1; // set the flag value to 1 , which means swap was done
					}
			 }
			 if(flag == 0) break; // if elements were not compared and swapped then break the loop
			
			
		}
		for (int i =0;i<a.length;i++){
		    	System.out.println(a[i] +  "" );
			
		}

	}
	
	
	// bubble sort for strings:
	
	public static void compareString() {
		// take an array of elements - integer

		String[] a = {"Devyani" , "Digvijay" , "Shesh" , "Shekhar" ,"Disha"};

		// lop for rounds
		for (int i =0;i<a.length;i++)
		{
			
			int flag = 0; // we need to check, if elements is already sorted then don't check
			// take a temp value to store temp value
			// loof for all the elements
			// put a.length-1-i - as after 1st round we don't need last element, as it is already at the last
			 for(int j = 0;j<a.length-1 - i;j++)
			 {
				 String temp;
				// compare the 2 adjancent elements
					if(a[j] .compareTo(a[j+1]) > 0){
					// if true swap the strings
							temp = a[j];
							a[j] =  a[j+1];
							a[j+1] = temp;
							flag = 1; // set the flag value to 1 , which means swap was done
					}
			 }
			 if(flag == 0) break; // if elements were not compared and swapped then break the loop
			
			
		}
		for (int i =0;i<a.length;i++){
		    	System.out.println(a[i] +  "" );
			
		}

	}
	
	

}
