/*
 * Name : Apoorva S Kulkarni
 * Description : To check if a number is in increasing order
 * Date : 18/3/2021
 */

import java.util.Scanner;

public class IncreasingNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(checkNumber(num)) 
			System.out.println("The number is not an increasing number");
		else
			System.out.println("The number is an increasing number");

	}

	private static boolean checkNumber(int num) {
		boolean flag=false;
		int presentRem = num%10;
		num = num/10;
		
			while(num!=0) {
				if(presentRem <= num%10) {
					flag = true;
				}
				presentRem = num%10;
				num = num/10;
			}
			
			if(flag)
				return true;
		    else
		        return false;
	}

}
