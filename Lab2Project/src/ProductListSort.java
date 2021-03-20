/*
 * Name : Apoorva S Kulkarni
 * Description : To sort the product list name 
 * Date : 19/3/2021 
 */

import java.util.Arrays;
import java.util.Scanner;
public class ProductListSort {

	public static void main(String[] args) {
		String[] arrayInput;
		final int arrayLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new String[arrayLength];
		
		System.out.println("Enter the Product name");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.next();
		}
		Arrays.sort(arrayInput);
		System.out.println("The sorted array is: "+Arrays.toString(arrayInput));
				
	}

}
