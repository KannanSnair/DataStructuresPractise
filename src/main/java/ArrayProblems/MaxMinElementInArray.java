package ArrayProblems;

import java.util.Scanner;

public class MaxMinElementInArray {

	public static void main(String[] args) {

		System.out.println("Enter the count of numbers to be entered");
		Scanner scan = new Scanner(System.in);
		int arrayCount = scan.nextInt();
		
		int[] array = new int[arrayCount];
		
		System.out.print("Enter the array elements to sort in ascending order");
		
		for(int i=0;i<arrayCount;i++) {
			
			Scanner scan1 = new Scanner(System.in);
			array[i] = scan1.nextInt();
		}
		
		int temp;
		for(int i=0; i<arrayCount; i++) {
			
			for(int j=0;j<arrayCount-(i+1); j++) {
				
				if(array[j] > array[j+1]) {
					
					temp = array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arrayCount;i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("Minimum value in the array is " + array[0]);
		System.out.println("Maximum value in the array is " + array[arrayCount -1]);
	}
}
