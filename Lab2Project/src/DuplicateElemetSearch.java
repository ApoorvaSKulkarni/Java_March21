/*
 * Name : Apoorva S Kulkarni
 * Description : To find the duplicate element in the array 
 * Date : 19/3/2021 
 */

import java.util.Scanner;
public class DuplicateElemetSearch {

	public static void main(String[] args) {
		int[] arrayInput = {14, 2, 31, 5, 4, 2, 31, 55};
		System.out.println("The duplicate numbers are: ");
		for(int i = 0; i < arrayInput.length; i++) {  
            for(int j = i + 1; j < arrayInput.length; j++) {  
                if(arrayInput[i] == arrayInput[j])  
                    System.out.println(arrayInput[j]);  
            }  
        }  
		
		/*String[] arrayInput;
		final int arrayLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new String[arrayLength];
		
		System.out.println("Enter the array values");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.next();
		}
		
		System.out.println("The duplicate numbers are: ");
		for(int i = 0; i < arrayInput.length; i++) {  
            for(int j = i + 1; j < arrayInput.length; j++) {  
                if(arrayInput[i] == arrayInput[j])  
                    System.out.println(arrayInput[j]);  
				}
		   }*/
		}
	}

