/*
 * Name : Apoorva S Kulkarni
 * Description : To check if a number is power of two
 * Date : 18/3/2021
 */

import java.util.Scanner;

public class NumberPowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(checkNumber(num)) 
			System.out.println("The number is power of 2");
		else
			System.out.println("The number is not power of 2");
		
     	}

	private static boolean checkNumber(int num) {
		if(num==0)
		    return false;
		else 
		return (int)(Math.ceil((Math.log(num) / Math.log(2)))) == (int)(Math.floor(((Math.log(num) / Math.log(2)))));
		
		}

}
