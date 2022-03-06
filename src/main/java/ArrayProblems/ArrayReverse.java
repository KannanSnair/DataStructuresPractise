package ArrayProblems;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {

		System.out.println("Enter the String to Reverse: ");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		
		char[] charArray = data.toCharArray();
		char[] newCharArray = new char[charArray.length];
		
		for(int i= charArray.length,j=0; i>0; i--,j++) {
			
			newCharArray[j] = charArray[i-1];
		}
		
		System.out.println(newCharArray);
	}

}
