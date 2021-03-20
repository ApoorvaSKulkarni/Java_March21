/*
 * Name : Apoorva S Kulkarni
 * Description : Counting the positive, negative, odd, even numbers and zeros from 20 integers
 * Date : 19/3/2021 
 */

import java.util.Scanner;
public class CountingIntegers {
	private static void countIntegers(int[] arrayInput) {
		int positiveNum=0, negativeNum=0, evenNum=0, oddNum=0, zeroNum=0, rem=0;
		for(int i=0; i<20; i++) {
			if(arrayInput[i]>0) {
				positiveNum++;
			}else if(arrayInput[i]<0) {
				negativeNum++;
			}
			else 
				zeroNum++;
			
			rem = arrayInput[i]/2;
			if(rem==0)
				evenNum++;
			else
				oddNum++;
		}
		System.out.println("The number of positive numbers in the array is: "+positiveNum);
		System.out.println("The number of negative numbers in the array is: "+negativeNum);
		System.out.println("The number of even numbers in the array is: "+evenNum);
		System.out.println("The number of odd numbers in the array is: "+oddNum);
		System.out.println("The number of zero in the array is: "+zeroNum);
	}
	
	public static void main(String[] args) {
		int[] arrayInput = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 20 array values");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.nextInt();
		}
		countIntegers(arrayInput);

	}

}
