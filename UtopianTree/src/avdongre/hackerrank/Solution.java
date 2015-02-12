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
		int testCases = Integer.parseInt(in.nextLine());
		int[] inputArray = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			inputArray[i] = Integer.parseInt(in.nextLine());
		}

		int[] outputArray = new int[testCases];
		Arrays.fill(outputArray, 1);

		
		for (int i = 0; i < testCases; i++) {
			boolean flip = true;
			for (int k = 0; k < inputArray[i]; k++) {
				if (inputArray[i] == 0) {
					outputArray[i] = 1;
				} else {
					if (flip) {
						outputArray[i] = outputArray[i] * 2;
						flip = false;
					} else {
						outputArray[i] = outputArray[i] + 1;
						flip = true;
					}
				}
			}
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(outputArray[i]);
		}
	}
}
