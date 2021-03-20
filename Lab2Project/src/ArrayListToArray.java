/*
 * Name : Apoorva S Kulkarni
 * Description : Converting Array list to Array
 * Date : 19/3/2021 
 */

import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList();
		arrayList.add("Java");
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Python");
		arrayList.add("C#");
		
		String[] arrayOutput = new String[arrayList.size()];
		
		for (int i = 0; i < arrayList.size(); i++) 
            arrayOutput[i] = arrayList.get(i); 
  
        for (String x : arrayOutput) 
            System.out.print(x + " "); 
	}

}
