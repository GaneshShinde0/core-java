package com.ganesh.practice;

import java.util.Scanner;

public class ReverseVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		char[] charArray = input.toCharArray();
		int i = 0, j = input.length() - 1;
		while (i < j) {
			while (("aeiouAEIOU".indexOf(charArray[i]) == -1)) {
				i++;
			}
			while (("aeiouAEIOU".indexOf(charArray[j]) == -1)) {
				j--;
			}
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		System.out.println(new String(charArray));
	}

}
