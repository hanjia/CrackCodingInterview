package org.hanjia.crackcodinginterview.arraysandstrings;

/**
 * 
 * Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as five characters, including the null character.)
 * 
 * @author hanjia
 *
 */
public class Problem2 {
	public String reversetString(String string) {
		char[] charArray = string.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {
			char temp = charArray[start];
			charArray[start++] = charArray[end];
			charArray[end--] = temp;
		}		
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		Problem2 problem = new Problem2();
		String string = "abs";
		System.out.println(problem.reversetString(string));
	}
}
