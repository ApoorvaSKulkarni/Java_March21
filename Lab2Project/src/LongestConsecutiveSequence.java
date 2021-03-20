/*
 * Name : Apoorva S Kulkarni
 * Description : To find the length of longest consecutive sequence in an unsorted array
 * Date : 19/3/2021 
 */

import java.util.Scanner;
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arrayInput;
		int length=0;
		final int arrayLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new int[arrayLength];
		
		System.out.println("Enter the array values");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.nextInt();
		}
		length = longConsecutiveSeq(arrayInput);
		System.out.println("The length of longest consecutive sequence in the array is: "+length);
	}

	private static int longConsecutiveSeq(int[] arrayInput) {
		int temp=0, length=0;
		for(int i=0; i<arrayInput.length; i++){
			for(int j=i+1; j<arrayInput.length; j++) {
				if(arrayInput[i]>arrayInput[j]) {
					temp = arrayInput[i];
					arrayInput[i] = arrayInput[j];
					arrayInput[j] = temp;
				}
			}
		}
		/*System.out.println("The sorted array is: ");
		for(int i=0; i<arrayInput.length; i++) {
			System.out.println(" "+arrayInput[i]);
		}*/
		
		for(int i=0; i<arrayInput.length-1; i++) {
			if(arrayInput[i]-arrayInput[i+1] == -1)
				length++;
		}
		return length+1;
	}

}
