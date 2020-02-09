package Sorting_Algorithms;

public class BinarySearch {

	// Binary Search : 1. array should be sorted
	// choose l -  left most index , r - right most index , m - middle index , target - element to be search
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				int[] array_numbers  = RandomNumbers.generateArr();
				
				BinarySearch bs = new BinarySearch();
				
			
				int tar = 35;
				int l = array_numbers[0];
				int r = array_numbers[array_numbers.length - 1];
				
				// sort the array
				//SelectionSort ss = new SelectionSort();
				int[] sorted_arr = SelectionSort.sortArr(array_numbers);
				
				int index = bs.binarySearch(array_numbers,l,r,tar);
				if(index == -1) {
					System.out.println("Number is not present in the array");
					
				}else {
					System.out.println("Number is present at index " + index);
				}
	}

	private int binarySearch(int[] array_numbers, int l, int r, int tar) {
		// TODO Auto-generated method stub
		// start with while loop to check the index of left is not
		// greater than that of right
		
		while(l <= r) {
			
			// find the middle element
			int m = l + (l+r)/2;
			
			// look for element in the middle
			// if its present in the middle return and don't look for further
			if(array_numbers[m] ==  tar) {
					return m;
			}
			//if target element is smaller than middle element
			// then no need to search at right.. as index will be smaller
			if(array_numbers[m] > tar) {
				// change the index of right 
			  	 r = m-1;
			}else {
				// if target element is larger than middle element
				// then no need to search at left side
					l = m + 1;
				
			}
			
		}
		return -1;
	}

	

}
