/*
 * Name : Apoorva S Kulkarni
 * Description : To sort the array in an alphabetical order and convert them into upper and lower case 
 * Date : 19/3/2021 
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {

	public static void main(String[] args) {
		String[] arrayInput, sortedArray;
		final int arrayLength;
						
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new String[arrayLength];
		
		System.out.println("Enter the array values");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.next();
		}
		sortStrings(arrayInput);
								
	}

	private static void sortStrings(String[] arrayInput) {
		//String arrayElement;
		//String[] upperCase, lowerCase;
		Arrays.sort(arrayInput);
		System.out.println("The sorted array according to alphabetical order is: "+Arrays.toString(arrayInput));
		for(int i=0; i<arrayInput.length; i++) {
			System.out.println(" "+arrayInput[i]);
		}
		for(int i = 0; i<=(arrayInput.length/2)-1; i++) {
			arrayInput[i].toUpperCase();
		}
		for(int i = arrayInput.length/2; i<=arrayInput.length-1; i++) {
			arrayInput[i].toLowerCase();
		}
		System.out.println("The output array is: ");
		for(int i=0; i<arrayInput.length; i++) {
			System.out.println(" "+arrayInput[i]);
		}
		
		/*for(int i=0; i<=(arrayInput.length/2)-1; i++)
			upperCase[i]=arrayInput[i];
		for(int i = arrayInput.length/2; i<=arrayInput.length-1; i++)
			lowerCase[i]=arrayInput[i];
		
		for(int i=0; i<upperCase.length; i++) {
			arrayElement = upperCase[i];
			arrayElement.toUpperCase();
			upperCase[i] = arrayElement;
			}
		for(int i=0; i<lowerCase.length; i++) {
			arrayElement = lowerCase[i];
			arrayElement.toLowerCase();
			lowerCase[i] = arrayElement;
			}
		System.arraycopy(upperCase, 0, arrayInput, 0, upperCase.length);
		System.arraycopy(lowerCase, 0, arrayInput, upperCase.length, lowerCase.length);
		
		System.out.println("The sorted array is: ");
		for(int i=0;i<arrayInput.length; i++) {
			System.out.println(" "+arrayInput[i]);
		}*/
	}

}
