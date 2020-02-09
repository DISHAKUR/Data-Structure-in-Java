package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Selection Sort

- searching + sorting
- find the lowest element from unsortted array
- put/replace  it in the begining
- find min in unsorted array
- moved to the sorted array
- compare the frst element with all the elements - nd then
replace the min ele with frst element
- now compare the econd ele with the remaining array and replce it with the min ele


algo maintains 2 subarrays:
1. subarray which is sorted
2. remaining subarray which is unsorted

1. loop for all the elemnets
2. loop for searching - so will start the loop keeping the frst elemnt and 

3. check the */

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(int[] array_numbers) {
		// TODO Auto-generated method stub
		//RandomNumbers random = new RandomNumbers();
		
		int[] unsortArray = RandomNumbers.generateArr();
		//System.out.println(Arrays.toString(unsortArray));
		sortArr(unsortArray);

	}

	public static int[] sortArr(int[] unsortArray) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(unsortArray));
		// loop on all the elements
		
		// let min_index be 0
		int min_index = 0;
		int temp;
		for (int i =0; i<unsortArray.length ;  i ++) {
					// find the smallest element
			 
	
			// start with i+1 as , we need to sort on the remaining elements
			
				for (int j = i+1; j < unsortArray.length ; j++) {
							if(unsortArray[j] < unsortArray[min_index]) {
									 min_index = j;
								   //      j =  min_index;
							}
						
				}
				//swap the values
				temp  = unsortArray[i];
				unsortArray[i] = 	unsortArray[min_index];
				unsortArray[min_index] = temp;
					
		}
		
		System.out.println(Arrays.toString(unsortArray));
		return unsortArray;
	}



}
