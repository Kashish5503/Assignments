package JalaAssignments;

import java.util.Collections;

public class Arrays 
{
	public static void main(String[] args)
	{
		//Write a function to add integer values of an array.
		int[] arr = {1,3,5,7,9};
		int sum = 0;
		int avr = 0;
		for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i]; 
	           avr = sum / arr.length;
	           System.out.println("Element at index " + i + " is: " + arr[i]);
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);
	        //Write a function to calculate the average value of an array of integers.
	        System.out.println("Average value of all the elements of an array: "+avr);
	        
	        //Write a function to test if array contains a specific value.
	        int[] num = {1, 2, 3, 4, 5};
	        int toFind = 5;
	        boolean found = false;

	        for (int n : num) {
	          if (n == toFind) {
	            found = true;
	            break;
	          }
	        }
	        
	        if(found)
	          System.out.println(toFind + " is found.");
	        else
	          System.out.println(toFind + " is not found.");
	        
	        //Write a function to remove a specific element from an array.
	        int index = 0;
	        System.out.println("New array: ");
	        for (int i = index; i < arr.length - 1; i++) 
	        {
	            arr[i] = arr[i + 1];
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	        //Write a function to copy an array to another array.
	        int[] arr1 =  arr;
	        System.out.println(java.util.Arrays.toString(arr1));
	        
	        //Write a function to insert an element at a specific position in the array.
	        String sentence = "Ka his ";
			char[] sentence1 = sentence.toCharArray();
			sentence1[6]= 'h'; // Element h is added
			sentence1[2]= 's'; // Element s is added
			System.out.println(sentence1);
	        
			//Write a function to find the minimum and maximum value of an array.
			int[] arr4 = {30,20,40,10,70,90,60,50,80};
			java.util.Arrays.sort(arr4); //Sorting array in ascending order.
			System.out.println("Minimum value in array: "+arr4[0]); //Lowest value at start.
			System.out.println("Maximum value in array: "+arr4[8]); //Highest value at end.
			
			//Write a function to reverse an array of integer values.
			Integer[] arr5 = {13,7,45,21,9,100};  
	        // Sorts arr5[] in descending order using
	        // reverseOrder() method of Collections class
	        // in Array.sort() as an argument to it
	        java.util.Arrays.sort(arr5, Collections.reverseOrder());
	        // Printing the array as generated above
	        System.out.println("Array in Reverse order: "+java.util.Arrays.toString(arr5));
	        
	        //Write a function to find the duplicate values of an array.
	        int[] arr6 = {4,5,45,54,5,4};
	        System.out.println("Given Array: "+java.util.Arrays.toString(arr6));
	        System.out.println("Duplicate elements in given array: ");
	        for(int i = 0; i <arr6.length; i++)
	        {
	        	for(int j = i + 1; j < arr6.length; j++)
	        	{
	        		if(arr6[i] == arr6[j])
	        		System.out.println(arr6[j]);
	        	}
	        }
	        
	        //Write a program to find the common values between two arrays.
	        int[] arr7 = {1,3,5,4,7,9};
	        int[] arr8 = {2,6,4,5,8,0};
	        for ( int i = 0; i < arr7.length; i++)
	        {
	        	for ( int j = 0; j < arr8.length; j++)
	        	{
	        		if ( arr7[i] == arr8[j])
	        			System.out.println("Common elements b/w arr7 & arr8: "+arr7[i]);
	        	}
	        }
	}
}
