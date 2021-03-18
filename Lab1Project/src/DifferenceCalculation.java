/*
 * Name : Apoorva S Kulkarni
 * Description : To find difference between sum of squares and squares of sum of first n natural numbers 
 * Date : 18/3/2021
 */

import java.util.Scanner;

public class DifferenceCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int difference = calculateDifference(num);
		System.out.println("The difference b/w sum of squares and sqaures of sum is: " +difference );
        
	}

	private static int calculateDifference(int num) {
		int difference = 0, sum1=0, sum2=0;
		if(num == 0) {
			System.out.println("The number is not a natural number");
		}
		else {
			for(int i=1; i<=num; i++) {	
				sum1 = (int) (sum1 + Math.pow(i, 2));
				sum2 = sum2 + i;
			}
			sum2 = (int) Math.pow(sum2, 2);
			difference = sum1 - sum2;
		}
		return difference;
	}

}
