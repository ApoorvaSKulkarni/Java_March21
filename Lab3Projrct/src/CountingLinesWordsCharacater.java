/*
 * Name : Apoorva S Kulkarni
 * Description : Counting the number of lines, character and words in the input string
 * Date : 20/3/2021 
 */

import java.util.Scanner;
public class CountingLinesWordsCharacater {

	public static void main(String[] args) {
		int character=0, word=0, line=0;
		char ch;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the string: ");
		//String inputString = sc.next();
		String inputString = "Hello World.";
		for(int i=0; i<inputString.length();i++) {
			ch = inputString.charAt(i);
			character++;
			if(ch == ' ') {
				word++;
			}
			else if(ch == '.') {
				line++;
			}
		}
		System.out.println("The number of characters are: "+(character-word-line));	
		System.out.println("The number of words are: "+(word+1));	
		System.out.println("The number of characters are: "+line);	
	}

}
