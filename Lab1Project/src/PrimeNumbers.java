/*
 * Name : Apoorva S Kulkarni
 * Description : To print prime numbers up to the entered number
 * Date : 13/3/2021
 */

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till where prime numbers has to be printed:");
		int num = sc.nextInt();
		System.out.println("The Prime numbers are: ");
		printPrime(num);
	}

	private static boolean checkPrime(int num) {
		if (num<=1)
			return false;
		for(int i=2; i<num; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

	private static void printPrime(int num) {
		 for(int i=2; i<=num; i++) {
			 if(checkPrime(i))
				 System.out.println(i+" ");
		 }
		
	}

}
