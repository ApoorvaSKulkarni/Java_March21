/*
 * Name : Apoorva S Kulkarni
 * Description : To find sum of N numbers divisible by 3 or 5
 * Date : 18/3/2021
 */

import java.util.Scanner;

public class SumofNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = calculateSum(num);
		System.out.println("The Sum of natural numbers divisible by 3 or 5 is: " +sum );
        
	}

	private static int calculateSum(int num) {
		int sum =0;
		for(int i=1; i<=num; i++) {
			if(i%3==0 || i%5==0)
				sum = sum + i;
		}
		return sum;
	}

}
