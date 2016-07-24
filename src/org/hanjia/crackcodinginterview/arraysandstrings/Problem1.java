package org.hanjia.crackcodinginterview.arraysandstrings;

/**
 * 
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * 
 * @author hanjia
 *
 */
public class Problem1 {
	public boolean checkUniqueCharacter(String string) {
		boolean[] charSet = new boolean[256];
		for (int i = 0; i < string.length(); i++) {
			int asciiCode = string.charAt(i);
			if (charSet[asciiCode])
				return false;
			charSet[asciiCode] = true;			
		}		
		return true;
	}
	
	public boolean checkUniqueCharacterBetter(String string) {
		int bitSet = 0;
		for (int i = 0; i < string.length(); i++) {
			int asciiCode = string.charAt(i);
			if ((bitSet & (1 << asciiCode)) != 0)
				return false;
			bitSet |= 1<< asciiCode; // Inclusive OR and assignement 
		}
		return true;
	}
	
	public static void main(String[] args) {
		Problem1 problem1 = new Problem1();
		String string = "abcdefga";
		System.out.println(problem1.checkUniqueCharacter(string));
		System.out.println(problem1.checkUniqueCharacterBetter(string));
	}
}
