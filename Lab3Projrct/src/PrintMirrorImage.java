/*
 * Name : Apoorva S Kulkarni
 * Description : To get a string as input, produce its mirror image and display both with | in between them 
 * Date : 20/3/2021 
 */

import java.util.Scanner;
public class PrintMirrorImage {

	public static void main(String[] args) {
		StringBuilder mirrorImage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = sc.next();
		
		mirrorImage = getMirrorImage(inputString);
		System.out.println(inputString+"|"+mirrorImage);
	}

	private static StringBuilder getMirrorImage(String inputString) {
		StringBuilder input = new StringBuilder();
		input.append(inputString);
		input.reverse();
		return input;
	}

}
