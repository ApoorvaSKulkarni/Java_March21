/*
 * Name : Apoorva S Kulkarni
 * Description : Modifying the input integer string such that each digit in the new number is equal to the difference between consecutive digits
 * Date : 20/3/2021 
 */
import java.util.Scanner;
public class ModifyNumber {

	public static void main(String[] args) {
		String resultString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String inputString = sc.next();
		
		resultString = modifyNumber(inputString);
		System.out.println("The new number: "+resultString);
	}

	private static String modifyNumber(String inputString) {
		int num1, num2, num3, outputString=0;
		for(int i=0; i<inputString.length()-1;i++) {
			num1 = inputString.charAt(i);
			num2 = inputString.charAt(i+1);
			num3 = Math.abs(num1-num2);
			outputString = outputString*10 + num3;
		}
		num3 = Integer.parseInt(inputString);
		outputString = outputString*10 + num3%10;
		return String.valueOf(outputString);
	}

}
