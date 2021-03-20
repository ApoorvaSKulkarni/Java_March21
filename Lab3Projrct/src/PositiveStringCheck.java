/*
 * Name : Apoorva S Kulkarni
 * Description : Check if the string is positive or not
 * Date : 20/3/2021 
 */

import java.util.Scanner;
public class PositiveStringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = sc.next();
		if(checkString(inputString)) {
			System.out.println("The string is positive");
		}
		else {
			System.out.println("The string is negative");
		}
	}

	private static boolean checkString(String inputString) {
		boolean flag=false;
		char ch1,ch2;
		for(int i=0; i<inputString.length()-1; i++) {
			ch1 = inputString.charAt(i);
			ch2 = inputString.charAt(i+1);
			if(ch1<=ch2) {
				flag = true; 
			}
			else {
				flag = false;
		}
		}
		if(flag) {
			return true;
		}
		return false;
	}

}
