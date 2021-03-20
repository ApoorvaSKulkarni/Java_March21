/*
 * Name : Apoorva S Kulkarni
 * Description : Displaying the second smallest integer
 * Date : 19/3/2021 
 */
import java.util.Scanner;
public class SecondSmallestInteger {

	public static void main(String[] args) {
		int[] arrayInput;
		int smallestInteger=0;
		final int arrayLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		arrayLength = sc.nextInt();
		
		arrayInput = new int[arrayLength];
		
		System.out.println("Enter the array values");
		for(int i=0; i<arrayInput.length; i++) {
			arrayInput[i] = sc.nextInt();
		}
		smallestInteger = getSecondSmallest(arrayInput);
		System.out.println("The second smallest integer in array is: "+smallestInteger);

	}
	private static int getSecondSmallest(int[] arrayInput) {
		int temp=0;
		for(int i=0; i<arrayInput.length; i++) {
			for(int j=i+1; j<arrayInput.length; j++) {
				if(arrayInput[i]>arrayInput[j]) {
					temp = arrayInput[i];
					arrayInput[i] = arrayInput[j];
					arrayInput[j] = temp;
				}
			}
		}
		int secondSmallest = arrayInput[1];
		return secondSmallest;
}
}
