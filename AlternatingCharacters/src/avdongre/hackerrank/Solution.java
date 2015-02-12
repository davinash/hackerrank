package avdongre.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int size;
		size = Integer.parseInt(in.nextLine());
		String [] input = new String[size];
		for( int i = 0; i < size; i++) {
			input[i] = in.nextLine();
		}
		
		for( int i = 0; i < size; i++) {
			System.out.println(solve(input[i]));
		}
/*		System.out.println(solve("AAAA"));
		System.out.println(solve("BBBBB"));
		System.out.println(solve("ABABABAB"));
		System.out.println(solve("BABABA"));
		System.out.println(solve("AAABBB"));*/
		
		
	}

	private static int solve(String input) {
		int deleteCounter = 0;
		if ( input.length() == 0) {
			return 0;
		}
		char ch = input.charAt(0);
		for ( int i = 1; i < input.length()  ; i++) {
			if ( input.charAt(i) == ch) {
				deleteCounter++;
			} else {
				ch = input.charAt(i);
			}
		}
		return deleteCounter;
	}
}