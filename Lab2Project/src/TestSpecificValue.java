/*
 * Name : Apoorva S Kulkarni
 * Description : To test if an array contains specific value
 * Date : 19/3/2021 
 */

import java.util.Scanner;
public class TestSpecificValue {

	public static void main(String[] args) {
		final int arrayLength;
		int[] arrayInput;
		int searchElement;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new int[arrayLength];
		
		if(arrayInput.length > 0)
			System.out.println("Enter the array values");
		for(int i=0; i<arrayInput.length; i++)
			arrayInput[i] = sc.nextInt();
		
		System.out.println("Enter the specific value to search : ");
		searchElement = sc.nextInt();
		
		for(int i=0; i<arrayInput.length; i++) {
			if(arrayInput[i] == searchElement) {
				System.out.println("The element is found at the location : "+(i+1));
			}
		}
	}

}
