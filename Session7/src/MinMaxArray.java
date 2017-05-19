//Write a Java Program to find the maximum and minimum value of an array.

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int [] myArray = {30,2,3,6,5,6,7,8,4,9 };
		
		Arrays.sort(myArray); //sorted in ascending order to get the minimum and maximum value
		
		System.out.println("Minimum value inside an array is: " + myArray[0]+"\nMaximum value inside an array is: " + myArray[(myArray.length-1)]); 
		//Max Value Arrays.length-1 gives us the last element of an array.
		
		
		
		
		
		
		
		
		

	}

}
