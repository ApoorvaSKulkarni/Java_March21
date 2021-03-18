/*
 * Name : Apoorva S Kulkarni
 * Description : To find sum of cubes of the digits of a number
 * Date : 13/3/2021
 */

import java.util.*;
public class CubeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The Cube Sum of " +num );
        cubeSumCompute(num);
	}

	private static void cubeSumCompute(int num) {
		int sum = 0, rem;
		while(num!=0) {
			rem = num%10;
			sum = (int) (sum + Math.pow(rem, 3));
			num = num/10;
		}
		System.out.println(" "+sum);
	}

}
