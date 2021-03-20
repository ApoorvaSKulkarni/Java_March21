/*
 * Name : Apoorva S Kulkarni
 * Description : Accept a String and replaces all the consonants in the String with the next alphabet 
 * Date : 20/3/2021 
 */

import java.util.Scanner;
public class AlterStringWithNextConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = sc.nextLine();
		System.out.println(alterString(inputString.toCharArray()));
		

	}

	private static String alterString(char[] inputString) {
		for(int i=0; i<inputString.length; i++) {
			if(!isVowel(inputString[i])) {
				if(inputString[i] == 'z') {
					inputString[i] = 'b';
				}
				else {
					inputString[i] = (char) (inputString[i]+1);
					
					if(isVowel(inputString[i])) {
						inputString[i] = (char) (inputString[i]+1);
					}
				}
			}
		}
		return String.valueOf(inputString);
	}

	private static boolean isVowel(char character) {
		if(character != 'a' && character != 'e' && character != 'i' && character != 'o' && character != 'u') {
			return false;
		}
		else
		return true;
	}

}
