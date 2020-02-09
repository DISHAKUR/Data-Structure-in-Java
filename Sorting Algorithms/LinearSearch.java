package Sorting_Algorithms;

public class LinearSearch {

	public static void main(String[] args) {

			int[] arr = RandomNumbers.generateArr();
			LinearSearch ls = new LinearSearch();
			int ans  = ls.searchLinear(arr);
			if(ans == -1) {
				System.out.println("Number is not present in the array");
				
			}else {
				System.out.println("Number is present at index " + ans);
			}
	}

	public int searchLinear(int [] arr) {
		// sequential search
		int tar = 50;
		 for(int i = 0;i<arr.length;i++){
				if(arr[i] == tar){
					return i;
				}
		 }
		  return -1;
		
	}

}
//
//Linear Search
//
//To find a target value in an array



// analysis
//
//1. Best case : element is at first poistion i.e at index 0
//2. Worst Case : Element is at the last position i.e at the position n-1
//or element is not present in the array


  