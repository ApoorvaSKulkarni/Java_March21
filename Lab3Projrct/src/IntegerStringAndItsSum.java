/*
 * Name : Apoorva S Kulkarni
 * Description : To get integer input and print each integer and their sum 
 * Date : 20/3/2021 
 */

import java.util.Scanner;
import java.util.StringTokenizer;
public class IntegerStringAndItsSum {

	public static void main(String[] args) {
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer with a space gap: ");
		String inputString = sc.nextLine();
		StringTokenizer st = new StringTokenizer(inputString, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
	}

}
