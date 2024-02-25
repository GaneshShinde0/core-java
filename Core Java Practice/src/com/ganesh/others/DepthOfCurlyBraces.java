package com.ganesh.others;

public class DepthOfCurlyBraces {

	public static void main(String[] args) {
		String input ="{{{}}}";
//		if (args.length < 1) {
//			System.out.println("Please provide a string input.");
//			return;
//		}

		System.out.println("The maximum depth level is " + levelCount(input));
	}

	public static int levelCount(String word) {
		int current = 1;
		int max = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == '{') {
				current++;
			} else if (word.charAt(i) == '}') {
				if (current >= max) {
					max = current;
				}
				current--;
			}
		}
		return max-1;
	}
}
