// VOWEL COUNT

// Using JAVA, create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VowelCount {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String strng = input.nextLine();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm = vowelCount(strng);
		Set<?> set = hm.entrySet();
		Iterator<?> i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+": "+me.getValue());
		}
	}
	public static HashMap<Character, Integer> vowelCount(String strng){
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		strng = strng.toLowerCase();
		for(int i = 0; i < strng.length();i++){
			if(strng.charAt(i)=='a')
				counta++;
			else if(strng.charAt(i)=='e')
				counte++;
			else if(strng.charAt(i)=='i')
				counti++;
			else if(strng.charAt(i)=='o')
				counto++;
			else if(strng.charAt(i)=='u')
				countu++;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', counta);
		hm.put('e', counte);
		hm.put('i', counti);
		hm.put('o', counto);
		hm.put('u', countu);
		return hm;
	}
}

