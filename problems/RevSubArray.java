    // program to check whether reversing a  
// sub array make the array sorted or not 

/*
Input : arr [] = {1, 2, 5, 4, 3}
Output : Yes
By reversing the subarray {5, 4, 3}, 
the array will be sorted.

Input : arr [] = { 1, 2, 4, 5, 3 }
Output : No

*/

import java.util.Scanner;
import java.util.*;

public class RevSubArray{


	public static void p(Object s){
	   System.out.println(s);
	}




    public static boolean checkReverse(int arr[], int n) { 
        // Copying the array.  
        int temp[] = new int[n]; 
        for (int i = 0; i < n; i++) { 
            temp[i] = arr[i]; 
        } 
  
        // Sort the copied array.  
        Arrays.sort(temp); 
  
        // Finding the first mismatch.  
        int front; 
        for (front = 0; front < n; front++) { 
            if (temp[front] != arr[front]) { 
                break; 
            } 
        } 
  
        // Finding the last mismatch.  
        int back; 
        for (back = n - 1; back >= 0; back--) { 
            if (temp[back] != arr[back]) { 
                break; 
            } 
        } 
  
        // If whole array is sorted  
        if (front >= back) { 
            return true; 
        } 
  
        // Checking subarray is decreasing or not.  
        do { 
            front++; 
            if (arr[front - 1] < arr[front]) { 
                return false; 
            } 
        } while (front != back); 
  
        return true; 
    } 
 

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr={1,2,5,4,3};

		p(checkReverse(arr,5));
	}
}
