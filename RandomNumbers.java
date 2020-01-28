package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public RandomNumbers() {
		// TODO Auto-generated constructor stub
	
			}
	
	public static int[] generateArr() {

			 // initialise scanner 
			// system.in - to take input
	
			//take the input from the User
				Scanner getInput = new Scanner(System.in);
				System.out.println("Please enter new number");
				int num =  getInput.nextInt();
				
				System.out.println(num);
				// generate an array of random numbers
				Random ran = new Random();
				
				// loop to generate the random array
				
				//initialise the arrya with the size
				int[] arr = new int[num];
				for (int i=0;i<arr.length;i++) {
					arr[i] = ran.nextInt(100);
					System.out.println(arr[i]);
				}
				System.out.println(Arrays.toString(arr));
				// return array
				return arr;
 		}
	}


