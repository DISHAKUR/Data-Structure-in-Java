package Sorting_Algorithms;

import java.util.Arrays;

// Partition - divide Conquer
//Quick Sort
//
//- pivot
//Partition Exchange sort
//- efficient sorting algo
//
//- Divide and Conquer
//- choose any element as pivot
//1. choose first or last element as pivot elment
//2. choose a median element
//3. Random element
//
//--  partition the array with pivot:
//and then start checking if all elemnts from pivot - left lements are smaller then pivot and all the elements in the right are larger than pivot
//start swapping the elemnts, if the element at right is smaller then pivot.
//
//after this is done-
//then select next pivot element.
//from left side - and perform opertaion
//
//and for right side as well.

public class QuickSort {
			
				public static void main(String[] args) {
					// TODO Auto-generated method stub
				    	int[] arr = RandomNumbers.generateArr();// create an array
						// get the length - arr.length
				    	int len = arr.length;
				    	// pass the array , 0 index and last index to the method
				    	
				    	QuickSort qs = new QuickSort();
				    	qs.quickSortRecursion(arr, 0,len -1);
				    	
				    	System.out.println("Sorted Array using Quick Sort : " +  Arrays.toString(arr));
				}
			
		//	create a partition method -
			public int partition(int[] arr, int low, int high) {
				
							// set the pivot value: middle 
						int pivot = arr[(low + high)/2];
						
						while(low <= high){
							
							// compare the values of pivot to its left values
							// if value is low , then increase the index, that is go to next
							// next value or check the next value
							while(arr[low] < pivot)
							{
								low++;
								System.out.println(arr[low]);
							}
							
							// similarily do for the right elements
							// start from the last value of array 
							// compare it with pivot value, if its high
							// then jump to second last index -  otherwise,
							// move/ swap to the left
							
							while(arr[high] > pivot)
							{
								high--;
							}
							
							
							// if numbers at low index and high 
							if(low <= high){
								
								int temp = arr[low];
								arr[low] = arr[high];
								arr[high] = temp;
								
								low++;
								high--;
							}
							
						}
						return low;
			}	
			
			// use of recursion
			
			public void quickSortRecursion(int[] arr, int low, int high){
				int pi = partition(arr,low,high);
					// recusion for left
					if(low < pi- 1){
							quickSortRecursion(arr,low,pi-1);
					}
					// recursion for right side
					if(pi < high){
							quickSortRecursion(arr,pi,high);
					}
			}

}
